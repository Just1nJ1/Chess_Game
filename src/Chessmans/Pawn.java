package Chessmans;

public class Pawn extends Main.Chessman {
    public Pawn (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'P';
    }

    @Override
    public boolean move() {
        return false;
    }
}
