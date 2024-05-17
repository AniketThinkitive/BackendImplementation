import java.util.Iterator;
import java.util.PriorityQueue;
public class DemoPiQ {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>();



        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);

        System.out.println(pq);
        System.out.println(pq.peek());
        // System.out.println(pq.poll()); // removes the head of queqe then return it 
        
        Iterator itr=pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

        

    }
}
