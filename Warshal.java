**
 *
 * @author harshal
 */
public class Warshal {

    public static void main(String[] args) {

         int a[][]={{0,1,999,1,999},{999,999,1,1,999},{999,999,0,999,999,999},{999,999,999,0,1},{999,1,1,999,0}
    };
     
       int n=5;
       int m=7;
       int w[][]=new int[n][n];
       w=a.clone();
       for(int k=0;k<n;k++)
       {
           for(int i=0;i<n;i++)
           {
               for(int j=0;j<n;j++)
               {
                   if(w[i][k]==1 &&w[k][j]==1)
                   {
                   w[i][j]=1;
                   }
               }
           }
       }
       for(int k=0;k<n;k++){
           for(int i=0;i<n;i++)
               System.out.print(w[k][i]+" ");
           System.out.println("");
       }
       }
    
}

    
