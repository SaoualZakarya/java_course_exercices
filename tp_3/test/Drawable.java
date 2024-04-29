public interface Drawable {
    void draw();
    default void defaultDraw (){
        System.out.println("Drawing a shape");
    };
}
