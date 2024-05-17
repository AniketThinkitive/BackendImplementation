
// class Test {

//     void show(){
//         System.out.println("1st show ");
//     }
// }


// public class MethodOverriding extends Test{
//  void show(){
//     super.show();
//     System.out.println("2nd Show ");
//      }
//     public static void main(String[] args) {
      
//         // Test t=new Test();
//         // t.show(); //can access only test class data

//         MethodOverriding mr=new MethodOverriding();
//         mr.show();
//     }
// }














// type of arguments same case



// class Test {

//     // void show(){
//     //     System.out.println("1st show without parameter ");
//     // }

//     void show(String str){
//         // this.show();
//         System.out.println("1st show ");
//     }
// }


// public class MethodOverriding extends Test{
//  void show(String str){
//      super.show("hi");
//     System.out.println("2nd Show ");
//      }
//     public static void main(String[] args) {
      
//         // Test t=new Test();
//         // t.show(); //can access only test class data

//         MethodOverriding mr=new MethodOverriding();
//         mr.show("hi");
//     }
// }















// Return type / covariant return type


// 1st  class must have parent return type,and 2nd class must have child return type
// Number -Interger
// Object-String
// class Test {

//     Object show(){
//         System.out.println("1st show  ");
//         return null;
//     }

   
// }


// public class MethodOverriding extends Test{
//       String show(){

//           super.show();

//         System.out.println("2st show  ");
//         return null;
//     }
//     public static void main(String[] args) {
      
//         // Test t=new Test();
//         // t.show(); //can access only test class data

//         MethodOverriding mr=new MethodOverriding();
//         mr.show();
//     }
// }















// The access-modifires of child class must be bigger/larger than parent  the access modifires for an overriding methods can allow more, but not less, access than the overriden method.

class Test {

    void show(){
        System.out.println("1st show  ");
        
    }

   
}


public class MethodOverriding extends Test{
    // private or lessthan parent method access-modifiers are not allow
   public   void show(){

          super.show();

        System.out.println("2st show  ");
        
    }
    public static void main(String[] args) {
      
        // Test t=new Test();
        // t.show(); //can access only test class data

        MethodOverriding mr=new MethodOverriding();
        mr.show();
    }
}




// if are throwing exection in parent class then in child must have same level exception
// we canot have bigger level expection in child class than parent class

// abstract/interface  parent class methods must be override/implemented in  in child class and child methos access modifier  must be bigger 



