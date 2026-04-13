package task2;

public class Main {

    public static void main(String[] args) {
        Rook rook = new Rook(new Position(0, 0));
        System.out.println(rook.isLegalMove(new Position(0, 5))); 
        System.out.println(rook.isLegalMove(new Position(3, 3))); 

        Knight knight = new Knight(new Position(1, 0));
        System.out.println(knight.isLegalMove(new Position(2, 2))); 
        System.out.println(knight.isLegalMove(new Position(3, 3))); 

        Queen queen = new Queen(new Position(3, 3));
        System.out.println(queen.isLegalMove(new Position(7, 7))); 
        System.out.println(queen.isLegalMove(new Position(3, 6))); 
        System.out.println(queen.isLegalMove(new Position(5, 4))); 
    }
}
