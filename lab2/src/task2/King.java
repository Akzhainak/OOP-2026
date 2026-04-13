package task2;

public class King extends Piece{
	public King(Position a) {
		super(a);
	}
	@Override
	public boolean isLegalMove(Position b) {
		int dCol = Math.abs(b.getCol() - a.getCol());
	    int dRow = Math.abs(b.getRow() - a.getRow());
	    return (dCol <= 1 && dRow <= 1) && (dCol + dRow > 0);
	}
}
