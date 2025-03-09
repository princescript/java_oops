import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;
        int etc = 80;
        //Heap new int[4]; Stack {}
        int[] numbers = {10,20,30,40};

        int[] arr = new int[8];
        arr[0]=50;
        arr[2]=80;

        //for(int i =0 ; i < arr.length; i++){
        //      System.out.println(arr[i]);
        //}
        for (int value : arr){
            System.out.println(value);
        }

        //1.Search element
        int[] arr2 = {41,87,5,42,55,84};
        // String str = Arrays.toString(arr2);
        //System.out.println(str.contains("55"));
        //for (int value :arr2){
        //    if(value == 55){
        //        System.out.println("Have");
        //    }}

        //2. Max Element
       int res = Integer.MIN_VALUE;
       //for (int i = 0; i < arr2.length; i++) {
       //     if( arr2[i] >= res){
       //        res = arr2[i];
       //     }
       // }System.out.println(res);

        //3. Reverse Print Array
        //for (int i = arr2.length - 1; i >= 0; i--) {
        //    System.out.println(arr2[i]);
        //}

        //4. sum of Array
        int sum =0;
        /*for (int i = arr2.length - 1; i >= 0; i--) {
            sum += arr2[i];
        }
        System.out.printf("Sum of Array : %d",sum);*/


    }
}





