/*package ALGORITHMS_MOHAMED_SALAH;
import java.util.Scanner;


public class main {

  

    public static void main(String[] args) {
    
    
    
    ///// SCAN SIZE OF THE ARRAY  
      Scanner xScanner=new Scanner(System.in);
      System.out.println("Enter the size of the random array you need to test on: ");
      int arr_size= xScanner.nextInt();
    
    /////// create random array
    System.out.printf("%n The random array to test the QUICK sort: %n");
      random_arr_gen rArr_gen=new random_arr_gen();
      int[] arr_quick=rArr_gen.random_arr(arr_size);

    //////// qucik sort 
       quickSort qSort= new quickSort();
      
       

       long startTime_quick = System.nanoTime(); // start a timer to  get time of the insertion algoritm
       qSort.quickSort(arr_quick,0,arr_size-1);
       double elapsedTime_quick = (System.nanoTime() - startTime_quick)/1000000;// calculating the elapsed time for the insertion algorithm
       
       System.out.println("QUCIKSORT: ");
        for(int i=0;i<arr_quick.length;++i){
            System.out.print(arr_quick[i] + " ");
          } 
       
          
    //////// Merge sort      
        System.out.printf("%n%n The random array to test the merge sort: %n");
       
        Merge_sort mSort= new Merge_sort();
        int[] arr_merge=rArr_gen.random_arr(arr_size);
        long startTime_merge = System.nanoTime(); // start a timer to  get time of the merge algoritm
        mSort.mergeSort(arr_merge,arr_size);
        double elapsedTime_merge = (System.nanoTime() - startTime_merge)/1000000;// calculating the elapsed time for the merging algorithm

        System.out.println("Merge sort: ");
        for(int i=0;i<arr_merge.length;++i){
            System.out.print(arr_merge[i] + " ");
          }    

          System.out.printf("%n %n Time elapsed for MERGE algoritm is: %f",elapsedTime_merge);
          System.out.printf("%n %n Time elapsed for QUICKSORT algoritm is: %f",elapsedTime_quick);
        
        }
    }

    */