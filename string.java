public class string {
    public static void main(String[] args) {
        String a = "hello";
        String b = "helLo";
        String e = "programing";
        e = e.concat(" with java");

        String c = new String("hello");
        String d = new String("hello");
        System.out.println(a==c);   // memory 
        System.out.println(a.equals(c));  // content
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.charAt(1));
        System.out.println(d.toUpperCase());
        System.out.println(a.contains("llo"));
        System.out.println(e.substring(3,7));
        System.out.println(e.replace('g','l'));
        System.out.println(e.indexOf('r'));
        System.out.println(e);
    }
}
 