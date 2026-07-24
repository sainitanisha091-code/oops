import java.util.*;
public class second_largest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int[] arr = new int[n];
    for (int i = 0 ; i < n ; i++){
        arr[i]= sc.nextInt();
    }
    int max1 = arr[0];
    int max2 = 0;
    for (int i = 0 ;i < n ;i++){
        if (arr[i]> max1){
            max2 = max1; 
            max1 = arr[i];
        }
        else if (arr[i]>max2 && arr[i]!=max1){
            max2 = arr[i];
        }
       
    }
     System.out.println(max2);
    sc.close();
}
}