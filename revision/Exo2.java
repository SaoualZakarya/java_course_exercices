// class Exo2 {
//     Exo2 e;
//     Exo2(Exo2 e) {
//         this.e = e;
//     }
//     Exo2() {
//         this.e = this;
//     }
//     public String toString() {
//         if(this.e == null) return "NULL";
//         else return "LLUN";
//     }
//     Exo2 m1() {
//         System.out.println("Bonjour le monde");
//         return this;
//     }
//     void m2(Exo2 e) {
//         this.e = null;
//         this.m1();
//         e.e = this;
//         System.out.println(this);
//     }
//     public static void main(String[] truc) {
//         new Exo2();
//         Exo2 e = new Exo2();
//         e.m2(e);
//         Exo2 f = new Exo2(e);
//         e.m2(f);
//     }
// }

// class A extends Object{
//     int i;

//     A (int i){
//         this.i = i ;
//     }
//     A () {
//         this.i = 1;
//     }
// }

// class B extends A{
//     A bidule;
//     int i = 2;
//     B(){ 
//         this.bidule = this; 
//     }
//     B(A a){
//         super(3);
//         this.bidule = a;
//     }
//     public static void main(String[] toto){
//         A a2 = new A(5);
//         B b1 = new B(a2);
//         B b2 = new B(); 
//         System.out.println(b1.i);
//         System.out.println(((A) b1).i);
//         System.out.println(b1.bidule.i);
//         System.out.println(b2.i);
//         System.out.println(((A) b2).i);
//         System.out.println(b2.bidule.i);
//     }
// }

