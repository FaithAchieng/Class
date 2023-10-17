package objects;
import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	

        System.out.println("Enter the title of the book:");
        String title = in.nextLine();

        System.out.println("Enter the author of the book:");
        String author = in.nextLine();

        System.out.println("Enter the number of pages:");
        int numberOfPages = in.nextInt();

        in.close();

        Book book = new Book(title, author, numberOfPages);

        System.out.println("The book title is: " + book.getTitle());
        System.out.println("The book author is: " + book.getAuthor());
        System.out.println("The book has " + book.getNumberOfPages() + " pages");


	}

}
