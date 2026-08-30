import java.io.*;

class Main
{
    static int countWords(String filename)
    {
        try{
        BufferedReader br = new BufferedReader(new FileReader(filename)); 
        String line ; 
        int count = 0 ; 
        while ((line = br.readLine())!=null){
            String [] words = line.split(" ");
            count+= words.length;
        }
        br.close();
        return count;
        } 
        catch(Exception e){
            return 0;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(countWords("data.txt"));
    }
}
