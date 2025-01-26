import java.util.*;
public class Day5 {
    static class C {
        int r, c;
        C(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt(), C = s.nextInt();
        int[][] m = new int[R][C];
        Map<Integer, C> p = new HashMap<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                m[i][j] = s.nextInt();
                p.put(m[i][j], new C(i, j));
            }
        }

        int N = s.nextInt(), t = 0;
        int[] path = new int[N];
        for (int i = 0; i < N; i++) path[i] = s.nextInt();

        boolean f = true;
        for (int i = 1; i < N; i++) {
            int cost = calc(m, p.get(path[i - 1]), p.get(path[i]));
            int prev = m[p.get(path[i - 1]).r][p.get(path[i - 1]).c];
            t += cost;
            if (!f) t -= prev;
            f = false;
        }
        System.out.println(t);
    }

    private static int calc(int[][] m, C s, C e) {
        if (s.r == e.r) {
            int sum = 0;
            for (int c = Math.min(s.c, e.c); c <= Math.max(s.c, e.c); c++) sum += m[s.r][c];
            return sum;
        }
        if (s.c == e.c) {
            int sum = 0;
            for (int r = Math.min(s.r, e.r); r <= Math.max(s.r, e.r); r++) sum += m[r][s.c];
            return sum;
        }
        int p1 = 0, p2 = 0;
        for (int c = Math.min(s.c, e.c); c <= Math.max(s.c, e.c); c++) p1 += m[s.r][c];
        for (int r = Math.min(s.r, e.r); r <= Math.max(s.r, e.r); r++) p1 += m[r][e.c];
        p1 -= m[s.r][e.c];

        for (int r = Math.min(s.r, e.r); r <= Math.max(s.r, e.r); r++) p2 += m[r][s.c];
        for (int c = Math.min(s.c, e.c); c <= Math.max(s.c, e.c); c++) p2 += m[e.r][c];
        p2 -= m[e.r][s.c];
        p2-=m[e.r] [s.c];
return Math.min(p1, p2);
}
}
/*The program must accept an integer matrix of size R*C and N integers as the input. 
All integers in the matrix are unique and the given N integers are always present in the matrix. 
The program must print the sum of all the integers present in the path by connecting the given 
  N integers in the matrix based on the following conditions.
- The path must be formed by connecting the given N integers in the order of their occurrence.

- Only horizontal and vertical movements are allowed.

- If two integers are present in the same row or column,
 then the two integers must be connected directly. 
 Else the two integers are connected by the path which has exactly one change in the direction and gives
  the minimum sum. 
  Input:

4 4

24 20 14 23 
15 10 18 13
12 26 25 16
19 21 11 22

3
21 11 22

Output:

96

Explanation:

The path must be formed by connecting the following three integers.

10-13-12

10 and 13 are present in the same row. So they are connected as 10 -> 18- > 13.

13 and 12 are NOT present in the same row or column. There are two possible ways to connect 13 and 12 which are given below.

13 -> 18 -> 10 -> 15 -> 12 (The sum of integers present in the path is 68).

13->16 -> 25 -> 26 -> 12 (The sum of integers present in the path is 92).

So the path with the minimum sum 68 is considered.

The entire path by connecting the given 3 integers is given below.

10->18- 13 -> 18 -> 10 -> 15 -> 12

The sum of integers present in the above path is 96, which is printed as the output.
  */