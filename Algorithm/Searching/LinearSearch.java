import java.util.Arrays;

public class LinearSearch {
    public static boolean searching(int[] arr,int key){
        for(int ele:arr){
            if(ele==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {5,1,2,4,3};
        int key = 4;
        boolean ans=searching(arr,key);
        System.out.println(Arrays.toString(arr));
        System.out.println("Element = "+key);
        if(ans){
            System.out.println("Eelement "+key+" are present.");
        }else{
            System.out.println("Eelement "+key+" are not present.");
        }
    }
}