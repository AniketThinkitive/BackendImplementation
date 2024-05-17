import java.util.ArrayList;
import java.util.*;
 
public class demoAlist {

    public static void main(String[] args) {
        
    //initial capacity is 10
    //initial size is zero 
    ArrayList<Integer> al1=new ArrayList<Integer>();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);
        // al1.remove(200);
        // al1.set(1,150); //act as a replace 
        System.out.println(al1.indexOf(100));
        Iterator itr=al1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }

    }
}
