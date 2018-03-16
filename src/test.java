import Main.Board;
import Main.Game;

public class test {
    public static void main(String... args){
        Game test1 = new Game();
        System.out.print(test1);
        test1.move("2d","3d");
        System.out.print(test1);
        test1.move("7c","6c");
        System.out.print(test1);
        test1.move("1c","3e");
        System.out.print(test1);
    }
}