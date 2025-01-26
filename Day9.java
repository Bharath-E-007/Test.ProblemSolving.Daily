import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        String a = "abcdefghijklmnop qrstuvwxyz";
        String alpha[] = new String[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = a.substring(i) + a.substring(0, 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            int r = s1.charAt(i) - 'a', c = s2.charAt(i) - 'a';
            sb.append(alpha[r].charAt(c));
        }
        System.out.println("\n" + sb);
        System.exit(0);
    }
}
/*
 * Example Input/Output 1:
 * Input:
 * 
 * pollution
 * wrestling
 * Output:
 * ifpdneqbt
 * 
 * Explanation:
 * The 26*26 matrix is given below.
 * abcdefghijklmnopqrstuvwxyz
 * bcdefghijklmnopqrstuvwxyza
 * cdefghijklmnopqrstuvwxyzab
 * defghijklmnopqrstuvwxyzabc
 * efghijklmnopqrstuvwxyzabcd
 * fghijklmnopqrstuvwxyzabcde
 * ghijklmnopqrstuvwxyzabcdef
 * hijklmnopqrstuvwxyzabcdefg
 * ijklmnopqrstuvwxyzabcdefgh
 * jklmnopqrstuvwxyzabcdefghi
 * klmnopqrstuvwxyzabcdefghij
 * Imnopqrstuvwxyzabcdefghijk
 * nopqrstuvwxyzabcdefghijklm
 * opqrstuvwxyzabcdefghijklmn
 * pqrstuvwxyzabcdefghijklmno
 * qrstuvwxyzabcdefghijklmnop
 * rstuvwxyzabcdefghijklmnopq
 * tuvwxyzabcdefghijklmnopqrs
 * uvwxyzabcdefghijklmnopqrst
 * vwxyzabcdefghijklmnopqrstu
 * wxyzabcdefghijklmnopqrstuv
 * xyzabcdefghijklmnopqrstuvw
 * yzabcdefghijklmnopqrstuvwx
 * mnopqrstuvwxyzabcdefghijkl
 * stuvwxyzabcdefghijklmnopqr
 * zabcdefghijklmnopqrstuvwxy
 * The intersection of p and w contains I.
 * So I is printed.
 * The intersection of o and r contains f.
 * So f is printed.
 * Similarly, the remaining characters are printed as the output.
 */