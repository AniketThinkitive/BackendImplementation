import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTS {
    public static void main(String[] args) {
        

        Set ts=new TreeSet<Integer>();



            ts.add(1);
            ts.add(2);
            ts.add(3);
            ts.add(6);
            ts.add(4);
            ts.add(5);
            // ts.add(null); // throws null pointer exception
        //follows the sorted order
            System.out.println(ts);

            Iterator<Integer> itr=ts.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());

            }












    }
}
