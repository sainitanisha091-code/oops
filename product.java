import java.util.Scanner;

class Product {
    int ProductID;
    String Productname;
    double price;
    int quantity;

    Product(int ProductID, String Productname, double price, int quantity) {
        this.ProductID = ProductID;
        this.Productname = Productname;
        this.price = price;       
        this.quantity = quantity;
    }   

    void displaydetails() {
        System.out.println("Product ID : " + ProductID);
        System.out.println("Product Name : " + Productname);
        System.out.println("Price : ₹" + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total : ₹" + calculateTotal());
    }

    double calculateTotal() {
        return price * quantity;
    }
}

public class product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] product = new Product[n];

        double grandtotal = 0;

        for (int i = 0; i < n; i++) {

            int ProductID = sc.nextInt();
            String Productname = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            product[i] = new Product(ProductID, Productname, price, quantity);
        }

        for (int i = 0; i < n; i++) {

            product[i].displaydetails(); 

            grandtotal += product[i].calculateTotal();
        }
        System.out.println("Grand Total = ₹" + grandtotal);
    }
}