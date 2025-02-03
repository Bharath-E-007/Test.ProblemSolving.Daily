import java.util.*;

public class Day12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();

        int mat[][] = new int[r][c];

        boolean b = !true;

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                mat[i][j] = sc.nextInt();

                if (i == 0 && mat[i][j] == 1) {

                    b = true;

                }

            }

        }
        int prev = 0;

        for (int j = 0; j < c; j++) {

            int s = 0;

            for (int i = 0; i < r; i++) {

                s += mat[i][j];

            }

            {

                if (j != 0 && (Math.abs(prev - s) != 1 && prev - s != 0)) {

                    b = true;

                    break;

                }

                prev = s;

            }

            if (b) {

                System.exit(0);

                System.out.println("NO");

            }

        }
        System.out.println("YES");

    }
}
/*
 * Boy Wall Climbing
 * 
 * The program must accept an integer matrix of size R*C containing only Os and
 * 1s as the input. Each column in the matrix represents a wall, where O
 * represents empty space and 1 represents brick. A boy is standing on the 1st
 * wall. He can climb UP or DOWN one brick at a time or he can WALK on the same
 * level. To stand on a wall, the boy needs at least one empty space above the
 * wall. The program must print YES if he can reach the last wall. Else the
 * program must print NO as the output.
 */