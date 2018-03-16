package Main;
import java.util.Scanner;
public class Game {
    Board board;
    boolean turn;
    public Game (){
        board=Board.factor();
        turn=true;
        //initialChess ();
    }

    /**
     *
     * @param turn
     */
    public void move(String startP,String startE){
        System.out.print("type");
        int[] start=getLocate(startP);
        int[] end=getLocate(startE);
        Piece chess=board.getBoard()[start[1]][start[0]];
        if (chess==null){
            System.out.print("no chess");
            throw new Error("wrong input");
        }
        if (!chess.getIsWhite()==turn){
            System.out.print("wrong chess");
            throw new Error("wrong input");
        }
        if(chess.checkPath(board.getBoard(),start[0],start[1],end[0],end[1])){
            turn=!turn;
            chess.move(board.getBoard(),start[0],start[1],end[0],end[1]);
        }
        else {
            throw new Error("wrong input");
        }
    }

    /**
     *
     * @return
     */


    private int[] getLocate(String input){
        if (input.length()!=2){
            throw new Error("wrong input");
        }
        int ver=8-Integer.valueOf((input.substring(0,1)));
        int hor=input.charAt(1)-97;
        if (hor>8||hor<0||ver>8||ver<0){
            throw new Error("wrong input");
        }
        int[] output={hor,ver};
        return output;
    }



    @Override
    public String toString () {
        return board.toString();
    }



}
