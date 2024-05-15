public class SingletonClass {


    private static SingletonClass single_instance = null;
    public String s;
    private SingletonClass(){
        s="inside constructor";
    }

    public static synchronized SingletonClass getInstance(){
        if(single_instance==null)
        single_instance=new SingletonClass();
        return single_instance;
    }



    public static void main(String[] args) {
        SingletonClass x=SingletonClass.getInstance();
        SingletonClass y=SingletonClass.getInstance();
        SingletonClass z=SingletonClass.getInstance();
    
        System.out.println("Hashcode of x is:"+x.hashCode());
        System.out.println("Hashcode of y is:"+y.hashCode());
        System.out.println("Hashcode of z is:"+z.hashCode());




    }
}

