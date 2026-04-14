import java.util.*;
public class RatInaMaze {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        findPath(mat);
    }

    
        // Function to find all possible paths
    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
            String ans = "";
            int n = mat.size();
            ArrayList<String> path = new ArrayList<>();
            boolean[][] visited = new boolean[n][n];
    
            if (mat.get(0).get(0) == 1) {
                paths(mat, 0, 0, ans, path, visited);
            }
    
            return path;
    }
    
    public static void paths(ArrayList<ArrayList<Integer>> mat, int row, int col, String ans, ArrayList<String> path, boolean[][] visited) {
            int n = mat.size();
    
            // Base case: If out of bounds or on a blocked cell or already visited
            if (row < 0 || col < 0 || col >= n || row >= n || mat.get(row).get(col) == 0 || visited[row][col]) {
                return;
            }
    
            // If destination is reached
            if (row == n - 1 && col == n - 1) {
                path.add(ans);
                return;
            }
    
            // Mark as visited
            visited[row][col] = true;
    
            // Recursion for all four possible movements
           paths(mat, row + 1, col, ans + "D", path, visited); // Down
            paths(mat, row, col - 1, ans + "L", path, visited); // Left
            paths(mat, row, col + 1, ans + "R", path, visited); // Right
            paths(mat, row - 1, col, ans + "U", path, visited); // Up
    
            // Backtrack
            visited[row][col] = false;
    }
}

