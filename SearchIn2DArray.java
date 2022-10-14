import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {10,1,0,20},
                {3,9,2,},
                {1,9,34,9}
        };
        int targetNum= 20;
        int [] result = search(arr, targetNum);
        System.out.println(Arrays.toString(result));
    }
    private static int [] search(int[][] arr, int targetNum) {
        if(arr.length==0){
            return  new int []{1};
        }
        for(int row =0; row< arr.length; row++){
            for(int column =0; column< arr[row].length; column++){
                if(arr[row][column]==targetNum){
                    return new int []{row,column};
                }
            }
        }
        return new int []{-1,-1};
    }
}
