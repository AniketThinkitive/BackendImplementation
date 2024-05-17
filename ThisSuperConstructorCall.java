class Parent{

    Parent(){

        System.out.println("Parent class constructor");
    }

    Parent(String str){
        this();
        System.out.println("Parent class parameterised constructor");
    }


}

class Child extends Parent{

    Child(){

        super("Hello");
        System.out.println("Child class constructor");
    }
    Child(String str){
        this();
        System.out.println("Child class parameterised constructor");
    }
}

class GrandChild extends Child{

    GrandChild(){
        super("Hello");
        System.out.println("GrandChild class constructor");
    }
    GrandChild(String str){
        this();
        System.out.println("GrandChild class parameterised constructor");
    }

}



public class ThisSuperConstructorCall {
    public static void main(String[] args) {

        GrandChild gc=new GrandChild("Hello");
    }
    
}
