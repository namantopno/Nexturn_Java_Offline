//4.reverse the string using recursion
public class RecursionReverse {
    public static String rev(String s){
        if(s.length() == 0)
            return s;
        else
            return rev(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(rev(str));
    }
}