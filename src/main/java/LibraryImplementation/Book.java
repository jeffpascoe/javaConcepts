package LibraryImplementation;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book {
	
	Integer BIN;
	String name;
	Integer pageCount;
	String contents;
	ArrayList<String> authors;
	LocalDate publicationDate;
	
	public Integer getBIN() {
		return BIN;
	}
	public void setBIN(Integer bIN) {
		BIN = bIN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	
}
