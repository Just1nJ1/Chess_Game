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
    public void move(boolean turn){
        System.out.print("type");
        int[] start=getLocate();
        int[] end=getLocate();
        Piece chess=board.getBoard()[start[1]][start[0]];
        if (chess==null){
            System.out.print("no chess");
            move(turn);
            return;
        }
        if (!chess.getIsWhite()==turn){
            System.out.print("wrong chess");
            move(turn);
            return;
        }
        if(chess.checkPath(board.getBoard(),start[0],start[1],end[0],end[1])){
            chess.move(board.getBoard(),start[0],start[1],end[0],end[1]);
        }
        else {
            System.out.print("illegal path");
            move(turn);
        }
    }

    /**
     *
     * @return
     */
    private int[] getLocate(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length()!=2){
            System.out.print("wrong input");
            return getLocate();
        }
        int ver=8-Integer.valueOf((input.substring(0,1)));
        int hor=input.charAt(1)-97;
        if (hor>8||hor<0||ver>8||ver<0){
            System.out.print("wrong input");
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
