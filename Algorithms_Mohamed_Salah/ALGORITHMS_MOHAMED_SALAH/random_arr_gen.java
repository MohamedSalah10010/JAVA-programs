package ALGORITHMS_MOHAMED_SALAH;

import java.util.Random;
public class random_arr_gen {

    public random_arr_gen() {
    }
    public static int[] random_arr(int size){
        Random rd = new Random(); // creating Random object
      int[] arr = new int[size];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(); // storing random integers in an array
         System.out.print(arr[i]+", "); // printing each array element
        }
        System.out.println("\n");
        return arr;
    }
    public static int[] random_arr(int size, int lim){
        Random rd = new Random(); // creating Random object
      int[] arr = new int[size];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(lim); // storing random integers in an array
         System.out.print(arr[i]+", "); // printing each array element
        }
        System.out.println("\n");
        return arr;
    }

/*public static void main(String[] args) { ///// for test//////////
   int[]arr_1= random_arr(20);
    arr_1[2]=20;
    System.out.println(arr_1[2]);
}
*/ 
}