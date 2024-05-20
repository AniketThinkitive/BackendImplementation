public class DemoString {
    public static void main(String[] args) {
        


        // == used to checks the address location of the string
       
  // equals() is used to check the value/content of string

        String s1=new String("Deepak");//object 1 heap area
        String s2=new String("Deepak");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
         String s3="Om";
         String s4="Om";

         System.out.println(s3==s4);// true

//    String s1="Sachin";  
//    String s2="Sachin";  
//    String s3="Ratan";  
//    System.out.println(s1.compareTo(s2));//0  
//    System.out.println(s1.compareTo(s3));//1(because s1>s3)  
//    System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  


        

    }
    
}
