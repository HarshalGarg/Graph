import java.util.*;

/**
 *
 * @author harshal
 */
class vertex
{
int key;
int priority;
int status;

vertex(int val)
{
    key=val;
    priority=0;
    status=0;
   }
}
class linkedlist{
linkedlist node;
vertex v;
int weight;
int size;
linkedlist()
{
size=0;
}
void addlast(vertex vert,int cost)
{
linkedlist a=new linkedlist();
a.node=null;
a.v=vert;
a.weight=cost;
if(this.node==null)
{
this.node=a;
}
else
{
    linkedlist l=this.node;
while(l.node!=null)
{
l=l.node;
}
l.node=a;


}
size++;
}
}
public class Djkstrafinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    PriorityQueue<vertex> heap = new PriorityQueue<vertex>(5, new Comparator<vertex>() {
	        public int compare(vertex u, vertex v) {
	            if( u.priority == v.priority ) return 0;
	            else if(u.priority > v.priority) return 1;
	            else return -1;
	        }
	    });
    vertex vert[]=new vertex[5];
	
	for(int i=0;i<5;i++){
	    vert[i]= new vertex(i);
	}
    linkedlist[] adjl=new linkedlist[5];
    for(int i=0;i<5;i++)
        adjl[i]=new linkedlist();
    
        adjl[0].addlast(vert[1],3);
        adjl[0].addlast(vert[3],4);
        adjl[1].addlast(vert[3],2);
        adjl[1].addlast(vert[2],9);
        adjl[3].addlast(vert[4],6);
        adjl[4].addlast(vert[1],3);
        adjl[4].addlast(vert[2],1);

        System.out.println("enter source");
        Scanner sc=new Scanner(System.in);
        int source=sc.nextInt();
        heap.add(vert[source]);
        while(!heap.isEmpty())
        {
        vertex u=heap.poll();
        u.status=2;
        linkedlist l=adjl[u.key].node;
        while(l!=null)
        {
            int c=u.priority+l.weight;
        if(l.v.status==0)
        {
        
        l.v.priority=c;
        l.v.status=1;
        heap.add(l.v);
        }
        else{
            if(l.v.status==1&&l.v.priority>c)
            {
            heap.remove(l.v);
            l.v.priority=c;
            heap.add(l.v);
        
            }
        }    
            l=l.node;
        } 
        }
        for(int i=0;i<5;i++){
	           System.out.println(vert[i].priority);
	}
    
    }
    
}
