import java.util.*;
public class hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        HashSet<Integer> list =  new HashSet<>(); 
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt(); 
            list.add(num);
        }
        System.out.println(list);
        sc.close();
    }
}
