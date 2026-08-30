import java.util.*;
public class linkedlist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt(); 
            list.add(num);
        }
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        sc.close();
    }
}
