//1.Create a Method to Find the Maximum of Two Numbers
//	•	Write a method findMax(int a, int b) that returns the larger of the two numbers.
//  •	Call this method from main and print the result.give code
public class MaximunOfTwo {
    public static int max(int a, int b){
        if(a>b){
            return a;
        } else  {
            return b;
        }
    }
    public static void main(String[] args) {
        int x=5,y=4;
        if(x==y){
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println(max(x,y)+" is maximum number");
        }
    }
}
