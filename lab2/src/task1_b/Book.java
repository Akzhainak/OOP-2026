package task1_b;

public class Book extends LibraryItem{
	private int pages;
	
    public Book(String title, String author, int year, int pages) {
    	super(title, author, year);
        this.pages = pages;
    }
    
    public int SetPages () {
    	return pages;
    }
    public void GetPages () {
    	this.pages = pages;
    }
    
    public void displayInfo() {
        printInfo();
        System.out.println("Number of pages: " + pages);
    }
    
    
}
