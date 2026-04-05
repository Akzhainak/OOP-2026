package pr2;

public interface Flyable extends Moveable {
    void takeOff();
    void land();
    int getAltitude();
}