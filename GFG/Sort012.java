import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,1,2}; 
        int zero = 0, one = 0, two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zero++;
            if(nums[i]==1)one++;
            if(nums[i]==2)two++;
        }
        for(int i=0;i<zero;i++)nums[i]=0;
        for(int i=zero;i<zero+one;i++)nums[i]=1;
        for(int i=zero+one;i<nums.length;i++)nums[i]=2;
        System.out.println(Arrays.toString(nums));
    }
}
