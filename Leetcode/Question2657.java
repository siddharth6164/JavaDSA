// Leetcode
// 2657. Find the Prefix Common Array of Two Arrays

public class Question2657 {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] prefixCommonArray = new int[n];
        for(int i=0;i<n;i++){
            int commonCount = 0;
            for(int j=0;j<=i;j++){
                for(int k=0;k<=i;k++){
                    if(A[j]==B[k]){
                        commonCount++;
                        break;
                    }
                }
            }
            prefixCommonArray[i] = commonCount;
        }
        return prefixCommonArray;
    }
    public static void main(String[] args) {
        int[] a = {1,3,2,4};
        int[] b = {3,1,2,4};
        int[] c = findThePrefixCommonArray(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }    
}
