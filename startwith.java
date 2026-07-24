import java.util.*;
public class startwith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.startsWith("T")){
            System.out.print(1);
        }
        sc.close();
    }
}
