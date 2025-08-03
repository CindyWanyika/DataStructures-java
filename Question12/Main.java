package Question12;

public class Main {
    public static void main(String[] args){
        Graph myGraph=new Graph(5);
        myGraph.addEdge(0,4);
        myGraph.addEdge(0,3);
        myGraph.addEdge(1,4);
        myGraph.addEdge(1,2);
        myGraph.addEdge(3,1);
        myGraph.addEdge(2,4);

        //myGraph.displayList();

        myGraph.bfs(0);

        myGraph.dfs(0);
    }
}
