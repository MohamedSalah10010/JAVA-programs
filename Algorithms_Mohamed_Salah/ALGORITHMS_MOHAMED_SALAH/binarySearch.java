package ALGORITHMS_MOHAMED_SALAH;


public class binarySearch {
    
    public void binary_Search(int v[], int To_Find)
{
    int lo = 0, hi = v.length - 1;
    // This below check covers all cases , so need to check
    // for mid=lo-(hi-lo)/2
    while (hi - lo > 1) {
        int mid = (hi + lo) / 2;
        if (v[mid] < To_Find) {
            lo = mid + 1;
        }
        else {
            hi = mid;
        }
    }
    if (v[lo] == To_Find) {
      System.out.println("Found At Index " + lo );
    }
    else if (v[hi] == To_Find) {
        System.out.println("Found At Index " + hi );
    }
    else {
        System.out.println("Not Found" );
    }
}
}
