public class ReturnType {

    public void test1(){
        System.out.println("This is void return type");
    }

    public int test2(){
        int a=1,b=2;
         int c=a+b;
         return c;
    }

    public float test3(){
        float a=11.11f,b=22.22f;
        float c=a+b;
        return c;
    }

    public double test4(){
        double a=11.111,b=22.222;
        double c=a+b;
        return c;
    }
    public char test5(){
        char a='A';
        return 'a';
    }
    public String test6(){
        String str="Hello World";
        return str;
    }

    public boolean test7(){
        return true;
    }
    // public ReturnType test8(){
    //     return new ReturnType();
    // }

    // public int[] test9(){
    //     int arr[]={1,2,3};
    //     return arr;
    // }

    

    public static void main(String[] args) {

        ReturnType rt=new ReturnType();
        // rt.test1();

        rt.test1();
       System.out.println( rt.test2());
       System.out.println( rt.test3());
       System.out.println( rt.test4());
       System.out.println( rt.test5());
       System.out.println( rt.test6());
       System.out.println( rt.test7());
    //    System.out.println( rt.test8());
    //    System.out.println( rt.test9());
        
    }
    
}
