import java.util.*;
public class Arraylist2 {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in); 
    int n = sc.nextInt(); 
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0 ; i < n ; i++){
        int num = sc.nextInt(); 
        list.add(num);
    }
    
        int indexq = sc.nextInt(); 
        list.remove(indexq);
        System.out.println(list);
    sc.close();
 }
}
