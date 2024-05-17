import java.util.Map;
import java.util.TreeMap;
public class DemoTM {
    public static void main(String[] args) {
        
        Map tm=new TreeMap<>();
        //gives values in sorted order of key wheather int or string always give sorted 
        tm.put(1,"aa");
        tm.put(2,"bb");
        tm.put(3,"cc");

        System.out.println(tm);
        // ceilingKey/Entry;




    }
}
