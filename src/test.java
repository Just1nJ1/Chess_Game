import Main.Board;
import Main.Game;

public class test {
    public static void main(String... args){
        Game test1 = new Game();
        System.out.print(test1);
        test1.move(true);
        System.out.print(test1);
    }
}