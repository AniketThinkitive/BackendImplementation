public class Construtor {



    public Construtor(){
        System.out.println("This is the user defined  contr");
    
    }

    public Construtor(int a,int b){
        System.out.println("This is the user defined Parameter raised constructor");
        int c=a+b;
        System.out.println("Addition is : "+c);
        
    }
    public static void main(String[] args) {
        
        // Construtor c=new Construtor();
        Construtor c1=new Construtor(1,1);
    }
    
}
