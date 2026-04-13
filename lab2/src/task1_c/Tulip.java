package task1_c;
import java.util.Objects;

public class Tulip extends Flower {
    private String variety;

    public Tulip(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    public String getVariety() { 
    	return variety; 
    }
    public void setVariety(String variety) { 
    	this.variety = variety; 
    }

    @Override
    public String toString() {
        return "Tulip{name='" + getName() + "', color='" + getColor() +
               "', variety='" + variety + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tulip tulip = (Tulip) o;
        return Objects.equals(variety, tulip.variety);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), variety);
    }
}
