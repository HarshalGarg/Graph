import java.util.*;

/**
 *
 * @author harshal
 */
public class DFSRecursive {
 static boolean visited[]=new boolean[5];
  static LinkedList a[]=new LinkedList[5];
   static  ArrayList dfst=new ArrayList();
           /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean visited[]=new boolean[5];
       // int bfsParent[]=new int[5];
       
        for(int i=0;i<5;i++)
        a[i]=new LinkedList();
        a[0].addLast(1);
        a[0].addLast(3);
        a[1].addLast(3);
        a[3].addLast(4);
        a[4].addLast(1);
        a[4].addLast(2);
        a[1].addLast(2);
       System.out.println("enter source");
        Scanner sc=new Scanner(System.in);
        int source=sc.nextInt();
        DFS_Visit(source);
        dfst.add(source);
        System.out.println(dfst);
    }

     static void DFS_Visit(int s) {
    visited[s]=true;   
    int l=a[s].size();
        for(int i=0;i<l;i++)
        {    
        int child=(int)a[s].get(i);
        if(visited[child]==false)
        {
            dfst.add(child);
            DFS_Visit(child);
        }
        }
     }
    
}
