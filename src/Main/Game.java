package Main;
import java.util.Scanner;
public class Game {
    Board board;

    public Game (){
        board=Board.factor();

        //initialChess ();
    }

    /**
     *
     * @param turn
     */
    private void move(boolean turn){
        int[] start=getLocate();
        int[] end=getLocate();
        Piece chess=board.getBoard()[start[0]][start[1]];
        if (!chess.getIsWhite()==turn){
            move(turn);
            return;
        }
        if(chess.checkPath(board.getBoard(),start[0],start[1],end[0],end[1])){
            chess.move(board.getBoard(),start[0],start[1],end[0],end[1]);
        }
        else {
            move(turn);
        }
    }

    /**
     *
     * @return
     */
    private int[] getLocate(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.length()!=2){
            System.out.print("wrong input");
            return getLocate();
        }
        int hor=Integer.valueOf((input.substring(0,1)));
        int ver=(input.substring(0,1)).charAt(1)-97;
        if (hor>8||hor<0||ver>8||ver<0){
            return getLocate();
        }
        int[] output={hor,ver};
        return output;
    }



    @Override
    public String toString () {
        return board.toString();
    }



}
