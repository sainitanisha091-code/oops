import java.util.*;

class Solution {

    public static void validateTransaction(double balance, double amount) {

        try {
            if (amount > balance) {
                throw new Exception("b");
            }
            else if (amount <= 0) {
                throw new Exception("a");
            }

            balance = balance - amount;

            System.out.print("Transaction Successful: Remaining Balance = " + balance);
        }

        catch (Exception e) {
            if (e.getMessage().equals("b")) {
                System.out.println("Invalid transaction: Insufficient balance.");
            }
            else if (e.getMessage().equals("a")) {
                System.out.println("Invalid transaction: Withdrawal amount must be greater than 0.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            double balance = sc.nextDouble();
            double amount = sc.nextDouble();

            validateTransaction(balance, amount);
        }
    }
}
