public class wrapper3 {
    public static void main(String[] args) {
        String str = "100";
        int x = Integer.parseInt(str);
        Integer a = x;
        int b = a;
        int sum = b + 50;
        System.out.println("Original String: " + str);
        System.out.println("Parsed int: " + x);
        System.out.println("Integer object: " + a);
        System.out.println("Final value: " + sum);
    }
}
