import java.util.*;

public class EnumerationCursor {
    public static void main(String[] args) {
        
    // only used for vector and stack 
 Vector v=new Vector();

            v.add(1);
            v.add(2);
            v.add(3);
            v.add(4);


            System.out.println(v);

            Enumeration e=v.elements();
            while(e.hasMoreElements()){
                System.out.println(e.nextElement());
            }




    }
}
