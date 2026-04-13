package task1_c;
import java.util.Objects;

public class Flower {
    private String name;
    private String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() { 
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }
    public String getColor() { 
    	return color; 
    }
    public void setColor(String color) { 
    	this.color = color; 
    }

    @Override
    public String toString() {
        return "Flower{name='" + name + "', color='" + color + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name) &&
               Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

}
