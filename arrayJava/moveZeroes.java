import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 0, 0, 1 };
        int left = 0;
        for(int rigth=0;rigth<arr.length;rigth++) {
            if(arr[rigth]!=0){
                int temp = arr[rigth];
                arr[rigth] = arr[left];
                arr[left]=temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
