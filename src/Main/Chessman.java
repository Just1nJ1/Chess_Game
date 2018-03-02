package Main;

public abstract class Chessman {
    public abstract boolean move (char posX, int posY);
    public boolean isWhite;
    public char name;
    public boolean isMoved = false;
    public Cell currentCell;

    @Override
    public String toString() {
        return (isWhite ? "W" : "B") + name;
    }
}