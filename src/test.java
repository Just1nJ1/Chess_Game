import Main.Board;
import Main.Game;

public class test {
    public static void main(String... args){
        Game test1 = new Game();
        System.out.print(test1);
        test1.move("1b","3c");
        System.out.print(test1);
    }
}