package ALGORITHMS_MOHAMED_SALAH;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
   
    int [][] a= {
        {1,1,4,21},
        {2,5,5,2},
        {3,15,3,0},
        {3,3,20,5}
        };
    int [][] b={
        {3,32,3,0},
        {2,20,25,6},
        {1,145,1,5},
        {2,0,86,1}
    };

    Strassen_algorithm multiplication=new Strassen_algorithm();
    int [][] c= multiplication.multiply(a,b);
    
    for(int i=0;i<c.length;i++){
        for(int j=0;j<c[0].length;j++){
        System.out.print(c[i][j] +" ");
        }
        System.out.println();
        }
        
    }
}
