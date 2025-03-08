public class FindFactorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else {
            return n*fact(n-1);        }
    }
    public static void main(String[] args) {
        int n=5,f=1;
        System.out.println("with recursion "+fact(n));
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        System.out.println("without recursion "+f);

    }
}
