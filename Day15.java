import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

int row=sc.nextInt(),col=sc.nextInt(); 
int mat[][]=new int[row][col];

for(int i=0;i<row;i++) 
for(int j=0;j<col;j++)
mat[i][j]=sc.nextInt();

int max=0,i1=0,j1=0,i3=0,j3=0; 


for(int i=0;i<row;i++){ 
    for(int j=0;j<col;j++){ 
        if(mat[i][j]==1){ 
            int count=0,i2=1,j2=j; 
            while(i2<row && j2<col && mat[i2][j2]==1){
                count++; i2++;j2++;

} if(count>max){ j1=j;j3=j2; 

max=count; i1=1;j3=12;
}

}

}

if(max==1){

System.out.println(-1);

System.exit(0);

}
while(i1<13){

  for(int j=j1;j<j3;j++) 

System.out.print(mat[i1][j]+" ");

System.out.println();

i1++;

}

System.exit(0);
}
}
}
/*Print The Submatrix of MAximum number OF 1 in daigonal from top-left to rigth-dowm */

