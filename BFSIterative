import java.util.*;

/**
 *
 * @author harshal
 */
public class BFSIterative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  //remove comments to use bfsParent
        // TODO code application logic here
      LinkedList a[]=new LinkedList[5];
        boolean visited[]=new boolean[5];
    //    int bfsParent[]=new int[5];
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
        int s=sc.nextInt();
        ArrayList q=new ArrayList();
        ArrayList bfst=new ArrayList();
        q.add(s);
        
        while(!q.isEmpty())
        {
        int x=(int)q.remove(0);
        int l=a[x].size();
        for(int i=0;i<l;i++)
        {    
        int parent=(int)a[x].get(i); 
        if(visited[parent]==false)
        {
        q.add(parent);
      //  bfsParent[parent]=x;
         visited[parent]=true;
        }
        }
        //q.addAll(a[x]);//using collection method
        bfst.add(x);
        visited[x]=true;
                
        }        
     /*   System.out.println(bfst);
        for(int i=0;i<bfsParent.length;i++)
        {
            System.out.println(i+"="+bfsParent[i]);
        }*/
    }
    
}
