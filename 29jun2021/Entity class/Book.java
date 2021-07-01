package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Book")

public class Book {
		@Id
	   private Integer bookid;
		@Column
	   private String name;
		@Column
	   private Integer price;
		@Column
	   private Integer pages;
		@Column
	   private String authorid;
	   @ManyToOne(cascade = CascadeType.ALL)
	   @JoinColumn(name = "authorid")
	     private  Author author;
	   
	   
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book() {}
	
	public Book(Integer bookid, String name, Integer price, Integer pages, String authorid) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.price = price;
		this.pages = pages;
		this.authorid = authorid;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
	   

}
