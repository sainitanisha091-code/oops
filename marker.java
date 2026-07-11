public class marker {
    String color;               //Imagine a class is a blueprint for a house.
    String brand;               //This blueprint doesn't create a real marker.
    int size;
 
    void write(){
        System.out.println("writing");
    }
    void open(){
        System.out.println("opening");
    }
    void close(){
        System.out.println("closing");
    }
}
    class Innermarker {
    public static void main(String[] args) {
        marker m = new marker();       //  "Build one real marker from the blueprint and call it m."
        m.color = "black/white";
        m.brand = "luxor";
        m.size = 20;
        
        marker p = new marker();
        p.color = "Red"; 
        p.brand = "pro";
        p.size = 50;

        System.out.println(m.color);
        System.out.println(m.brand);
        System.out.println(m.size);

        m.write();
        m.open();
        p.close();
    }
    }


