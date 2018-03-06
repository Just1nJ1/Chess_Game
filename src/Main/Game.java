package Main;
import java.util.Scanner;
public class Game {
    Cell[][] board = new Cell[8][8];

    public Game (){
        for (int tempY = 8; tempY > 0; tempY --){
            Cell[] tempAL = new Cell[8];
            for (int tempX = 0; tempX < 8; tempX ++){
                tempAL[tempX] = new Cell ( (char)(tempX+97), tempY );
            }
            board[8 - tempY] = tempAL;
            tempAL = null;
        }

        //initialChess ();
    }

    private void move(Board board){
        Scanner scanner = new Scanner(System.in);
        String start = scanner.next();
        int startHor=Integer.valueOf((start.substring(0,1)));
        int startVer=(start.substring(0,1)).charAt(1)-97;
        String goal = scanner.next();
        int goalHor=Integer.valueOf((start.substring(0,1)));
        int goalVer=(start.substring(0,1)).charAt(1)-97;
        Piece[][] nboard = board.getBoard();
        boolean move=nboard[startHor][startVer].move(nboard,startHor,startVer,goalHor,goalVer);
        if(!move){move(board);}
        else {System.out.print("successful");}
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
        String str = new String();
        for (int i = 0; i < 8; i ++){
            str += "\n" + (8 - i);
            for (Cell tempC : board[i]){
                str += tempC;
            }
            str += "\n";
        }
        str += "   a     b     c     d     e     f     g     h";
        return str;
    }

    public void showBoard (){ showBoard ( this.board ); }

    public void showBoard(Cell[][] board) {
        String alphebt[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < 8; i++) {
            System.out.println("-----------------------------------------");
            for (int j = 0; j < 8; j++) {
                System.out.print("|" + " " + alphebt[i] + (j + 1) + " ");
            }
            System.out.println("|");
            for (int j = 0; j < 8; j++) {
                if (board[i][j].getPiece() == null) {
                    System.out.print("|" + "    ");
                } else {
                    System.out.print("|" + " " + board[i][j].getPiece() + " ");
                }
            }
            System.out.println("|");
        }
        System.out.print("-----------------------------------------");
    }

}
