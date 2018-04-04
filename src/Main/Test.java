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
            br = new BufferedReader ( new FileReader ( new File ( "/Users/wangxia/Desktop/Chess_test.txt" ) ) );
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }

        boolean flag = true;
        String input=null;
        while ( flag ) {
            try {
                if ( (input = br.readLine ()) == null  ) {
                    break;
                }
                game.move ( input.split(",")[0], input.split(",")[1] );
                System.out.println ( game + "\n\n\n" );
            } catch (WrongInputException | CannotMoveException e){
                System.out.println ( e );
            } catch (GameOverException e){
                System.out.print(e);
                flag = false;
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }
}
