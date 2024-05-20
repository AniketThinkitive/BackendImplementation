public class DemoInterrupt  extends Thread{
    
    



 public void run(){

    System.out.println(Thread.currentThread().isInterrupted());
  try{
        for (int i = 1; i <=5; i++) {
            System.out.println(i);
            // Thread.sleep(1000);
            //works only when the thread is in wait() or sleep()  state
        }

  }
  catch(Exception e){
    System.out.println("Thread interrupted" +e);
  }

 }


    public static void main(String[] args) {
         DemoInterrupt di=new DemoInterrupt();
         di.start();
         di.interrupt();// if comment the will give false 
    }
}
