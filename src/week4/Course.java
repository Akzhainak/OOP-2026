package week4;
//task4
public class Course {
	    private String name;
	    private String description;
	    private int credits;

	    public Course(String name, String description, int credits) {
	        this.name = name;
	        this.description = description;
	        this.credits = credits;
	    }

	    @Override
	    public String toString() {
	        return name + " (" + description + ", " + credits + " credits)";
	    }
	}

