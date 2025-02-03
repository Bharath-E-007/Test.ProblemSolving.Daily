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