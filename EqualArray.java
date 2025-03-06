import java.util.Scanner;
import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] a={1,2,3,4,5,6};
        int[] b={1,2,3,4,5,7};
        if(Arrays.equals(a, b)){
            System.out.println("Array are equal");
        }
        else{
            System.out.println("Array not equal");
        }
    }
}
