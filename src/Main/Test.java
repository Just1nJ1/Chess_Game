package Main;

import Exceptions.CannotMoveException;
import Exceptions.GameOverException;
import Exceptions.WrongInputException;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main (String... args) {
        BufferedReader br = null;
        Game game = new Game ();
        try {
            br = new BufferedReader ( new FileReader ( new File ( "/Users/justin_ji/Desktop/test.txt" ) ) );
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }

        boolean flag = true;
        String start = null;
        String end = null;
        while ( flag ) {
            try {
                if ( (start = br.readLine ()) == null || (end = br.readLine ()) == null ) {
                    break;
                }
                game.move ( start, end );
                System.out.println ( game + "\n\n\n" );
            } catch (WrongInputException | CannotMoveException e){
                System.out.println ( e );
            } catch (GameOverException e){
                flag = false;
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }
}
