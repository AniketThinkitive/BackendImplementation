public class Constructor {



    // public Constructor(){
    //     System.out.println("This is the user defined  contructor");
    
    // }

    // public Constructor(int a,int b){
    //     System.out.println("This is the user defined Parameter raised constructor");
    //     int c=a+b;
    //     System.out.println("Addition is : "+c);
        
    // }

    String name;
    int id;
    Constructor(String name,int id){
        this.name=name;
        this.id=id;
    }











    public static void main(String[] args) {
        
        // Construtor c=new Construtor();
        // Constructor c1=new Constructor(1,1);

        Constructor ca=new Constructor("Aniket",1);
        Constructor cb=new Constructor("Pratik",2);

        System.out.println("First : "+ca.name+" "+ca.id);
        System.out.println("First : "+cb.name+" "+cb.id);

    }
    
}
