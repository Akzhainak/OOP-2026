package task2;

public class Rook extends Piece{
	
	public Rook(Position a) {
		super(a);
	}
	@Override
	public boolean isLegalMove(Position b) {
		return (a.getCol() == b.getCol() || a.getRow() == b.getRow());
	}
}
