

//join()=if athread wants to wait for another thread to complete its task then we should use join() method

// public final void join() throws interrupted exception
// public final synchoronized void join(long millisec)and same join(long ms ,int ns)



public class DemoJoin extends Thread {
    static Thread tmain;
    public void run() {
        try{
        // tmain.join(); //used when main should execute frist 
        for (int i = 1; i <=5; i++) {
            System.out.println("square is  "+i+" : "+i*i);
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
  public static void main(String[] args) throws InterruptedException{
        

     tmain=Thread.currentThread();
     DemoJoin dj=new DemoJoin();
     dj.start();                                                                                            
     dj.join(); // used when thread 0 should execute frist 


     for (int i = 1; i <=5; i++) {
        System.out.println("cube is  "+i+" : "+i*i*i);
    }
    }
    
}

