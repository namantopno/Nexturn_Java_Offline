import java.util.Scanner;

public class UsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i=1;
        while(n>0){
            System.out.println(i);
            i++;
            --n;
        }
    }
}
