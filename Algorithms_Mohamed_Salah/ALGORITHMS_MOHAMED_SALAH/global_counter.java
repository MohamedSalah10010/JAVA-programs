package ALGORITHMS_MOHAMED_SALAH;

public  class global_counter{
    public static long merge_counter;
    public static void setMerge_counter(long merge_counter) {
        global_counter.merge_counter = merge_counter;
    }
    public static long getMerge_counter() {
        return merge_counter;
    }
    public  static long insertion_counter;

    public static void setInsertion_counter(long insertion_counter) {
        global_counter.insertion_counter = insertion_counter;
    }
    public static long getInsertion_counter() {
        return insertion_counter;
    }
}