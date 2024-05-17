import java.util.ArrayDeque;
import java.util.Deque;
public class DemoDeQ {
    public static void main(String[] args) {
        Deque dq=new ArrayDeque<>();

        dq.add(3);
        dq.addFirst(2);
        dq.addLast(4);
        dq.offerFirst(1);
        dq.addFirst(10);
        dq.add(20);

        System.out.println(dq);

        //pollLast te remove last ele
        //

    }
}
