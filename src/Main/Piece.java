package Main;

public abstract class Piece {//Piece on this board is move from (startX,startY) to (goalX,goalY)
    public boolean move (Board board, int startX,int startY,int goalX,int goalY) {
        if ( checkPath ( board, startX, startY, goalX, goalY ) ){
            board.getBoard ()[goalY][goalX] = board.getBoard ()[startY][startX];
            board.getBoard ()[startY][startX] = null;
            if (!this.isMoved){ this.isMoved = true; }
            return true;
        }

        return false;
    }

    public boolean checkPath (Board board, int startX,int startY,int goalX,int goalY){
        if ( board.getBoard ()[goalY][goalX] == null || board.getBoard ()[goalY][goalX].isWhite != isWhite){
            return true;
        }

        return false;
    }

    public boolean isWhite;
    public char name;
    public boolean isMoved = false;
    public Cell currentCell;
    @Override
    public String toString() {
        return (isWhite ? "W" : "B") + name;
    }
}