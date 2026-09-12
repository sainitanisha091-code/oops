class Box {
   private int length; 
    private int breadth; 
    private int height; 
    Box(){
        length = 0 ; 
        breadth = 0 ;
        height = 0;
    }
    Box(int length , int breadth , int height){
        this.length = length; 
        this.breadth = breadth ; 
        this.height = height;
    }
    Box(Box b1){
        this.length = b1.length; 
        this.breadth = b1.breadth; 
        this.height = b1.height;
    }
    int getlength(){
        return length;
    }
    int getbreadth(){
        return breadth;
    }
    int getheight(){
        return height;
    }
    long calculateVolume(){
        return (long)length*breadth*height;
    }
    
}
