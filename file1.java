import java.io.*;
import java.util.*; 
public class file1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in); 
        String name = sc.nextLine(); 
        FileWriter fw = new FileWriter("data.txt");
        fw.write(name);
        fw.close();

        FileReader fr =new FileReader("data.txt");
        int ch ; 
        while ((ch= fr.read())!=-1) {
            System.out.print((char)(ch));
            
        }
        
        fr.close();
        sc.close();
    }
}