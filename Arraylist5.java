import java.util.*;
public class Arraylist5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt(); 
            list.add(num);
        }
        int max = list.get(0) ; 
        for (int i = 0 ; i < n ; i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
