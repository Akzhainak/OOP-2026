package task2;

public class Pawn extends Piece {
    boolean isWhite; 

    public Pawn(Position a, boolean isWhite) {
        super(a);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position b) {
    	int dCol = Math.abs(b.getCol() - a.getCol());
        int dRow = b.getRow() - a.getRow();

        int direction;
        if (isWhite) {
            direction = 1;
        } else {
            direction = -1;
        }
        
        boolean startRow;
        if (isWhite) {
            startRow = (a.getRow() == 1); 
        } else {
            startRow = (a.getRow() == 6); 
        }

        if (dCol == 0 && dRow == direction) {
        	return true;
        }
        if (dCol == 0 && dRow == 2 * direction && startRow) {
        	return true;
        }
        if (dCol == 1 && dRow == direction) {
        	return true;
        }

        return false;
    }
}
