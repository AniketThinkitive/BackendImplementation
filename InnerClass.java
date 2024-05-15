class A{
    int age;
     
    public void show(){
        System.out.println("in show ");

    }
//    static
   
   class B{

public void config(){
    System.out.println("In config");
}

    }

}








public class InnerClass {
   
    public static void main(String[] args) {

        A a=new A();
        a.show();

        // B b=new B();


        // when class B is non static
        A.B b=a.new B();
        b.config();

        //  when  class B is static we can use
        
        // A.B b=new A.B();
        // b.config();

        
    }
    
}
