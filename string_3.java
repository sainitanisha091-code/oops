import java.util.*;
public class string_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] words = str.split(" ");
        for (String word : words){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
        sc.close();
    }
}