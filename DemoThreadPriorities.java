public class DemoThreadPriorities extends Thread{
    // child has priority as of main
    public void run(){
        System.out.println("Child thread priority : "+Thread.currentThread().getPriority());
    }


    public static void main(String[] args) {
        System.out.println("Main threads old priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        //min pri =1 maxpri=10 normal=5
        System.out.println("New set priority : "+Thread.currentThread().getPriority());
    
        DemoThreadPriorities dtp=new DemoThreadPriorities();
        dtp.start();
        
    
    
    }
}
