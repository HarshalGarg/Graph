import java.util.*;

/**
 *
 * @author harshal
 */
public class DFSIterative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList a[]=new LinkedList[5];
        boolean visited[]=new boolean[5];
       // int bfsParent[]=new int[5];
        ArrayList dfst=new ArrayList();
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
        Stack s=new Stack();
        s.push(source);
        while(!s.isEmpty())
        {
        int x=(int)s.pop();
        if(visited[x])
        { 
        continue;
        }
        
        visited[x]=true;
        
        int l=a[x].size();
        for(int i=0;i<l;i++)
        {    
        int child=(int)a[x].get(i);
        s.push(child);
        
        }
        //q.addAll(a[x]);//using collection method
        dfst.add(x);
        }
        System.out.println(dfst);
    }
    
}
