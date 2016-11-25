
/**
 *
 * @author harshal
 */
public class FloydWarshal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a[][]={{0,3,999,4,999},{999,999,9,2,999},{999,999,0,999,999,999},{999,999,999,0,6},{999,3,1,999,0}
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
                   if(w[i][k]+w[k][j]<w[i][j])
                   {
                   w[i][j]=w[i][k]+w[k][j];
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
