import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r - 1][c - 1];
        int col[] = new int[c];
        int row[] = new int[r];

        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < c; j++) {
            col[j] = sc.nextInt();
        }

        for (int i = 0; i < r; i++) {
            row[i] = sc.nextInt();
        }
        int c1 = -1, r1 = -1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (col[j] == row[i]) {
                    c1 = j;
                    r1 = i;
                    break;
                }
            }
        }

        for (int i = 0; i < r - 1; i++) {
            if (i == r1) {
                for (int j = 0; j < c; j++) {
                    System.out.print(col[j] + " ");
                }
                System.out.println();
            }

            for (int j = 0; j < c - 1; j++) {
                System.out.print(mat[i][j] + " ");
                if (j == c1 - 1) {
                    System.out.print(row[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
