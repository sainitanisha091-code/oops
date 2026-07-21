public class para_cons_student {
    String name;
    int age;

    para_cons_student(String a, int b) {
        name = a;
        age = b;
    }

    public static void main(String[] args) {
        para_cons_student s1 = new para_cons_student("tanisha", 19);
        System.out.println(s1.name);
        System.out.println(s1.age);
        para_cons_student s2 = new para_cons_student("Riya", 20);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
