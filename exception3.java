import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    // constructor
    InsufficientBalanceException(String message){
        super(message);
    }
}
public class exception3{
   static void checkBalance(int balance) throws InsufficientBalanceException{
    if (balance<1000){
        throw new InsufficientBalanceException("InsufficientBalance");
    }
   }
   public static void main(String[] args) {
    
   
   Scanner sc = new Scanner(System.in);
   int balance = sc.nextInt();
   try{
    checkBalance(balance);
   }
   catch(InsufficientBalanceException e){
    System.out.println("insufficent balance");
   }
}
}