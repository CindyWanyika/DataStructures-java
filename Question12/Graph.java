package Question12;

import java.util.ArrayList;
import java.util.Collections;


public class Graph {
    private ArrayList<ArrayList<Integer>> adjacencyList=new ArrayList<>();
    private int vertices;
    private boolean[] visited;
    private int count=0;

    public Graph(int vertices){
        this.vertices=vertices;
        for(int i=0;i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }
        visited= new boolean[vertices];
    }

    public void addEdge(int start,int end){
        adjacencyList.get(start).add(end);
        Collections.sort(adjacencyList.get(start));
        adjacencyList.get(end).add(start);
        Collections.sort(adjacencyList.get(end));
    }

    public void dfs(int start){
        dfsTraversal(start);
        if(count==vertices) {
            boolean[] v = new boolean[vertices];
            this.visited = v;
        }
    }
    public void bfs(int start){
        ArrayList<Integer> queue=new ArrayList<>();
        queue.add(start);
        visited[start]=true;
        while(queue.size()>0){
            int current= queue.get(0);
            System.out.println(current);
            queue.remove(0);
            ArrayList<Integer> neighbours=adjacencyList.get(current);
            for(int neighbour:neighbours){
                if(visited[neighbour]==false){
                    queue.add(neighbour);
                    visited[neighbour]=true;
                }
                count++;
            }
        }
        System.out.println("Done");
        boolean[] v = new boolean[vertices];
        this.visited = v;
    }

    public void dfsTraversal(int start){
        visited[start]=true;
        System.out.println(start);
        ArrayList<Integer> neighbours=adjacencyList.get(start);
        for (int neighbour:neighbours){
           if(visited[neighbour]==false){
               dfsTraversal(neighbour);
           }
        }

    }

    public void displayList(){
        for(int i=0;i<vertices;i++){
            ArrayList<Integer> neighbours=adjacencyList.get(i);
            System.out.print(i+": ");
            for (Integer curr:neighbours){
                System.out.print(curr+" ");
            }
            System.out.print("\n");
        }
    }


}
