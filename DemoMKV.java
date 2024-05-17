import java.util.HashMap;
import java.util.Map;

public class DemoMKV {
    public static void main(String[] args) {

        Test test = new Test<Integer>();
            
            Map<Integer, String> hm=new HashMap<>();

            hm.put(1,"Pratik");
            hm.put(2,"Aniket");

            for(Map.Entry<Integer, String> ele :hm.entrySet()) {

            }
            
            // hm.put(2,"Ganesh");//override old value
            // hm.put(null, null); // multiple null keys not done but multiple null values  



            System.out.println(hm);

            // hm.clear(); // delete all values
            // System.out.println(hm.containsKey(2));
            // System.out.println(hm.get(1));
            // hm.remove(2);


            // System.out.println(hm);

            // hm.replace(1,"Ganesh");


    }

    
}

class Test<T> {

    // 5'6"
    T height;

}