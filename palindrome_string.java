import java.util.*;
public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = str.length()-1 ; i>= 0 ; i--){
            result = result+  str.charAt(i);
        }
        if (str.equals(result)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
