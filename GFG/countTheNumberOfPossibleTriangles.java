// GFG
// Count the number of possible triangles

import java.util.Arrays;

public class countTheNumberOfPossibleTriangles {
    public static int countTriangles(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
    	int cnt=0;
    	for(int i=n-1;i>=2;i--) {
    		int l=0;
    		int h=i-1;
    		while(l<h) {
    		    int sum=arr[l]+arr[h];
    			if(sum>arr[i]) {
    				cnt+=h-l;
    				h--;
    			}else{
    			    l++;
    			}
    		}
    	}
       return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,3,7};
        int ans = countTriangles(arr);
        System.out.println(ans);
    }
}
