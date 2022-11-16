package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class book {

	            @Id
	            @GeneratedValue(strategy = GenerationType.AUTO)
	            
	            private Integer BookId ;
				private String name;
				private String author;
				private String publication;
				private String category;
				private Integer Pages;
				private Integer price;
				private String author_no;
				
				public Integer getBookId() {
					return BookId;
				}
				public void setBookId(Integer bookId) {
					BookId = bookId;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getAuthor() {
					return author;
				}
				public void setAuthor(String author) {
					this.author = author;
				}
				public Integer getPrice() {
					return price;
				}
				public void setPrice(Integer price) {
					this.price = price;
				}
				
				public String getPublication() {
					return publication;
				}
				public void setPublication(String publication) {
					this.publication = publication;
				}
				public String getCategory() {
					return category;
				}
				public void setCategory(String category) {
					this.category = category;
				}
				public Integer getPages() {
					return Pages;
				}
				public void setPages(Integer pages) {
					Pages = pages;
				}
				public String getAuthor_no() {
					return author_no;
				}
				public void setAuthor_no(String author_no) {
					this.author_no = author_no;
				}
				
				
				
				
				public book(Integer bookId, String name, String author, String publication, String category,
						Integer pages, Integer price, String author_no) {
					super();
					BookId = bookId;
					this.name = name;
					this.author = author;
					this.publication = publication;
					this.category = category;
					Pages = pages;
					this.price = price;
					this.author_no = author_no;
				}
				
				
				public book() {
					super();
					// TODO Auto-generated constructor stub
				}
				
				
				
				@Override
				public String toString() {
					return "book [BookId=" + BookId + ", name=" + name + ", author=" + author + ", publication="
							+ publication + ", category=" + category + ", Pages=" + Pages + ", price=" + price
							+ ", author_no=" + author_no + "]";
				}
				
				
				
				
				
}
