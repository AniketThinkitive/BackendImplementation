
public class MethodOverloding {

 void show(){
        System.out.println("Method with no parameters");

     }

     void show(Object a){
         System.out.println("Method object  parameters");

     }

    void show(String a){
        System.out.println("Method with String single parameters  ");

    }

    // void show(StringBuffer a){
    //     System.out.println("Method with String single parameters  ");

    // }

    void show(int... a){
        System.out.println("Vargs Method with String single parameters  ");

    }

     void show(int a){
         System.out.println("Method with int single parameters  ");

     }

     // String show(int a){
     //     System.out.println("Method with single parameters  ");

     // }

     void show(int a,int b){
         System.out.println("Method with two  parameters with same int datatype");

     }

     void show(String str1,int a){
         System.out.println("Method with two  parameters with String and int  datatype");

     }
     void show(int a,String str1){
         System.out.println("Method with two  parameters with Int and String datatype");

     }

    public static void main(String[] args) {
        MethodOverloding mo=new MethodOverloding();
         mo.show();
         mo.show("a");
         mo.show(10,20,30,40);
        // mo.show('a');    
        mo.show(10);      
        mo.show(10,20);
         mo.show(10,"hello");
         mo.show("hello",10);
    }

}
