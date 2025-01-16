import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                mat1[i][j] = sc.nextInt();
           
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++) 
                mat2[i][j] = sc.nextInt();
        
        int T = sc.nextInt();
        for (int i = 0; i <= r1 - T; i++) {
            for (int j = 0; j <= c1 - T; j++) {
                if (find(i, j, mat1, mat2, T)) {
                    for (int i1 = 0; i1 < T; i1++) {
                        for (int j1 = 0; j1 < T; j1++) {
                            System.out.print(mat1[i + i1][j + j1] + " ");
                        }
                        System.out.println();
                    }
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static boolean find(int i, int j, int[][] mat1, int[][] mat2, int T) {
        int r = mat2.length, c = mat2[0].length;
        for (int i1 = 0; i1 <= r - T; i1++) {
            for (int j1 = 0; j1 <= c - T; j1++) {
                if (mat2[i1][j1] == mat1[i][j]) {
                    int count = 0;
                    for (int i2 = 0; i2 < T; i2++) {
                        for (int j2 = 0; j2 < T; j2++) {
                            if (mat1[i + i2][j + j2] == mat2[i1 + i2][j1 + j2]) {
                                count++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (count == T * T) return true;
                }
            }
        }
        return false;
    }
}
/* Given an two matrices different length 2D matrix then return T*T Matrices 
 * common in the two matrices else retuen -1 */
