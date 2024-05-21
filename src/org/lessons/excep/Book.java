package org.lessons.excep;

public class Book {

    // ATTRIBUTI
    private String title;
    private int numberOfPages;
    private String author;
    private String publisher;

    // COSTRUTTORE
    public Book (String title, int numberOfPages, String author, String publisher){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publisher = publisher;
    }


    // METODI
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException{
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("The title cannot be empty");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException{
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("The author cannot be empty");
        }
        this.author = author;
    }

    public int getNumberOfPages() throws IllegalArgumentException{
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) throws IllegalArgumentException{
        if (numberOfPages <= 0){
            throw new IllegalArgumentException("The number of pages cannot be less than or equal to 0");
        }
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() throws IllegalArgumentException{
        return publisher;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException{
        if (publisher == null || publisher.isEmpty()){
            throw new IllegalArgumentException("The publisher cannot be empty");
        }
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + " Pages: " + getNumberOfPages() + " Author: " + getAuthor() + " Publisher: " + getPublisher();
    }
}
