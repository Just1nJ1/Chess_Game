package Main;

public class Cell {
    char posX;
    int posY;
    Chessman chessman = null;

    public Cell (char posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String toString (){
        if (chessman != null) {
            return "[" + posX + posY + chessman + "]";
        } else {
            return "[ " + posX + posY + " ]";
        }
    }
}