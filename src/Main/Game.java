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
    public void showBoard(ArrayList<ArrayList<Cell>> board) {
        String alphebt[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < 8; i++) {
            System.out.println("-----------------------------------------");
            for (int j = 0; j < 8; j++) {
                System.out.print("|" + " " + alphebt[i] + (j + 1) + " ");
            }
            System.out.println("|");
            for (int j = 0; j < 8; j++) {
                if (board.get(i).get(j).getChessman() == null) {
                    System.out.print("|" + "    ");
                } else {
                    System.out.print("|" + " " + board.get(i).get(j).getChessman() + " ");
                }
            }
            System.out.println("|");
        }
        System.out.print("-----------------------------------------");
    }
}
