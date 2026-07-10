import java.util.Scanner;

public class matrix_multi {
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
    public void multimatrix()
    {
        for (int i = 0 ; i <3; i++){
            for (int j = 0 ; j < 3 ; j++){
                c[i][j]=0;    
                for (int k = 0 ; k< 3 ; k++){
                    c[i][j]+= a[i][k]*b[k][j];
                }
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
        matrix_multi m = new matrix_multi(); 
        m.inputData();
        m.multimatrix();
        System.out.println("multiplication of matrix :");
        m.displayResult();
    }
}

 