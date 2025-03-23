// 46. Permutations{A permutation is a rearrangement of all the elements of an array.}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question46 {
    static List<List<Integer>> permutations(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        if (arr.length == 1) {
            List<Integer> singleList = new ArrayList<>();
            singleList.add(arr[0]);
            res.add(singleList);
            return res;
        }
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int[] remainingNums = new int[arr.length - 1];
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    remainingNums[index] = arr[j];
                    index++;
                }
            }
            // backtracking
            List<List<Integer>> perms = permutations(remainingNums);
            for (List<Integer> p : perms) {
                p.add(n);
            }
            res.addAll(perms);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = permutations(arr);
        // 2D array sort in integer from
        Collections.sort(ans, (a, b) -> {
            for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        });
        System.out.println(ans);
    }
}
