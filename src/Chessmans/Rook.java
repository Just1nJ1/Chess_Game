package Chessmans;

public class Rook extends Main.Chessman {
    public Rook (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'R';
    }

    @Override
    public boolean move() {
        return false;
    }
}
