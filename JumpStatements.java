public class JumpStatements {

    public static void main(String[] args) {
    for (int i = 0; i<=10; i++) {    
        System.out.println(i);    
        if(i==5) {   
            System.out.println("Will break and stop the execution"); 
        break ;    
        }    
    }




    // continue
    System.out.println("Continue Example");

    for (int j = 0; j<=10; j++) {    
            
        if(j==5) {    
            System.out.println("Skiped");
        continue ;    
        }    else{
            System.out.println(j);
        }
    }
    
}}
