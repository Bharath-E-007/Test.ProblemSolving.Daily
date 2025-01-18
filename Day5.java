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