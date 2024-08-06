import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class DepthFirstSearch {

    int V;
    ArrayList <Integer> [] adj;

    DepthFirstSearch (int noOfVertex){
        V = noOfVertex;
        adj = new ArrayList[V];

        for (int i = 0; i<noOfVertex; i++){
            adj[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y){
        adj[x].add(y);
    }

    void DFS(int sourceVertex){

        boolean [] visited = new boolean[V];
        Stack <Integer> s1 = new Stack<>();

        s1.push(sourceVertex);
        int n;

        while(!s1.empty()) {
            sourceVertex = s1.peek();
            s1.pop();

            for (int i = 0; i < adj[sourceVertex].size(); i++) {
                n = adj[sourceVertex].get(i);
                if (!visited[n]) {
                    s1.push(n);
                }
            }

//            Iterator i = adj[sourceVertex].iterator();
//            while(i.hasNext()){
//                n = (int) i.next();
//                if (!visited[n]) {
//                    s1.push(n);
//                }
//            }

            if (visited[sourceVertex] == false) {
                System.out.print(sourceVertex + " ");
                visited[sourceVertex] = true;
            }
        }
    }
    public static void main(String[] args) {

        DepthFirstSearch g1 = new DepthFirstSearch(6);

        g1.edge(0,1);
        g1.edge(0,2);
        g1.edge(0,5);
        g1.edge(1,0);
        g1.edge(1,2);
        g1.edge(2,0);
        g1.edge(2,1);
        g1.edge(2,3);
        g1.edge(2,4);
        g1.edge(3,2);
        g1.edge(4,2);
        g1.edge(4,5);
        g1.edge(5,0);
        g1.edge(5,4);

        System.out.println("The result of DFS is =");

        g1.DFS(0);

    }
}
