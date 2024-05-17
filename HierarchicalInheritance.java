
public class HierarchicalInheritance {
    void eat(){
        System.out.println(" Animal Eating");
        }
        void run(){
         System.out.println(" Animal runing");
                 }
          void sleep(){
     
                   
       System.out.println(" Animal Sleeping");
                     }
     
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat(); //   
        d.run();
        d.sleep();
        d.bark(); // bark() method from Dog class

        Cat c = new Cat();
        c.eat(); 
        c.sleep();
        c.run();
        c.meow(); //  meow() method from Cat class


       }}





       
    class Cat extends HierarchicalInheritance {
      void meow() {
        System.out.println("Cat meowing");
    }
        
        
     
    
    }
     class Dog  extends HierarchicalInheritance {
        void bark() {
            System.out.println("Dog barking");
        }
    
    }
    
    
    

