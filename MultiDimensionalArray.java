import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int [][]arr = new int[4][];
        int [][] arr2 = {
                {1,2,3,10},
                {4,5,6, 5},
                {7,8,9, 9},
                {2,4,9, 12}
        };
        for (int []x: arr2) {
            System.out.println(Arrays.toString(x));
        }

        Scanner in = new Scanner(System.in);
//        int [][]arr2 = new int[3][];
        System.out.println("Please enter the integers");
     for(int i =0; i < arr2.length; i++){
         for(int j=0; j< arr2[i].length; j ++){
             arr2[i][j]= in.nextInt();
         }
     }

        for (int []x: arr2) {
            System.out.println(Arrays.toString(x));
        }

        String [][] arr3 = {
                {"Sade","Bola","Seyi"},
                {"John","Bola","Nkechi"},
                {"Lawal","Tom","Sayo"}
        };

        for (String []x: arr3) {
            System.out.println(Arrays.toString(x));
//            System.out.println(x[2]);
        }

//        System.out.print(Arrays.toString(arr2[1]));

        System.out.println(Arrays.toString(new String[]{arr3[2][2].trim()}));
    }
}