package Main;

public class Cell {
    char posX;
    int posY;
    piece piece = null;

    public Cell (char posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public piece getPiece() {
        return piece;
    }
    @Override
    public String toString (){
        if (piece != null) {
            return "[" + posX + posY + piece + "]";
        } else {
            return "[    ]";
        }
    }

    public void setPiece(piece piece) {
        this.piece = piece;
        piece.currentCell = this;
    }
}
