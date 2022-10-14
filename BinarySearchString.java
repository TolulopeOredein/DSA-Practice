import java.util.Arrays;

public class BinarySearchString {
    public static void main(String[] args) {
        String[]arr = {"Aade","kivian","Cames","Dno","Dames"};
        Arrays.sort(arr);
        int result = binarySearch(arr,"k");
        System.out.println(result);
    }
    //return -1 if target is not in the array
    //Searches the first character of the Strings in the array
    public static int binarySearch(String [] arr, String target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            char[] t = target.toCharArray();
            if(t[0] < arr[mid].charAt(0)){
                end = mid-1;
            }
            else if (t[0] > arr[mid].charAt(0)) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
