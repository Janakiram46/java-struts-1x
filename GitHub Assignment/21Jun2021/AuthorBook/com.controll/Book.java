package com.AuthorBook;

public class Book
{
private int bookId;
private String bookName;
private int bookPrice;
private int authorId;
private int pages;
 public Book(){}
public Book(int bookId, String bookName, int bookPrice, int authorId, int pages) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookPrice = bookPrice;
	this.authorId = authorId;
	this.pages = pages;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookPrice() {
	return bookPrice;
}
public void setBookPrice(int bookPrice) {
	this.bookPrice = bookPrice;
}
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}

}


