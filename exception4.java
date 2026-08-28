import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String password = sc.nextLine();

        try {

            if (password.length() < 6) {
                throw new Exception("s");
            }

            if(!password.matches(".*[0-9].*")){
                throw new Exception("d");
            }

            System.out.println("Correct");

        }
        catch (Exception e) {

            if (e.getMessage().equals("s")) {
                System.out.println("Too short!");
            }
            else if (e.getMessage().equals("d")) {
                System.out.println("No digit!");
            }
        }
    }
}