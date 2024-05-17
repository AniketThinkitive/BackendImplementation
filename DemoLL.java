import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class DemoLL {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<Integer>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        System.out.println(l);
        // System.out.println(l.getFirst());


        // Iterator<Integer> itr=l.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }


        ListIterator litr=l.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        System.out.println("---------------");

        
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
}
