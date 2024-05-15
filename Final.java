public 
// final
 class Final {

    // final 
    void add(){
        int a=10,b=20;
        System.out.println("The sum is "+(a+b));
    }
    
}
 class Demo extends Final{

    
    void add(){
        int a=10,b=20;
        System.out.println("The sum is "+(a+b));
    }
    public static void main(String[] args) {
        final int x= 10;
        // x=20;
        System.out.println("value of x is: "+x);
    }
}
