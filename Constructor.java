public class Constructor {



    public Constructor(){
        System.out.println("This is the user defined  contructor");
    
    }

    public Constructor(int a,int b){
        System.out.println("This is the user defined Parameter raised constructor");
        int c=a+b;
        System.out.println("Addition is : "+c);
        
    }
    public static void main(String[] args) {
        
        // Construtor c=new Construtor();
        Constructor c1=new Constructor(1,1);
    }
    
}
