import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        System.out.println(maxLongest(str));
    }

    public static String maxLongest(String s) {
        int maxl = 0, maxs = 0;
        int curl = 1, curs = 0;
        for (int i = 1; i < s.length(); i++) {
            int c = Character.getNumericValue(s.charAt(i)), p = Character.getNumericValue(s.charAt(i - 1));
            if (c % 2 != p % 2) {
                curl++;
            } else {
                if (curl > maxl) {
                    maxl = curl;
                    maxs = curs;
                }
                curs = i;
                curl = 1;
            }
        }
        if (maxl < curl) {
            maxs = curs;
            maxl = curl;

        }
        return s.substring(maxs, maxs + maxl);
    }
}
/*
 * Example Input/Output 1:
 * 
 * Input:
 * 
 * 336535383274365585552449775932
 * 
 * Output: 383274365
 * 
 * Explanation:
 * 
 * Here the given string is 336535383274365585552449775932.
 * 
 * The longest substring with alternating odd/even digits is highlighted below.
 * 336535383274365585552449775932 So 383274365 is printed as the output.
 * 
 * Example Input/Output 2:
 * 
 * Input: 001234567890098765432100
 * 
 * Output: 01234567890
 */