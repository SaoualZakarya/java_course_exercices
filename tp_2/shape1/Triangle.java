public class Triangle extends Shape {

    private int height ;
    private int base ; 

    public Triangle(String name,int base , int height ){
        super(name) ;
        this.height = height ;
        this.base = base ;
    }

    public int getHeight(){
        return height ;
    }

    public int getBase(){
        return base ;
    }

    public int getArea (){
        return 5 ;
    }
    public int getPermeter (){
        return 5 ;
    }


}