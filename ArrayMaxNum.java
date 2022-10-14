import java.util.Arrays;

public class ArrayMaxNum {
    public static void main(String[] args) {

        int [][] arr = {
                {1,1,5},
                {6,9,89},
                {2,9}
        };

        int [] result = maxNum(arr);
        System.out.println(Arrays.toString(result));
    }
    private static int[] maxNum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        if(arr.length==0){
            return  new int []{1};
        }
        for(int row =0; row< arr.length; row++){
            for(int column =0; column< arr[row].length; column++){
                if(arr[row][column]>max){
                    max = arr[row][column] ;
                    return new int []{max};
                }
            }
        }
        return new int []{-1,-1};
    }
}
