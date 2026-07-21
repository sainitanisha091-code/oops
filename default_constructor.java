 class default_constructor_student{
    String name;
    int age ;
    
    default_constructor_student(){
        name = "Tanisha";
        age = 19;
    }
    public static void main(String[] args) {
        default_constructor_student s1 = new default_constructor_student();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}