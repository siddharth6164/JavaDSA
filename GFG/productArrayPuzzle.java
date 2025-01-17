// GFG
// Product array puzzle

public class productArrayPuzzle {
    public static int[] productExceptSelf(int arr[]){
        int len = arr.length;
        int totalprod = 1,zero = 0;
        int[] result = new int[arr.length];
        for(int i:arr){
            if(i==0){
                zero++;
            }else{
                totalprod*=i;
            }
        }
        if(zero>1){
            return result;
        }
        if(zero==1){
            for(int i=0;i<len;i++){
                if(arr[i]==0){
                    result[i]=totalprod;
                }
            }
            return result;
        }
        for(int i=0;i<len;i++){
            result[i]=totalprod/arr[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr ={10,3,5,6,2};
        int[] ans = productExceptSelf(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(ans[i]);
        }
    }
}
