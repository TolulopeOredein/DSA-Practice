import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String[]> arrayList = new ArrayList<>();
        String [] name ={"Sola", "Bola", "Dare"};
        String [] surname ={"Jare", "Makinwa", "Azure"};
        arrayList.add(name);
        System.out.println(Arrays.toString(arrayList.get(0)));
        String [] name1 = arrayList.get(0);
        System.out.println(Arrays.toString(name1));
        System.out.println(Arrays.toString(name1).toUpperCase().hashCode());
        System.out.println(Arrays.toString(name1).toLowerCase().hashCode());
        System.out.println(Arrays.toString(name1).toUpperCase().hashCode());
        System.out.println(Arrays.toString(name1).toLowerCase().hashCode());
        int x = Arrays.toString(name1).toLowerCase().hashCode();
        System.out.println(Arrays.toString(name1).toUpperCase().hashCode()==Arrays.toString(name1).toLowerCase().hashCode());

    }
}
