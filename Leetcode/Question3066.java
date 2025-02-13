import java.util.PriorityQueue;

public class Question3066 {
    static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minheap = new PriorityQueue<>();

        for(int num: nums){
            minheap.add((long)num);
        }

        int count = 0;
        while(!minheap.isEmpty()){
            long min1 = minheap.poll();
            if(min1 >= k){
                break;
            }
            long min2 = minheap.poll();

            minheap.add(2 * Math.min(min1, min2) + Math.max(min1, min2));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        int res = minOperations(nums, k);
        System.out.println(res);
    }
}