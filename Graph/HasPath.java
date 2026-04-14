import java.util.*;
public class HasPath {
    
    public class Edge{
        int source;
        int des;
        int wt;

        public Edge(int s,int d, int w){
            this.source=s;
            this.des=d;
            this.wt=w;
        }
       
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        haspath(graph,0,4,new boolean[v]);
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
    
   

    public static boolean haspath(ArrayList<Edge> graph[],int curr,int destination,boolean vis[]){
        if(curr==destination){
            return true;
        }

        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.des] && haspath(graph,e.des,destination,vis)){
                return true;
            }
        }
        return false;
    }
}
