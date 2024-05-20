import java.util.Arrays;
import java.util.List;
public class DemoArrayMethods {
    public static void main(String[] args) {
        


    //     //asList() 
    //     String[] str={"aaa","bbb","ccc"};

    //     for (String string : str) {
    //         System.out.println("String arr : "+string);
    //     }

    //    List<String>list= Arrays.asList(str);

    //    for (String string1 : list) {
    //     System.out.println("String list : "+string1);
    //    }

    //     //fill()

    // int[] fillM=new int[5];
    // Arrays.fill(fillM, 1000);//give initial values 

    // for (int i : fillM) {
    //     System.out.println("fill() : "+ i);
    // }

        //copyOf()

    // // int[] a1=new int[5];
    // int[] a1={1,2,3,4,5};
    // int[] a2=Arrays.copyOf(a1,a1.length);

    // a2[2]=47;

    // for (int i : a1) {
    //     System.out.println("a1 elements : "+i);
    // }

    // for (int i : a2) {
    //     System.out.println("a2 elements"+i);
    // }

    //     //equals()
    // String[] s1={"one","two","three"};
    // String[] s2={"one","two","three"};//true
    // // String[] s2={"four","five","Six"};//false

    //     System.out.println(Arrays.equals(s1,s2));



    // //compare()


    //  String[] s1={"one","ztwo","three"};
    //  String[] s2={"one","two","three"};


    // int z=Arrays.compare(s1,s2);
    // System.out.println(z);//0 are both are same
    // System.out.println(z);//-6 as s2 has "ztwo"
    // System.out.println(z);//6 as s1 has "ztwo"


        // //sort()

        // int[] ss={1,5,7,4,2,9,6};
        // String[] strss={"aa","gg","rr","tt","jj"};

        // Arrays.sort(ss);
        // ss.
        // for (int i : ss) {
        //     System.out.println(i+" ");
        // }

        // Arrays.sort(strss);
        // for (String string : strss) {
        //     System.out.println(string);
        // }



    //sort eg 2
        // int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
 
        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
    
        // Arrays.sort(arr, 1, 5);
 
        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        
        
        //  System.out.println("Modified arr[] : "  + Arrays.toString(arr));
           
        
        // for (int j : arr) {
        //         System.out.print(j+" ");
        //     }


            //binarySearch()

            int[] binSer={1,4,6,7,8,10,30,2,};

            System.out.println(Arrays.binarySearch(binSer, 30));








    }
}
