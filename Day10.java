import java.util.*;

public class Day10 {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

String pattern[]=new String[4];

for(int i=0;i<4;i++)

pattern[i]=sc.nextLine();

int i=0;

String key=sc.nextLine();

I

for(char bits: key.toCharArray()){

int n=Character.getNumericValue(bits);

String s1=String.format("%s", Integer.toBinaryString(n)).replace(' ','0');

String s2="";
for(String s3: pattern) {

s2+=s3.charAt(i);

}

i++;

if(!s1.equals(s2)){

System.out.println("NO");

System.exit(0);

}

}

System.out.println("YES");

System.exit(0);

}

}
/* bit pattern problem */