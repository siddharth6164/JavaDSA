// 169. Majority Element
public class Question169 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int candidate = arr[0];
        int count = 0;
        for(int i : arr){
            if(i==candidate){
                count++;
            }else{
                count--;
                if(count==0){
                    candidate=i;
                    count++;
                }
            }
        }
        System.out.println(candidate+" "+count);
    }
}
