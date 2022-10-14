public class NumberSearch {
    public static void main(String[] args) {
        int [] arr = {12,343,2,6,7896};

        int result = findNumbers(arr);
        System.out.println(result);
    }

    private static int findNumbers(int[] arr) {
        int counter =0;

        for (int i=0; i<arr.length; i++){

            int num = arr[i];
            if(num%2==0){
                counter++;
            }
        }
        return counter;
    }

}
