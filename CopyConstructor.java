public class CopyConstructor {

    int i;
    int j;
    CopyConstructor(int i,int j){
        System.out.println("Parameterized Construtor");
        this.i=i;
        this.j=j;


    }
    
    CopyConstructor(CopyConstructor cc){
        System.out.println("Copy Constructor");
        i=cc.i;
        j=cc.j;

    }
    public void display(){
        System.out.println("i : "+i);
        System.out.println("J : "+j);
    }
    public static void main(String[] args) {


        CopyConstructor c1=new CopyConstructor(1,2);
        CopyConstructor c2=new CopyConstructor(c1);
        
        c1.display();

            // i we want change the value of the copy constructor data
            c2.i=10;
            c2.j=20;
        c2.display();


    }
    
}
