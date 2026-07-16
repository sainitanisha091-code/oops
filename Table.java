import java.util.Scanner;
public class Table{
   
public static void main(String[] args) {
    int result = 0;
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the value of n ");
    int n = sc.nextInt();
    for (int i = 1 ; i <=10 ; i++){
        result = n*i;
        System.err.println(n + "x"+  i + "=" +  result);
    }


    sc.close();
}
}