package Chessmans;

public class Queen extends Main.Chessman {
    public Queen (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'Q';
    }

    @Override
    public boolean move(char posX, char posY) {
        return false;
    }
}
