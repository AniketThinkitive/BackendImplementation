public class DemoYield extends Thread{
    
    
    public void run(){
       
       
        Thread.yield();//if you want to stop the thread 0 and not the main thread
   
        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
   
   
    }
    
    public static void main(String[] args) throws InterruptedException {
        DemoYield dy=new DemoYield();

        dy.start();
        dy.join();
        

         Thread.yield();//if you want main method to stop and providechance to other thread for execution
    
        for (int i = 1; i <=5; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    
    
    
    }
    
}
