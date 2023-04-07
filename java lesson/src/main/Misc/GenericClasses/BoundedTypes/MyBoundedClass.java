package main.Misc.GenericClasses.BoundedTypes;

public class MyBoundedClass <T extends Number,V extends Number>  {

    T x;
    V y;

    MyBoundedClass(T x, V y){
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
