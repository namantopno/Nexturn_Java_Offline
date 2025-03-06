import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter a string or a number");
        String s = br.readLine();
        int l = s.length();
        String r = "";
        //StringBuilder r = new StringBuilder("");
        for (int i = l-1; i >=0; i--) {
            r+=(s.charAt(i));
        }
//        System.out.println(r);
//        System.out.println(s);
        boolean b= r.equals(s);
        if(b){
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
}
