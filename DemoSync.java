
// class Table{  
//     synchronized void printTable(int n){//synchronized method  
//       for(int i=1;i<=5;i++){  
//         System.out.println(n*i);  
//         try{  
//          Thread.sleep(400);  
//         }catch(Exception e)
//         {
//           System.out.println(e);
//         }  
//       }  
     
//     }  
//    }  
     
//    class MyThread1 extends Thread{  
//    Table t;  
//    MyThread1(Table t){  
//    this.t=t;  
//    }  
//    public void run(){  
//    t.printTable(5);  
//    }  
     
//    }  
//    class MyThread2 extends Thread{  
//    Table t;  
//    MyThread2(Table t){  
//    this.t=t;  
//    }  
//    public void run(){  
//    t.printTable(100);  
//    }  
//    }  
     
//    public class DemoSync{  
//    public static void main(String args[]){  
//    Table obj = new Table();//only one object  
//    MyThread1 t1=new MyThread1(obj);  
//    MyThread2 t2=new MyThread2(obj);  
//    t1.start();  
//    t2.start();  
//    }  
//    }  
   
class BookTheraterSeat{

  int totalSeats=10;
  //scope of method is more 
  synchronized void bookSeat(int seats){




    // synchronized(this){
    //   if(totalSeats>=seats){
    //     System.out.println(seats+"seats booked succesfully");
    //     totalSeats-=seats;
    //     System.out.println("seats left : "+totalSeats);
    //   }
    //   else{
    //     System.out.println("Sorry seats canot be booked");
    //     System.out.println("Seats left: "+totalSeats);
    //   }
  
    // }







    if(totalSeats>=seats){
      System.out.println(seats+"seats booked succesfully");
      totalSeats-=seats;
      System.out.println("seats left : "+totalSeats);
    }
    else{
      System.out.println("Sorry seats canot be booked");
      System.out.println("Seats left: "+totalSeats);
    }

  }
}
public class DemoSync extends Thread{  

static BookTheraterSeat b;
int seats;
public void run(){
  b.bookSeat(seats);
}

  public static void main(String args[]){  
       b=new BookTheraterSeat();

       DemoSync deepak=new DemoSync();
       deepak.seats=4;
       deepak.start();  

     DemoSync om=new DemoSync();
     om.seats=4;
     om.start();  


      
     }  
     }  