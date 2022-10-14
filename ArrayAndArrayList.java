import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 4 Strings");
        String [] str = new String[4];
        for (int i=0; i< str.length; i++){
            str[i] = in.nextLine();
        }
        System.out.println("Below are Strings entered. Thanks");
        str[1]= "Sister";
        str[3]= "Cousin";
        changeFunction(str);
        System.out.println(Arrays.toString(str));
    }

    static void changeFunction(String[] str2){
        str2[0] = "Son";
    }
}
