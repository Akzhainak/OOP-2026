package task1_b;

public abstract class LibraryItem {
	private String title;
    private String author;
    private int year;
    
    public LibraryItem ( String title,String author,int publicationYear) {
    	this.title=title;
    	this.author=author;
    	this.year=publicationYear;
    }
    
    public String GetAuthor() {
    	return author;
    }
    public String GetTitle() {
    	return title;
    }
    public int GetPublicationYear() {
    	return year;
    }
    
    
    public void SetAuthor(String author) {
    	this.author=author;
    }
    public void SetTitle(String title) {
    	this.title=title;
    }
    public void SetPublicationYear(int publicationYear) {
    	this.year=publicationYear;
    }
    
    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
    
}
