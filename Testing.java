import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Testing {

    public static void main(String[] args) {
        List<Integer> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {

                arrayList.remove(2);
            }
        }

        System.out.println(arrayList);

        itr = arrayList.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 3) {


                arrayList.remove(3);
            }
        }
    }
}
