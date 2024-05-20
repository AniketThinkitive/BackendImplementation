// Daemon thread 
// which runs in the background
// use to provide service to the thread 
// eg: - garbage collector,worddocuments,
// public final void setDaemon(boolean b)
//public final boolean is Daemon()
//we cant set main thread as daemon
// Daemon Thread life depends on main 




public class DemoDaemonThread  extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Child Thread");
    }
    public static void main(String[] args) {
       
       //if commet main thread then daemon will also not start
        System.out.println("Main Thread");
        DemoDaemonThread dt=new DemoDaemonThread();
        dt.setDaemon(true);//nead to write setDaemon thread before start() or will get exception illegalthreadexception
        dt.start();


    }








}
