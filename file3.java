import java.io.*;
import java.util.*;;
public class file3 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in); 
        String l1 = sc.next(); 
        String l2 = sc.next(); 
        FileWriter fw = new FileWriter("data.txt"); 
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(l1);
        bw.newLine();
        bw.write(l2);
        bw.close();
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        String line ; 
        while ((line = br.readLine())!=null) {
            System.out.println(line);
            
        }
        br.close();
        sc.close();



    }
}
