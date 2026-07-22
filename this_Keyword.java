public class this_Keyword {
    String name ;
    int age ; 
    char grade;
    int marks;

    this_Keyword(String name , int age, char grade , int marks){
        this.name = name;
        this.age = age; 
        this.grade = grade;
        this.marks = marks;
    }
    void display(){
        System.out.println(name);
        System.err.println(age);
        System.out.println(grade);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        this_Keyword t1 = new this_Keyword("tanisha",19 , 'o', 100);
       t1.display();
    }
}
