class car {
    String brand;
    int price;

    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();
        c1.brand = "BMW";
        c1.price = 1000;

        c2.brand = "Audi";
        c2.price = 500;

        System.out.println(c1.brand);
        System.out.println(c2.brand);
        System.out.println(c1.price);
    }
}