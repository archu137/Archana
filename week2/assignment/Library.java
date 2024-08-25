package week2.assignment;

public class Library {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library lib=new Library();
lib.addBook("Introduction to Selenium");
lib.issueBook();
	}
public String addBook(String bookTitle)
{
	System.out.println("Book added successfully "+bookTitle);
	return bookTitle;
}
public void issueBook()
{
	System.out.println("Book issued successfully");
}
}
