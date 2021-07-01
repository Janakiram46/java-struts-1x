package com.forms;

import org.apache.struts.action.ActionForm;

import com.entity.Author;
import com.entity.Book;

public class OrganizationAuthorForm extends ActionForm
{
private Author author;
private Book book;
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}

}
