package task2;

public class Knight extends Piece{
	public Knight(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		int dCol = Math.abs(b.getCol() - a.getCol());
	    int dRow = Math.abs(b.getRow() - a.getRow());
	    return (dCol == 2 && dRow == 1) || (dCol == 1 && dRow == 2);
	}
}
