import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList();
        for (int i = 1; i <=10; i++) {
            myArrayList.add(i*10);
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 12, 3, 4, 55));
        myArrayList.addAll(list);
        myArrayList.printArrayList();
    }
}
