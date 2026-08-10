class Pen {
    String color ; 
    String type ;

    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }

}

public class oops {
     public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "ball";

        Pen p2 = new Pen(); 
        p2.color = "Black";
        p2.type = "gel";

        p1.write();
        p1.printcolor();
        p2.printcolor();
     }
    
}
