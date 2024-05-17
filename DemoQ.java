import java.util.LinkedList;
import java.util.Queue;
public class DemoQ {
    public static void main(String[] args) {
        Queue q=new LinkedList<>();

        q.add(1);
        q.offer(2);
        System.out.println("Front elements"+q.element());//thrpw exception if empty
        System.out.println("Front elements"+q.peek());//gives null
        // System.out.println("removes ele and gives "+q.poll());


        System.out.println(q);



    }
}
