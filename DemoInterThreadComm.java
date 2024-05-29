

// to get the proper earning we need to cuse the wat and notify() in lock means synchronization




public class DemoInterThreadComm extends Thread{

int total=0;
public void run(){
    // synchronized(this){
        for (int i = 1; i <=10; i++) {
            total+=100;
        }
        // this.notify();
    // }
}
    public static void main(String[] args) throws InterruptedException{
     DemoInterThreadComm ic=new DemoInterThreadComm();
     ic.start();
    //  synchronized(ic){

        // ic.wait();
        System.out.println("total earning is : "+ic.total);
    //  }



 }    
}
