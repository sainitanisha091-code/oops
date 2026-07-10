import java.util.Scanner;

public class sum_matrix {
    int a[][],b[][],c[][];
    public void inputData()
    {
        Scanner sc = new Scanner(System.in);
        a = new int [3][3];
        b = new int [3][3];
        c = new int [3][3];
        // Scaner // user input
        System.out.println("enter first matrix"); 
        for (int i = 0 ; i <3; i++){
            for (int j = 0 ; j < 3 ; j++){
                a[i][j]= sc.nextInt();
            }
        }
         System.out.println("enter second matrix"); 
        for (int i = 0 ; i <3; i++){
            for (int j = 0 ; j < 3 ; j++){
                b[i][j]= sc.nextInt();
            }
        }
        sc.close();
    }
    public void addmatrix()
    {
        for (int i = 0 ; i <3; i++){
            for (int j = 0 ; j < 3 ; j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }
    }
    public void displayResult(){
        for (int i = 0 ; i <3; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        sum_matrix m = new sum_matrix(); 
        m.inputData();
        m.addmatrix();
        System.out.println("sum of matrix :");
        m.displayResult();
    }

}

