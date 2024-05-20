class Student{  
    int rollno;  
    String name;  
    String city;  
     
    Student(int rollno, String name, String city){  
    this.rollno=rollno;  
    this.name=name;  
    this.city=city;  
    }  
      //overriding the toString() method  
    public String toString(){         
     return rollno+" "+name+" "+city;  
    }  
    
   }  


public class DemoToString {

    public static void main(String args[]){  
        Student s1=new Student(101,"Raj","lucknow");  
        Student s2=new Student(102,"Vijay","ghaziabad");  
        
        
        //compiler writes here s2.toString()
        System.out.println(s1);  
        System.out.println(s2);  
      }  
}
