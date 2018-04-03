package Main;

import Exceptions.CannotMoveException;
import Exceptions.GameOverException;
import Exceptions.WrongInputException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author justin_ji
 */
public class Client {
    static Game game;
    static Scanner scanner;
    public static void main (String... args) {
        File file=new File("/Users/wangxia/Desktop/Chess_test.txt");
        boolean flag = true;
        game = new Game ();
        scanner = new Scanner ( System.in );
        while (flag) {
            System.out.println ( game + "\n\n" +game.getTurn());
            try {
                FileWriter fw=new FileWriter(file);
                String start=scanner.nextLine();
                String end=scanner.nextLine();
                game.move ( start,  end );
            } catch (WrongInputException | CannotMoveException e){
                System.out.println ( e );
            } catch (GameOverException e){
                System.out.print(e);
                flag = false;
            }
            catch (IOException e){
            }
        }
    }
}
