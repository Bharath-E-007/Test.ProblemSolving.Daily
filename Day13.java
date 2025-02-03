import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[][] = new String[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++)
                str[i][j] = sc.next();
        }
        String s = sc.next();
        int sum = 0;
        for (char c : s.toCharArray()) {
            int i = 0, j = 0;
            String s1 = String.valueOf(c);
            loop1: for (i = 1; i < 6; i++) {
                for (j = 1; j < 6; j++) {
                    if (s1.compareTo(str[i][j]) == 0)
                        break loop1;
                }
            }
            sum += sum(i, j, str);
        }
        System.out.println(sum);
        sc.close();
        System.exit(0);
    }

    public static int sum(int i, int j, String[][] s) {
        return Int(s[i][0]) + Int(s[i][6]) + Int(s[0][j]) + Int(s[6][j]);
    }

    public static int Int(String s) {
        return Integer.parseInt(s);
    }
}
/*Example Input/Output 1:

Input:

1234567

3abcde2

4jihgf4

8knqtw8

9lorux1

5mpsvy4

1236987

boating

Output:

124

Explanation:

1st alphabet: b ->

(3 + 2 + 3 + 3) = 11

2nd alphabet: o->

(3 + 1 + 3 + 9) = 16

3rd alphabet: a ->

(2 + 2 + 2 + 3) = 9

4th alphabet:

/-> (5 + 8 + 9 + 8) = 30 .

5th alphabet:

i -> (3 + 4 + 3 + 4) = 14

6th alphabet:

n -> (3 + 8 + 3 + 8) = 22

7th alphabet: 9 -> (5 + 4 + 9 + 4) = 22

The total sum is 124, which is printed as the output.*/
