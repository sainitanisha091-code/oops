public class cons_3 {
    String name;
    String model;
    int storage;
    int price;

    cons_3(String a, String b, int c, int d) {
        name = a;
        model = b;
        storage = c;
        price = d;
    }

    public static void main(String[] args) {
        cons_3 c1 = new cons_3("acer", "aspire", 500, 45000);
        cons_3 c2 = new cons_3("dell", "ryzen", 200, 45500);
        System.out.println(c1.storage);
        System.out.println(c2.storage);
    }
}
