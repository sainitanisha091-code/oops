class Mobile {
    String company;
    String model;
    int price;

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.company = "Samsung";
        m1.model = "S24 Ultra";
        m1.price = 1000;

        m2.company = "Oppo";
        m2.model = "K13X";
        m2.price = 100;

        m3.company = "Vivo";
        m3.model = "Z4";
        m3.price = 500;

        System.out.println(m1.company);
        System.out.println(m1.model);
        System.out.println(m1.price);

        System.out.println(m2.company);
        System.out.println(m2.model);
        System.out.println(m2.price);

        System.out.println(m3.company);
        System.out.println(m3.model);
        System.out.println(m3.price);
    }
}