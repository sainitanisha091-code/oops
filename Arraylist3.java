import java.util.*;
public class Arraylist3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt(); 
            list.add(num); 
        }
        int index = sc.nextInt();
        int value = sc.nextInt();
        list.set(index,value);
        System.out.println(list);
        sc.close();

    }
}
