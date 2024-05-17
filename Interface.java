interface  POne{
//   public void show();
//         default void dispaly(){

//         }
// static  void run(){

// }

// public static final int a=10;


public void  show();

}

interface PTwo{
    public void display();

}

public class Interface  implements POne,PTwo
{
    
 public void show(){
    System.out.println(" this is show method ");


 }

 public void display(){
    System.out.println(" this is display method ");

 }
public static void main(String[] args) {
    
    Interface i=new Interface();
    i.show();
    i.display();
}

}
