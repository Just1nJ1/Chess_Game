package Main;

public abstract class Piece {
    public abstract boolean move (Piece[][] board, int startX,int startY,int goalX,int goalY);
    public boolean isWhite;
    public char name;
    public boolean isMoved = false;
    public Cell currentCell;

    @Override
    public String toString() {
        return (isWhite ? "W" : "B") + name;
    }
}