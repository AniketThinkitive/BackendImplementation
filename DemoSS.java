import java.util.ListIterator;
import java.util.Stack;

public class DemoSS {

    public static void main(String[] args) {
        
Stack<Integer> s=new Stack<>();
s.push(10);
s.push(20);
s.push(30);
 System.out.println(s);

//   ListIterator litr=s.listIterator();
//         while(litr.hasNext()){
//             System.out.println(litr.next());
//         }

//         System.out.println("---------------");

        
//         while(litr.hasPrevious()){
//             System.out.println(litr.previous());
//         }

 System.out.println(s.peek());
 System.out.println(s.search(20));
 System.out.println(s.search(10));
 System.out.println(s.search(50));//-1 is elemnet is not found


    }
}