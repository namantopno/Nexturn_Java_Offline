public class UseMethod {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int x=5,y=3;
        int z= add(x,y);
        System.out.println(z);
    }
}
