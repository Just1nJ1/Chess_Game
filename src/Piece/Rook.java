package Piece;

        import Main.Board;
        import Main.Piece;

public class Rook extends Piece {
    private Rook (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'R';
    }

    public static Piece factor(boolean isWhite){
        return new Rook(isWhite);
    }

    @Override
    public boolean checkPath(Piece board[][], int startX, int startY, int goalX, int goalY) {
        boolean flag = true;
        if(startX == goalX){
            for(int i=0; i <= Math.abs(goalX-startX); i++){
                if(!(super.checkPath(board,startX,startY,goalX,startY + ((goalY-startY)/Math.abs(goalY-startY))*i))){
                    return false;
                }
            }
            //super.move(board,startX,startY,goalX,goalY);
            return true;
        }
        else if(startY == goalY){
            for(int i=0; i<=Math.abs(goalY-startY); i++){
                if(!(super.checkPath(board,startX,startY,startX + ((goalX-startX)/Math.abs(goalX-startX))*i,goalY))){
                    return false;
                }
            }
            //super.move(board,startX,startY,goalX,goalY);
            return true;
        }
        return false;
    }
}
