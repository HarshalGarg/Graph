
/**
 *
 * @author harshal
 */
public class BellmanFord { //for dense graph. for sparse use adjacency list complexity will be same

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a[][]={{0,3,999,4,999},{999,999,9,2,999},{999,999,0,999,999,999},{999,999,999,0,6},{999,3,1,999,0}
    };
     
       int n=5;
       int m=7;
    int d[]=new int[n];
    int source=0;
     for(int j=0;j<n;j++)
        {
            d[j]=a[source][j];
        }
     for(int k=1;k<n;k++)
     {
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
             if(a[i][j]<999)
             {
                 if(d[i]+a[i][j]<d[j])
                     d[j]=d[i]+a[i][j];
             }
             }
         }
     
     
     }
     for(int i=0;i<n;i++)
     {
     if(d[i]>=999)
     {
         System.out.println("no path from source to"+i);
         continue;}
     else
             System.out.println("distance from source to "+i+"="+d[i]);
     
     }
    }
    
    
}
