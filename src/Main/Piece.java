package Main;

public abstract class Piece {
    public boolean isWhite;
    public char name;
    public boolean isMoved = false;
    public Cell currentCell;

    public boolean move (Piece board[][], int startX, int startY, int goalX, int goalY) {
        if ( checkPath ( board, startX, startY, goalX, goalY) ){
            board[goalY][goalX] = board[startY][startX];
            board[startY][startX] = null;
            return true;
        }

        return false;
    }

    public boolean checkPath (Piece[][] board, int startX, int startY, int goalX, int goalY){
        if (board[goalY][goalX] == null || board[goalY][goalX].isWhite != isWhite){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return (isWhite ? "W" : "B") + name;
    }
}