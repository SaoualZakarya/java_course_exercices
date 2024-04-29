public class ClassB extends ClassA {
    public int g ;
    // constructor
    public ClassB(int x ,int g){
        super(x);
        this.g = g;
    }
    public int getG() {
        return this.g ;
    }
    public int getX() {
        return this.x ;
    }
    public void method2 () {
        System.out.println("Method 2 of B");
    }
    public void method1(){
        System.err.println("Method inherited from  A");
    }
    public static void main(String [] args){
        // ClassB b = new ClassB(5, 10) ;
        // b.method1();
        // b.method2();
    }

}
