package objects;

public class Book {
String title;
String author;
int numberOfPages;
public Book(String title, String author, int numberOfPages) {
    this.title = title;
    this.author = author;
    this.numberOfPages = numberOfPages;

}
public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public int getNumberOfPages() {
    return numberOfPages;
}
}