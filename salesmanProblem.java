//(Traveling  salesperson  problem)  The  traveling  salesperson  problem  (TSP)  is
//        to  find  a  shortest  round-trip  route  that  visits  each  city  exactly  once  and  then
//        returns  to  the  starting  city.  The  problem  is  equivalent  to  finding  a  shortest
//        Hamiltonian cycle in Programming Exercise 28.17. Add the following method
//        in the WeightedGraph class:
//// Return a shortest cycle
//// Return null if no such cycle exists
//public
// List<Integer> getShortestHamiltonianCycle()

//Not rewriting the entire class; just writing the hamiltonian cycle.


import java.util.Arrays;

public class salesmanProblem {
    private int V, pathCount;
    private int[] path;
    private int[][] graph;

    public void findHamiltonianCycle(int[][] g) {
        V = g.length;
        path = new int[V];
        Arrays.fill(path, -1);
        graph = g;
        try {
            path[0] = 0;
            pathCount = 1;
            solve(0);
            System.out.println("No solution");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            display();
        }
    }

    public void solve(int vertex) throws Exception {
        if (graph[vertex][0] == 1 && pathCount == V)
            throw new Exception("Solution found");
        if (pathCount == V)
            return;
        for (int i = 0; i < V; i++) {
            if (graph[vertex][i] == 1) {
                path[pathCount++] = i;
                graph[vertex][i] = 0;
                graph[i][vertex] = 0;
                if (!isPresent(i))
                    solve(i);
                graph[vertex][i] = 1;
                graph[i][vertex] = 1;
                path[--pathCount] = -1;
            }
        }
    }

    public boolean isPresent(int v) {
        for (int i = 0; i < pathCount - 1; i++)
            if (path[i] == v)
                return true;
        return false;
    }

    public void display() {
        System.out.print("\nPath : ");
        for (int i = 0; i <= V; i++)
            System.out.print(path[i % V] + " ");
        System.out.println();
    }
}