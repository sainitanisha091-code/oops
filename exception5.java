import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    String id;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
     try{
         if (!id.contains("@")|| !id.contains(".")|| (id.indexOf("@") > id.indexOf("."))){
             throw new Exception ("s");
         }
        System.out.print("Valid");
     }
      catch(Exception e){
          if (e.getMessage().equals("s")){
              System.out.print("Invalid");
          }
      }
  }
}