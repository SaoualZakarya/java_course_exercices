public class Rectangle extends Shape {

    private int height ;
    private int width ; 

    public Rectangle(String name,int width , int height ){
        super(name) ;
        this.height = height ;
        this.width = width ;
    }

    public int getHeight(){
        return height ;
    }

    public int getWidth(){
        return width ;
    }

    public int getArea (){
        return 5 ;
    }
    public int getPermeter (){
        return 5 ;
    }


}