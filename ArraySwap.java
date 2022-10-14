import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int [] arr = {5,9,10,34};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1,2);
        System.out.println(Arrays.toString(arr));
        reverseWithSwap(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverseWithSwap(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr) {
        int [] r = new int[arr.length];
        for(int i = arr.length-1,  j=0 ; i >0 && j< r.length;  i--, j++){
            r[j] = arr[i];
        }
       for(int i =0; i< arr.length; i++){
           arr[i]= r[i];
       }
    }
    //reverse using swap
    static void reverseWithSwap(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start< end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }
}
