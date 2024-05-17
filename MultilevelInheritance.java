class AnimalOne {

    void eat(){
   System.out.println(" Parent Eating");
   }
   
}
class AnimalTwo extends AnimalOne{

    void run(){
        System.out.println(" child  runing");
        }

    // void run(String str){
    //     // this.run();
    //         System.out.println("child 2nd runing");
    //         }
 

}
 class AnimalThree  extends AnimalTwo
{
   void sleep(){

          

       System.out.println(" last child Sleeping");
       }

}
public class MultilevelInheritance extends AnimalThree{
public static void main(String args[]){
   
    MultilevelInheritance mi=new MultilevelInheritance();
    mi.eat();
    // mi.run("hi");
    mi.run();
    mi.sleep();
 
    
    }
}


