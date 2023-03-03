import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Collections {

    public static void main(String[] args) {
        double marks[] = {95,95,65,80,75};
        List <Integer> list1= new ArrayList();
        List <Double> list2 = new LinkedList();
        List <Double> list3 = new Vector();
        List <Integer> list4 = new Stack();
        HashSet<Integer> set1= new HashSet<>();
        set1.add(23);
        set1.add(55);
        set1.add(65);
        set1.add(98);
        ArrayList<Integer> list= new ArrayList<>();
        list.add(55);
        list.add(78);
        set1.forEach(item->{
            System.out.println("set values "+item);
        });
        list.add(2,999);

        list1.add(33);
        list1.add(54);
        list1.add(98);
        list1.add(98);
        list1.add(77);
        list1.add(38);
        Iterator itr = list1.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        for(Integer in:list1)
            System.out.println(in);

    }
}
