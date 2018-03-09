package Main;

public abstract class Piece {
    public boolean isWhite;
    public char name;
    public boolean isMoved = false;
    public Cell currentCell;
    private boolean meetDiff = false;


    /**
     * last change: 12:55 Mar 9 By Justin
     * @param board
     * @param startX
     * @param startY
     * @param goalX
     * @param goalY
     */
    public void move (Piece board[][], int startX, int startY, int goalX, int goalY) {
        board[goalY][goalX] = board[startY][startX];
        board[startY][startX] = null;
        meetDiff = false;
        isMoved = true;
    }

    /**
     * last change:
     * @param board
     * @param startX
     * @param startY
     * @param goalX
     * @param goalY
     * @return true if it can reach. Otherwise false.
     */
    public boolean checkPath (Piece[][] board, int startX, int startY, int goalX, int goalY){
        if (board[goalY][goalX] == null){
            return true;
        } else if (board[goalY][goalX].isWhite != isWhite && !meetDiff) {
            meetDiff = true;
            return true;
        }

        return false;
    }

    /**
     * last change:
     * @return Piece color and name.
     */
    @Override
    public String toString() {
        return (isWhite ? "W" : "B") + name;
    }
}