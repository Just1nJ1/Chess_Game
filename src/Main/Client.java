package Main;

import Exceptions.CannotMoveException;
import Exceptions.GameOverException;
import Exceptions.WrongInputException;

import java.util.Scanner;

/**
 * @author justin_ji
 */
public class Client {
    static Game game;
    static Scanner scanner;
    public static void main (String... args) {
        boolean flag = true;
        game = new Game ();
        scanner = new Scanner ( System.in );
        while (flag) {
            System.out.println ( game + "\n\n" );
            try {
                game.move ( scanner.nextLine (), scanner.nextLine () );
            } catch (WrongInputException e){
                e.printStackTrace ();
            } catch (CannotMoveException e){
                e.printStackTrace ();
            } catch (GameOverException e){
                flag = false;
            }
        }
    }
}
