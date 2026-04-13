package task2;

public class Bishop extends Piece {
	public Bishop(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		int dCol = Math.abs(b.getCol() - a.getCol());
	    int dRow = Math.abs(b.getRow() - a.getRow());
	    return (dCol == dRow) && dCol != 0;
	}
}
