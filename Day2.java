import java.util.*;
public class Day2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
sc.nextLine();
String[] name=new String[num];
int[][] time=new int[num][2];
for(int i=0;i<num; i++){
  String str[]=sc.nextLine().split(" ");
  name[i]=str[0]; time[i][0]=Time(str[1]); 
  time[i][1]=Time(str[2]); 
}
String time1=sc.nextLine();
int main=Time(time1);
boolean found=true;
for(int i=0;i<num;i++){
  for(int j=i+1;j<num;j++){ 
     if(time[i][0]>time[j][0] || (time[i][0]==time[j][0] && name[i].compareTo(name[j])>0)){
  }
}
}
for(int i=0;i<num;i++){ 
    if(True(time,i,main)){ 
        System.out.println(name[i]); 
        found=false;
     }
} 
  if(found) 
   System.out.println(-1); System.exit(0);

}
public static int Time(String s){ 
    String s1[]=s.split(":");
    return Integer.parseInt(s1[0])*60+Integer.parseInt(s1[1]);

}
public static boolean True(int time[][],int i,int val){ 
    return time[i][0]<=val && time[i][1]>val;
}
public static void swap(int time[][], int i,int j){
  int t1=time[i][0];
  time[i][0]=time[j][0];
  time[j][0]=t1;
  int t2=time[i][1];
  time[i][1]=time[j][1];
  time[j][1]=t2;
   }
}
/*Example Input/Output 1:
Input:
5
Arun 09:05 09:15
John 09:02 09:30
Babloo 09:20 10:00
Deepa 09:10 09:25
Gavin 08:45 09:10
09:10

Output:
John
Arun
Deepa
Explanation:
Here the given time T is 09:10.
The persons who are online at 09:10 are given below.
Arun
John
Deepa
So their names are printed based on the given conditions.
Hence the output is
John
Arun
Deepa */
