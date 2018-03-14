package Main;

public class Cell {
    char posX;
    int posY;
    Piece Piece = null;

    public Cell (char posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public Piece getPiece() {
        return Piece;
    }
    @Override
    public String toString (){
        if (Piece != null) {
            return "[" + posX + posY + Piece + "]";
        } else {
            return "[    ]";
        }
    }

    public void setPiece(Piece Piece) {
        this.Piece = Piece;
    }
}
