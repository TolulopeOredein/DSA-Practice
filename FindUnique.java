public class FindUnique {
    public static void main(String[] args) {
        int [] arr = {2, 4, 7, 9, 6,1,10,10,2,9,4,6, 7};
        System.out.println(unique(arr));
    }
    private static int unique(int[] arr) {
        int unique = 0;
        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
