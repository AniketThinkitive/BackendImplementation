import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ListIterator;

public class Task {
    public static void main(String[] args) {
        

        Set<Integer> l=new HashSet<Integer>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(3);
        l.add(2);


        System.out.println("Set elements : "+l);

        // ListIterator litr=l.listIterator();
        // while(litr.hasNext()){
        //     System.out.println(litr.next());

        // }


    }
    
}
