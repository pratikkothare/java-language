import java.util.*;

class CombinationSum1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> comb = new ArrayList<>();
        combinations(candidates, target, 0, comb, ans);
        return ans;
    }

    public static void combinations(int[] candidates, int target, int start, ArrayList<Integer> comb, List<List<Integer>> ans) {
        // Base Case: If sum of combination equals target, add to ans
        int sum = 0;
        for (int num : comb) sum += num;
        if (sum == target) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        if (sum > target) return; // Stop if sum exceeds target

        // Recursive Case
        for (int i = start; i < candidates.length; i++) {
            comb.add(candidates[i]);
            combinations(candidates, target, i, comb, ans); // Allow reuse of the same element
            comb.remove(comb.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        CombinationSum1 sol = new CombinationSum1(); //object creation
        int[] candidates = {2, 3, 6, 7};  // Example input
        int target = 7;
        List<List<Integer>> result = sol.combinationSum(candidates, target);

        // Print result
        System.out.println("Combinations summing to " + target + ": " + result);
    }
}
