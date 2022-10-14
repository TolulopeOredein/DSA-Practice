import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Type the number to search in the array");
        int targetNumber = in.nextInt();
        int []num = {20, 20, 45,90, 1, 4};
        int result = linearSearch(num, targetNumber);
        int result2 = linearSearch2(num, targetNumber);
        System.out.println(result);
        System.out.println(result2);
    }

    //search the array and return the index if the item is found
    //Otherwise return -1 if Item is not found
    static  int linearSearch(int []arr, int targetElement){
        if(arr.length==0){
            return -1;
        }
        //check if element at index == targetElement

        for(int index =0; index<arr.length; index++){
            int element = arr[index];
            if(element==targetElement){
                return index;
            }
        }
        // return -1 if target element is not found.

        return -1;
    }

    // search the array and return the element itself

    static int linearSearch2(int []arr, int targetElement){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element==targetElement){
                return targetElement;
            }
        }

        return Integer.MAX_VALUE;
    }
}
