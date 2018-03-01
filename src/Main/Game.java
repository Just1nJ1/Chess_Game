package Main;

import java.util.ArrayList;

public class Game {
    ArrayList<ArrayList<Cell>> board = new ArrayList<ArrayList<Cell>> (  );
    public Game (){
        for (int tempY = 1; tempY < 9; tempY ++){
            ArrayList<Cell> tempAL = new ArrayList<Cell> (  );
            for (int tempX = 97; tempX < 105; tempX ++){
                tempAL.add ( new Cell ( (char)tempX, tempY ) );
            }
            board.add ( tempAL );
            tempAL = null;
        }
    }

    @Override
    public String toString () {
        String str = new String();
        for (ArrayList<Cell> tempAL : board){
            for (Cell tempC : tempAL){
                str += tempC;
            }
            str += "\n";
        }
        return str;
    }//
}
