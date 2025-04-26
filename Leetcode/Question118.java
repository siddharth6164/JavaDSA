// 118. Pascal's Triangle
import java.util.ArrayList;
import java.util.List;

public class Question118 {
    public static List<List<Integer>> solution1(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        if (n == 0)
            return arr;
        arr.add(new ArrayList<>());
        arr.get(0).add(1);
        for (int i = 1; i < n; i++) {
            List<Integer> currList = new ArrayList<>();
            currList.add(1);
            for (int j = 1; j < i; j++) {
                currList.add(arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j));
            }
            currList.add(1);
            arr.add(currList);
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> arr = solution1(n);
        System.out.println(arr);
    }
}
