package Main;

public abstract class Chessman {
    public abstract boolean move ();
    public boolean isWhite;
    public char name;
    public boolean isMoved = false;

    @Override
    public String toString() {
        return (isWhite ? "W" : "B") + name;
    }
}