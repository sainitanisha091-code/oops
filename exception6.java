import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int q = sc.nextInt();
        
        for(int j = 0 ; j < q ; j++){
            int r =  sc.nextInt();
        
        try{
 
           if (r<0 || r>=n){
               throw new Exception("d");
           }
       
           System.out.println(arr[r]);
       
        }
        catch (Exception e){
            if (e.getMessage().equals("d")){
                System.out.println("Out of Bounds");
            }
        }
       
        }
    }
}