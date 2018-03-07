package Main;
import java.util.Scanner;
public class Game {
    Board board;

    public Game (){
        board=Board.factor();

        //initialChess ();
    }

    private void move(){
        Scanner scanner = new Scanner(System.in);
        String start = scanner.next();
        String goal = scanner.next();
        if (start.length()!=2||goal.length()!=2){
            move();
            System.out.print("wrong input");
            return;
        }
        int startHor=Integer.valueOf((start.substring(0,1)));
        int startVer=(start.substring(0,1)).charAt(1)-97;
        int goalHor=Integer.valueOf((start.substring(0,1)));
        int goalVer=(start.substring(0,1)).charAt(1)-97;

        Piece[][] nboard = board.getBoard();
        boolean move=nboard[startHor][startVer].move(nboard,startHor,startVer,goalHor,goalVer);
        if(!move){move();}
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
        return board.toString();
    }



}
