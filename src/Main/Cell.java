package Main;

public class Cell {
    char posX;
    int posY;
    Chessman chessman;

    public Cell (char posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String toString (){
        return "" + posX + posY + chessman;
    }
}