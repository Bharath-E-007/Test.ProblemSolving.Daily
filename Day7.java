import java.util.*;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        String[][] str = new String[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                str[i][j] = sc.next();
            }
        }
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                try {
                    Integer.parseInt(str[i][j]);
                } catch (Exception e) {
                    transpose(i - 1, j - 1, str);
                }
            }
        }
        for (String[] s : str) {
            for (String s1 : s) {
                System.out.print(s1 + " ");
            }
            System.out.println();
        }

        System.exit(0);
    }

    public static void transpose(int i1, int j1, String[][] str) {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int x1 = i1 + i;
                int y1 = j1 + j;
                int x2 = i1 + j;
                int y2 = j1 + i;
                String temp = str[x1][y1];
                str[x1][y1] = str[x2][y2];
                str[x2][y2] = temp;
            }
        }
    }
}
/*
 * Example Input/Output 1:
 * 
 * Input:
 * 
 * 98
 * 
 * 80945133
 * 
 * 4a813364
 * 
 * 3262H943
 * 
 * 69773458
 * 
 * 41069197
 * 
 * 14K34969
 * 
 * 11262002
 * 
 * 423665Z9
 * 
 * 50880934
 * 
 * Output:
 * 
 * 84345133
 * 
 * 0a212764
 * 
 * 9863H343
 * 
 * 69739458
 * 
 * 41419197
 * 
 * 10K24969
 * 
 * 16362059
 * 
 * 423660Z3
 * 
 * 50880294
 */
