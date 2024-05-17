
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class DemoHS {
    public static void main(String[] args) {
        
        HashSet hs=new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);

        System.out.println(hs);
        
        //   Set<Integer> sh=new HashSet<>();

        Iterator<Integer> itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
    
}
