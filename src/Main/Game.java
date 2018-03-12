package Main;
import java.util.Scanner;
public class Game {
    Board board;

    public Game (){
        board=Board.factor();

        //initialChess ();
    }

    private void move(boolean turn){
        int[] start=getLocate();
        int[] end=getLocate();

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

    private void initialChess (Cell[][] board){
        boolean isWhite=true;
        int position=board.length-1;
        for(int i=0;i<2;i++){
            for (int j=0;j<8;j++){
                //board[][]
            }
        }
    }


    @Override
    public String toString () {
        return board.toString();
    }



}
