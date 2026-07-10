class Main {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(double a, double b) {  // method overloding
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    public static void main(String[] args) {
        add(1, 2);
        add(3, 4);
        int m = 30;
        int n = 40;
        add(m, n); // call by value
        add(3.5, 5.5);
        add(1, 2, 3);
    }
}
 