package LibraryImplementation;

import java.util.HashMap;

public class Library {
	private HashMap<Integer, Object> inventory;
	
	public void addBookToInventory(Book book) {
		this.inventory.put(book.getBIN(), book);
	}
	
	public void addVideoGameToInventory(VideoGame videoGame) {
		this.inventory.put(videoGame, value);
	}
	
	public Book rentBook(int bin) {
		return (Book) this.inventory.get(bin);
	}
	
	public VideoGame rentVideoGame(int id) {
		return (VideoGame) this.inventory.get(id);
	}
}
