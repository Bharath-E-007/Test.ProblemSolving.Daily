import java.util.*;
public class Day14 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int r=sc.nextInt(),c=sc.nextInt();
         int m1[]=new int[r];
         int m2[]=new int[c];
         for(int i=0;i<r;i++){
            m1[i]=1001;
            for(int j = 0 ;j<c;j ++){
               int val=sc.nextInt ();
               m1[i]=Math.min (m1[i],val);
           }
        }
        for(int i = 0 ;i<r;i++) {
           for(int j = 0 ;j<c;j ++){
              if(m2[j]==0){
                 m2[j] = 1001 ;
          }
        int val=sc.nextInt ();
        m2[j]=Math.min (m2[j],val);
         }
        
     }
        
     for(int i = 0 ;i<r;i++){
           for(int j = 0 ;j<c;j++)
              System.out.print (Math.min(m1[i] ,m2[j])+" ");
         System.out.println();
        
     }
    }
}
/*
 * Accept The Two 2d Matrix and return The new Matrix by Taking The min the row of First matrix and column of second matrix

 * /
