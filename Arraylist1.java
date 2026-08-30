import java.util.*;
public class Arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int search = sc.nextInt(); 
        if (list.contains(search)){
            System.out.println("found" );
        }
        else{
            System.out.println("not found");
        }
        sc.close();

    }
     
}