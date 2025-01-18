import java.util.*;
public class Day4 {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String str[]=new String[5];
  for(int i=0;i<5;i++)
    str[i]=sc.nextLine(); 
  for(int i=0;i<8;i+=4){
       System.out.print(Time(str,i,i+3));
    }
   System.out.print(":"); 
    for(int i=10;i<17;i+=4){
      System.out.print(Time(str,i,i+3));
    }
System.exit(0);
}
public static String Time(String str[], int s, int e) {
    boolean found = true;

    if (Equals(str[0].substring(s, e), "111") && Equals(str[4].substring(s, e), "111")) {
        for (int i = 1; i < 4; i++) {
            if (!Equals(str[i].substring(s, e), "101")) {
                found = false;
            }
        }
        if (found) return "0";
        found = true;
    }

    if (Equals(str[0].substring(s, e), "001")) {
        for (int i = 1; i < 5; i++) {
            if (!Equals(str[i].substring(s, e), "001")) {
                found = false;
            }
        }
        if (found) return "1";
        found = true;
    }

    if (Equals(str[3].substring(s, e), "100") && Equals(str[1].substring(s, e), "001")) {
        for (int i = 0; i < 5; i += 2) {
            if (!Equals(str[i].substring(s, e), "111")) {
                found = false;
            }
        }
        if (found) return "2";
        found = true;
    }

    if (Equals(str[1].substring(s, e), "001") && Equals(str[3].substring(s, e), "001")) {
        for (int i = 0; i < 5; i += 2) {
            if (Equals(str[i].substring(s, e), "111")) {
                found = false;
            }
        }
        if (found) return "3";
        found = true;
    }

    if (Equals(str[0].substring(s, e), "101") && Equals(str[1].substring(s, e), "101")
            && Equals(str[2].substring(s, e), "111") && Equals(str[3].substring(s, e), "001")
            && Equals(str[4].substring(s, e), "001")) {
        return "4";
    }

    if (Equals(str[1].substring(s, e), "100") && Equals(str[3].substring(s, e), "001")) {
        for (int i = 0; i < 5; i += 2) {
            if (!Equals(str[i].substring(s, e), "111")) {
                found = false;
            }
        }
        if (found) return "5";
        found = true;
    }

    if (Equals(str[1].substring(s, e), "100") && Equals(str[3].substring(s, e), "101")) {
        for (int i = 0; i < 5; i += 2) {
            if (!Equals(str[i].substring(s, e), "111")) {
                found = false;
            }
        }
        if (found) return "6";
        found = true;
    }

    if (Equals(str[0].substring(s, e), "111")) {
        for (int i = 1; i < 5; i++) {
            if (!Equals(str[i].substring(s, e), "001")) {
                found = false;
            }
        }
        if (found) return "7";
        found = true;
    }

    if (Equals(str[1].substring(s, e), "101") && Equals(str[3].substring(s, e), "101")) {
        for (int i = 0; i < 5; i += 2) {
            if (!Equals(str[i].substring(s, e), "111")) {
                found = false;
            }
        }
        if (found) return "8";
    }

    // Default case: if no condition matches, return "9"
    return "9";
}

public static boolean Equals(String s1, String s2){
     return s1.equals(s2);
   }
}