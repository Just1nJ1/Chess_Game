package Chessmans;

public class Knight extends Main.Chessman {
    public Knight (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'N';
    }

    @Override
    public boolean move(char posX, char posY) {
        return false;
    }
}
