import java.util.Scanner;

public class DemoPassArrayMethod {
    public static void main(String[] args) {
        
        System.out.println("Enter the elements");
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            marks[i]=sc.nextInt();

        }
        System.out.println("pass array by method");
        display(marks);
        System.out.println("return array method");
        int[] m=returnArray();
        for (int i : m) {
            System.out.println(i);
        }

    }
    public static void  display(int m[]){
        for (int i : m) {
            System.out.println(i);
        }
    }


    // return array from  method 

    public static int[]  returnArray(){
        int marks[]={1,2,3};
        return marks;
    }




     }

