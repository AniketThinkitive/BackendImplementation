public class DemoThreadMethod extends Thread {
    public void run(){
        System.out.println("Thread name is : "+Thread.currentThread().getName());
    }



    public static void main(String[] args) {
        System.out.println("Thread Methods");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Notmain");
        System.out.println(Thread.currentThread().getName());
        

        DemoThreadMethod dtm1=new DemoThreadMethod();
        dtm1.setName("First Thread");
        dtm1.start();


        DemoThreadMethod dtm2=new DemoThreadMethod();
        dtm2.setName("Second Thread");
        dtm2.start();

    }
}
