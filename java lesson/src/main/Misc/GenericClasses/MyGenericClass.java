package main.Misc.GenericClasses;

public class MyGenericClass <T,V> {

    T x;
    V y;

    MyGenericClass(T x, V y){
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
