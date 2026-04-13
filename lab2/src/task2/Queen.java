package task2;

public class Queen extends Piece {
	public Queen(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		int dCol = Math.abs(b.getCol() - a.getCol());
	    int dRow = Math.abs(b.getRow() - a.getRow());

	    boolean rookMove   = (a.getCol() == b.getCol() || a.getRow() == b.getRow());
	    boolean bishopMove = (dCol == dRow) && dCol != 0;

	    return rookMove || bishopMove;
}
}
