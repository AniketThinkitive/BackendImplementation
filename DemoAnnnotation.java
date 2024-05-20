import java.util.ArrayList;

class A{

    public void showData(){
        System.out.println("Show() from A");
    }
}

class B extends A{
    @Deprecated //tell not to use this 
    public void show(){

    }



    @Override //gives info that the method is override
    @SuppressWarnings("unchecked")//used to suppress the warnings
    public void showData(){
        System.out.println("Show() from B");
        ArrayList al=new ArrayList<>();//
    }
}

public class DemoAnnnotation {
    public static void main(String[] args) {
        B b=new B();
        b.showData();
        // b.show();
    }
}
