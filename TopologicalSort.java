import java.util.*;

/**
 *
 * @author harshal
 */
public class TopoLogicalSort {

    static boolean[] visited;
    static Stack s = new Stack();
    static LinkedList[] adjl;

    static void topologicalSort(int v) {
        visited[v] = true;
        Iterator itr = adjl[v].iterator();
        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            if (visited[x] == false) {
                topologicalSort(x);
            }

        }
        s.push(v);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 6;
        int m = 6;
        adjl = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjl[i] = new LinkedList();
        }

        adjl[5].add(2);
        adjl[5].add(0);
        adjl[4].add(0);
        adjl[4].add(1);
        adjl[2].add(3);
        adjl[3].add(1);
        visited = new boolean[n];
        //int source =0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                topologicalSort(i);
            }
        }
        Iterator itr = s.iterator();
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

}
