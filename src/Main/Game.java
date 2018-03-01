package Main;

import java.util.ArrayList;

public class Game {
    ArrayList<ArrayList<Cell>> board = new ArrayList<ArrayList<Cell>> (  );
    public Game (){
        for (int tempY = 0; tempY < 8; tempY ++){
            ArrayList<Cell> tempAL = new ArrayList<Cell> (  );
            for (int tempX = 97; tempX < 105; tempX ++){
                tempAL.add ( new Cell ( (char)tempX, tempY ) );
            }
            board.add ( tempAL );
            tempAL = null;
        }//test
    }
}
