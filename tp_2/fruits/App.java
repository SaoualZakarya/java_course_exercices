public class App {

    // I need to read about casting and polymorphisme

    public static void main (String[] args) {
        ClassA a = new ClassB(5,4);
        a.method1();
        // a.method2();  // will not work 
        // ClassB b = new ClassA(5);   // don't works

    }

}