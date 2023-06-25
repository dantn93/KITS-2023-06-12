import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSetExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("element1");
        arrayList.add("element2");
        arrayList.add("element3");
        arrayList.add("element2");

        HashSet<String> hashSet = new HashSet<>(arrayList);

        System.out.println("ArrayList elements: " + arrayList);
        System.out.println("HashSet elements: " + hashSet);
    }
}