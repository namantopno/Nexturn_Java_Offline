import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
    public static void main(String[] args)throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter a string: ");
        String s = br.readLine();
        String r="";
        int l = s.length();
        for(int i=l-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        if(s.equalsIgnoreCase(r)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
            }      
    }
    
}
