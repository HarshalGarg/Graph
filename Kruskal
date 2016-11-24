import java.util.*;

/**
 *
 * @author harshal
 */
class edge{
    int weight;
    int u,v;
    edge(int u,int v,int weight)
    {
        this.weight = weight;
        this.u = u; this.v = v;
    }
}

public class KruskalFinal {

    /**
     * @param args the command line arguments
     */
    static int[] uf=new int[6];
    static int[] rank=new int[6];
    static int find(int x)          //find the first element(leader) of the set to which x belongs
    {
        if( x != uf[x] )
            uf[x] = find( uf[x] );
        return uf[x];
    
 
    }
    static boolean union(int x,int y)         //says whether x and belongs to same set or not
    {
    int xx = find( x ), yy = find( y );
    if( xx == yy )
        return false;
    if( rank[xx] > rank[yy] )   //to make xx always smaller depth
    {
        int t = xx; xx = yy; yy = t; 
    }
    if( rank[xx] == rank[yy] )
        rank[yy]++;
    uf[xx] = yy;
    return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    
      int m=6;  //no of edges
      int n=6;   //no of vertex
      PriorityQueue<edge> heap = new PriorityQueue<edge>(m, new Comparator<edge>() {
	        public int compare(edge u, edge v) {
	            if( u.weight == v.weight ) return 0;
	            else if(u.weight > v.weight) return 1;
	            else return -1;
	        }
	    });
      edge[] edges=new edge[m];
      edges[0]=new edge(0,2,6);
      edges[1]=new edge(0,5,4);
      edges[2]=new edge(5,3,4);
      edges[3]=new edge(3,2,2);
      edges[4]=new edge(1,2,7);
      edges[5]=new edge(1,4,9);
      for(int i=0;i<m;i++)
      {
      heap.add(edges[i]);
      }
      for( int i = 0; i < n; i++ )
          uf[i] = i;
    
    int t= n, sum = 0;
    for( int i = 0; i < m && t> 1; i++ ) {
        edge e=heap.poll();
    if( union( e.u, e.v ) ) 
    {
    t--;
    sum += e.weight;
}
}
        System.out.println(sum);
    }
    
}
