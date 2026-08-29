import java.io.*;
import java.util.*;

public class file2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("data.txt");
        String name = sc.nextLine();
        fos.write(name.getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream("data.txt"); 
        int ch ; 
        while ((ch=fis.read())!=-1) {
            System.out.print((char)ch);
        }
        fis.close();
        sc.close();
    }
}
