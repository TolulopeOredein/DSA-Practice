import java.util.Arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int [] arr = {1,9,3,4,8,20};
        System.out.println("The maximum value of the Array : " + Arrays.toString(arr) + " is " + max(arr));
        System.out.println("The maximum value of the Array at a range 2-4 : "
                + Arrays.toString(arr) + " is " + maxRange(arr, 2,4));
    }
    private static int max(int[] arr) {
        int maxVal = arr[0];
        for(int i =1; i < arr.length; i++){
            if(arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    private static int maxRange(int [] arr, int start, int end){
        int maxVal = arr[0];
        for(int i = start; i <= end; i ++){
            if(arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
