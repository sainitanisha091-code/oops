import java.util.Scanner;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        TreeSet<Integer> list =  new TreeSet<>(); 
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt(); 
            list.add(num);
        }
        
        System.out.println(list);
        System.out.println(list.first());
        System.out.println(list.last());
        sc.close();
}
}