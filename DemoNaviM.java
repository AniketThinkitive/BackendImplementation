
    import java.util.TreeMap;
import java.util.NavigableMap;

public class DemoNaviM {
    public static void main(String[] args) {
        
        NavigableMap nm=new TreeMap<>();

        nm.put(1,"aa");
        nm.put(2,"bb");
        nm.put(4,"dd");
        nm.put(3,"cc");
        nm.put(5,"ee");

        System.out.println(nm);
        // System.out.println(nm.firstKey());
        // System.out.println(nm.lastKey());
        //  System.out.println(nm.ceilingKey(4));
        // System.out.println(nm.floorKey(2));
    }
}

