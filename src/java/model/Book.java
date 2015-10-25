/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hai.bt
 */
public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private float price;
    private String description;
    private String imgSrc;
    private boolean inOut;

    public Book() {
    }

    public Book(String isbn, String bookName, String author, float price, String description, String imgSrc, boolean inOut) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.description = description;
        this.imgSrc = imgSrc;
        this.inOut = inOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public boolean isInOut() {
        return inOut;
    }

    public void setInOut(boolean inOut) {
        this.inOut = inOut;
    }
}
