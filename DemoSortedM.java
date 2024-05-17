import java.util.TreeMap;
import java.util.SortedMap;

public class DemoSortedM{
    public static void main(String[] args) {
        
        SortedMap sm=new TreeMap<>();

        sm.put(1,"aa");
        sm.put(2,"bb");
        sm.put(4,"dd");
        sm.put(3,"cc");
        sm.put(5,"ee");

        System.out.println(sm);
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());

    }
}