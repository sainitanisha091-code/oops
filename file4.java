import java.io.*;
import java.util.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class file4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        Student s = new Student(id, name);
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1 = (Student) ois.readObject();
        System.out.println(s1.id);
        System.out.println(s1.name);
        ois.close();
        sc.close();

    }
}
