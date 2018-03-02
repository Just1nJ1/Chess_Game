package Chessmans;

public class King extends Main.Chessman {
    public King (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'K';
    }

    @Override
    public boolean move() {
        return false;
    }
}
