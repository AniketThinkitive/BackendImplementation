import java.util.Hashtable;

public class DemoHT {
    public static void main(String[] args) {
        //capacity 11

        // 1 % 11=rem,eg 102%11=3
        // same hashvalue is hash collision //linkedlist both are stored on same place
        Hashtable ht=new Hashtable<>();
        ht.put(1,"aa");
        ht.put(2, "bb");
        ht.put(6,"dd");
        ht.put(3,"cc");

        System.out.println(ht);

    }
}
