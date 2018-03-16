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
//        boolean flag = true;
//        if(startX == goalX){
//            for(int i=0; i<=(goalX-startX); i++){
//                if(!(checkPath(board,startX,startY,goalX,startY+i))){
//                    return false;
//                }
//            }
//            super.move(board,startX,startY,goalX,goalY);
//        }
//        else if(startY == goalY){
//            for(int i=0; i<=(goalY-startY); i++){
//                if(!(checkPath(board,startX,startY,startX+i,startY))){
//                    return false;
//                }
//            }
//            super.move(board,startX,startY,goalX,goalY);
//        }
        if(startX == goalX | startY == goalY){
            int x = goalX - startX;
            int y = goalY - startY;
            if(x != 0){
                int tempStartX = startX;
                for(int i=0; i != Math.abs(x); i++){
                    checkPath(board,startX,startY,startX,startY);
                }
            }
        }
        return false;
    }
}
