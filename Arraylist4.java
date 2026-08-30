import java.util.*;

public class Arraylist4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
