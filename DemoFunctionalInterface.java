@FunctionalInterface
interface DemoFuncInterface{

    abstract void show();
}

public class DemoFunctionalInterface {
    public static void main(String[] args) {
        DemoFuncInterface fi=()->{
            System.out.println("This is the show()");
            
        };

        fi.show();
    }
    
}
