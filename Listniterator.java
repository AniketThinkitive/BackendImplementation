import java.util.*;

public class Listniterator {
    public static void main(String[] args) {

            List l=new ArrayList<Integer>();

            l.add(1);
            l.add(2);
            l.add(3);
            l.add(4);


            System.out.println(l);

            // Using iterator 

            // Iterator itr=l.iterator();
            // while(itr.hasNext()){
            //     System.out.println(itr.next());
            // }



            ListIterator itr=l.listIterator();
            

            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            System.out.println("------------------");  //we need to take the cursor to the last then we can traverse back
            while(itr.hasPrevious()){
                System.out.println(itr.previous());
            }
























            // List al=new ArrayList<Integer>();

            // al.add(1);
            // al.add(2);
            // al.add(3);
            // al.add(4);


            // System.out.println(al);


    }
    
}
