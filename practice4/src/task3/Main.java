package task3;

public class Main {
    public static void main(String[] args) {
        LogicGame logicGame = new LogicGame();
        MemoryGame memoryGame = new MemoryGame();

        App app = new App();

        System.out.println("LogicGame statistics:");
        app.getStatistics(logicGame);
        logicGame.d();

        System.out.println();

        System.out.println("MemoryGame statistics:");
        app.getStatistics(memoryGame);
        memoryGame.d();

        System.out.println();

        iPhone phone = new iPhone();
        phone.sell();
        phone.plugIn();
    }
    
}
