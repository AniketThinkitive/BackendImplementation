import java.util.EnumSet;

public class Demoenum {
    public static void main(String[] args) {
        EnumSet<Size> en=EnumSet.allOf(Size.class);
  
      //  EnumSet<Size> en=EnumSet.noneOf(Size.class);
        //EnumSet<Size> en=EnumSet.range(Size.MEDIUM,Size.EXTRALARGE);
            System.out.println(en);

            // Test t=new Test(Size.MEDIUM);
            // t.display();

    }


}



enum Size{

    SMALL,MEDIUM,LARGE,EXTRALARGE
}

// class Test{
//     Size pizaaSize;
//     public Test(Size pizaaSize){
//         this.pizaaSize=pizaaSize;
//     }
//     void display(){
//         switch(pizaaSize){
//             case SMALL:
//             System.out.println("pizza small");
//             break;
//             case LARGE:
//             System.out.println("pizza small");
//             break;
        
//              case MEDIUM:
//              System.out.println("pizza small");
//              break;
//             case EXTRALARGE:
//             System.out.println("pizza small");
//             break;
//             default :
//             System.out.println("donot know size of pizza l");
//             break;
//         }
//     }
//  }
        
    

