package Chessmans;

public class Bishop extends Main.Chessman {
    public Bishop (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'B';
    }

    @Override
    public boolean move() {
        return false;
    }
}