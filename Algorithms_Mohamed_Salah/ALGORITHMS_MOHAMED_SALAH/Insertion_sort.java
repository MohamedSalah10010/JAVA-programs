package ALGORITHMS_MOHAMED_SALAH;


public class Insertion_sort {
    
 // global_counter insertCounter= new global_counter();
    public  void Insertion(int [] rand_arr){
      long insert_Counter=0;
        for(int i=0;i<rand_arr.length;++i){
  
          int j = i;
          
          while(j > 0 && rand_arr[j-1]>rand_arr[j]){
            insert_Counter++;
            global_counter.setInsertion_counter(insert_Counter);
            int key = rand_arr[j];
            rand_arr[j] = rand_arr[j-1];
            rand_arr[j-1] = key;
            j = j-1; 
  
          
        }
      }
    }
/*///////// for test////////
      public static void main( String args[] ) {
          int [] arr = {5,2,12,12,1};
          Insertion(arr);
  
          for(int i=0;i<arr.length;++i){
            System.out.print(arr[i] + " ");
          }    

        }
        */
}
