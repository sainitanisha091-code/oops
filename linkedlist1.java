import java.util.LinkedList;
import java.util.Scanner;
public class linkedlist1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    LinkedList<Integer>list = new LinkedList<>();
    for (int i = 0 ; i < n ; i++){
        int num = sc.nextInt();
         list.add(num);
    }
    int x = sc.nextInt(); 
    list.addFirst(x);
    System.out.println(list);
    sc.close();
}
}
