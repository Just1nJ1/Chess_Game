package Main;

public class Board {
    Chessman[][] board;

    public Board() {
        board = new Chessman[8][8];
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < 8; i++) {
            str+="\n"+i;
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    str+= "["+board[i][j]+"]";
                } else {
                    str+= "[    ]";
                }
            }
            str += "\n";

        }
        str += "    a     b     c     d     e     f     g     h";
        return str;
    }
}
