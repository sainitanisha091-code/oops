public class wrapper {
    public static void main(String[] args) {

        int a = 10;
        // boxing
        Integer b = Integer.valueOf(a);

        // unboxing
        int c = b.intValue();

        // Autoboxing
        Integer d = a;

        // Autounboxing

        int e = d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
