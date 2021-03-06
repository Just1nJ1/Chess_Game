package Main;
import Exceptions.CannotMoveException;
import Exceptions.GameOverException;
import Exceptions.WrongInputException;

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
     * @param startP
     * @param endE
     */
    public void move(String startP,String endE) throws CannotMoveException, WrongInputException, GameOverException{
        int[] start=getLocate(startP);
        int[] end=getLocate(endE);
        Piece chess=board.getBoard()[start[1]][start[0]];
        if (chess==null){
            throw new CannotMoveException ( "No Chess" );
        }
        if (chess.getIsWhite()!=turn){
            throw new CannotMoveException ( "Not Your Chess" );
        }
        if(chess.checkPath(board.getBoard(),start[0],start[1],end[0],end[1])){
            turn=!turn;
            chess.move(board.getBoard(),start[0],start[1],end[0],end[1]);
        }
        else {
            throw new WrongInputException (  );//TODO: 重新运行方法
        }
    }


    /**
     *
     * @return
     */

    public String getTurn(){
        if (turn){ return "white"; }
        else { return "black"; }
    }

    public boolean getTurnBoolean(){ return turn; }

    private int[] getLocate(String input) throws WrongInputException,GameOverException{
        if(input.equalsIgnoreCase("end")){
            throw new GameOverException("Game end");
        }
        if (input.length()!=2){
            throw new WrongInputException ( "Length should be 2. " );
        }
        int ver = 0;
        int hor = 0;
        try {
            ver=8-Integer.valueOf((input.substring(1)));
            hor=input.charAt(0)-97;
        } catch (NumberFormatException e) {
            throw new WrongInputException ( "Input should like 'a1'" );
        }
        if (hor>7||hor<0||ver>7||ver<0){
            throw new WrongInputException ( "Position should on the board. " );
        }
        int[] output={hor,ver};
        return output;
    }



    @Override
    public String toString () {
        return board.toString();
    }



}
