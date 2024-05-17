class Parent{

    void eat(){
        System.out.println("Eat() form Parent ");
    }
}
class Child extends Parent{
void dance(){
    System.out.println("Dance() from child");
}
}
class GrandChild extends Child{
    @Override
void dance(){
    this.dance("hi");
    super.dance();
    System.out.println("Im dance() from grandchild");
}

void dance(String str){

    System.out.println("Im a overloaded dance method");
}

}



public class SimpleSingle  {
    public static void main(String[] args) {
        // Child c=new Child();
        // c.eat();
        // c.dance();
GrandChild gc=new GrandChild();
gc.dance();
// gc.dance("hi");



// public static void main() {

// }



    }
    
}
