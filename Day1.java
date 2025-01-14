
import java.util.*;
public class Day1 {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt(),col=sc.nextInt();
  int mat[][]=new int[row][col];
  for(int i=0;i<row;i++)
      for(int j=0;j<col;j++)
        mat[i][j]=sc.nextInt();
  for(int i=0;i<col-1;i+=2){
    int unit=mat[0][i]%10;
    int prev=mat[0][i];
    for(int k=0;k<row;k++){
      if(mat[k][1+1]%10==unit){ 
      int temp=prev;
      prev=mat[k][i+1];
      mat[k][i+1]=temp;
    }
}
  for(int k=row-1;k>0;k--){
    if(mat[k][i]%10==unit){ 
      int temp=prev; 
      prev=mat[k][i];
      mat[k][i]=temp;
   }
}
mat[0][i]=prev;
}
for(int[] arr:mat){
  for(int val:arr) 
     System.out.print(val+" "); 
  System.out.println();
}
System.exit(0);
  }
}
/*2 <= R, C <= 50
1 Matrix element value <= 10^5
Input Format:
The first line contains R and C separated by a space.
The next R lines, each contains C integer values separated by a space.
Output Format:
The first R lines, each contains C integer values separated by a space.

Example Input/Output 1:
Input:
4 5
607 224 711 489 578
127 987 808 343 479
37 226 563 982 21
426 587 917 547 31
Output:

127 224 711 489 578
37 607 808 343 479
587 226 563 982 21
426 987 917 547 31

Explanation:
The first pair column values are as below.
607 224
127 987
37 226
426 587
The top left value is 607. The unit digit is 7. The values with 7 as the unit digit are 607 987 587 37 127.
So after rotating them in clockwise direction by 1 position, the values are
127 224
37 607
587 226
426 987
The second pair column values are as below.
711 489
808 343
563 982
917 547
The top left value is 711. The unit digit is 1. The values with 1 as the unit digit are 711.
So after rotating them in clockwise direction by 1 position, the values are
711 489
808 343
563 982
917 547
Here as there is only one value, the rotation does not change any values.

The fifth column does not have a pair and hence printed as such.

Example Input/Output 2:

Input:
4 4

18 76 35 22
30 53 16 65
21 56 25 24
59 28 25 24

Output:

28 76 25 22
30 53 16 35
21 56 2 65
59 18 5 24
Max Execution Time Limit: 50 millisecs */
