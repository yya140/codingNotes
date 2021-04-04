package heapgraphsearch;
//Determine if an undirected graph is bipartite
//Assume the graph is represented by a list of nodes, and the list of nodes is not null

import java.util.*;

class GraphNode{
    public int key;
    public List<GraphNode> neighbours;
    public GraphNode(int key){
        this.key = key;
        this.neighbours = new ArrayList<GraphNode>();
    }
}
public class Bipartite {
    public boolean isBipartite(List<GraphNode> graph){
        //use 0 and 1 to denote two different groups;
        // the map maintains for each node which group it belongs to.
        HashMap<GraphNode, Integer> visited = new HashMap<GraphNode, Integer>();
        //the graph can be represented by a list of nodes(if it's not guaranteed to be connected). we have to do bfs from each nodes
        for(GraphNode node: graph){
            if (!BFS(node,visited)){
                return false;
            }
        }
        return true;
    }

    private boolean BFS(GraphNode node, HashMap<GraphNode, Integer> visited){
        if (visited.containsKey(node)){
            return true;
        }
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.offer(node);
        //start bfs from node, since the node has not been visited, we can assign it to any of group
        visited.put(node,0);
        while(!queue.isEmpty()){
            GraphNode cur = queue.poll();
            int curGroup = visited.get(cur);
            int neiGroup = curGroup == 0? 1:0;
            for (GraphNode nei : cur.neighbours){
                if (!visited.containsKey(nei)){
                    visited.put(nei,neiGroup);
                    queue.offer(nei);
                } else if (visited.get(nei) != neiGroup){
                    return false;
                }
            }
        }
        return true;
    }

}
