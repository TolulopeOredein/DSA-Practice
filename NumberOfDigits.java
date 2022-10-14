public class NumberOfDigits {
    public static void main(String[] args) {
        int [] arr = {12,343,2,6,46,10, 12,7896};
       int result= findNumbers(arr);
       System.out.println(result);

    }
    public static int findNumbers(int [] arr){
        int counter =0;
        for(int i =0; i <arr.length; i++){
            int num = arr[i];
            String num2 = num + "";
            int num3 = num2.length();
            if(num3%2==0){
                counter++;
            }
        }
        return counter;
    }
}
