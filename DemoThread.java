
class DemoThread implements Runnable{
    
    
    @Override
    public void run(){
    System.out.println("this is thread using runable inerface");
    }
    public static void main(String[] args){
     DemoThread t=new DemoThread();
     Thread th=new Thread(t);
     th.start();
    
    
    }
     
    }







//using Thread class

// class DemoThread extends Thread{
    
    
//     @Override
//     public void run(){
//     System.out.println("this is thread using thread class");
//     }
//     public static void main(String[] args){
//      DemoThread t=new DemoThread();
//      t.start();
    
    
//     }
     
//     }



