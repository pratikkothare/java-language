import java.util.*;
public class creatingGraph {

    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w){
            this.source=s;
            this.destination=d;
            this.weight=w;
        }
    }
    public static void main(String[] args) {
        int v=5;//no. of vertex;


        //    (5)
        // 0--------1
        //         / \
        //    (1) /   \(3)
        //       /     \
        //      2-------3
        //      |  (1)
        //   (2)|
        //      | 
        //      4 


    //int arr[]=new int[5];
    ArrayList<Edge> graph[]=new ArrayList[v];
    createGraph(graph);

    //BFS(graph);
    DFS(graph,0,new boolean[v]);
    } 
    
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();//initally sare index null th, to usko empt arraylist se assign kiya
    }

    //adding 0th vertex
    graph[0].add(new Edge(0,1,5));

    //1st vertex
    graph[1].add(new Edge(1,0,5));
    graph[1].add(new Edge(1,2,1));
    graph[1].add(new Edge(1,3,3));

    //2nd verex
    graph[2].add(new Edge(2,1,1));
    graph[2].add(new Edge(2,3,1));
    graph[2].add(new Edge(2,4,2));

    //3rd vertex
    graph[3].add(new Edge(3,1,3));
    graph[3].add(new Edge(3,2,1));

    //4th vertex
    graph[4].add(new Edge(4,2,2));


    //if i want to store the neighbours of 2 
    // for(int j=0;j<graph[2].size();j++){
    //     Edge e=graph[2].get(j);
    //     System.out.println(e.destination);
    // }

    }

    public static void BFS(ArrayList<Edge> graph[]){ //O(V+E)
        //going to immediate neighbours first
        //similar to level order traversal
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];//cycle exist krti hai, same no. vpas visit na ho, isliye!! 

        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.destination);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge> graph[],int curr,boolean vis[]){
        //keep going to the first neighbour
        //we will use recursion(recirsion apne-app mai akk stack lekr chlta hai so indirectly we are using satck)

        System.out.print(curr + " ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.destination]){
                DFS(graph,e.destination,vis);
            }
        }
    }
}
