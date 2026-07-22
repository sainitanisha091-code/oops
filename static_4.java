 class Student {
    String name;
    static int count = 0;
    static String college = "chitkara university";
    Student(){
        count++;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(count);
        s1.name = "Tanisha";
        s2.name = "vanshika";
        s3.name = "rewa";
        System.out.println(s1.name);
        System.out.println(s1.college);
        System.out.println(s2.name);
        System.out.println(s2.college);
    }
}
