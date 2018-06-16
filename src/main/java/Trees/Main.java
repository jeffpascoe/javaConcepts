package Trees;

public class Main {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Person p1 = new Person(1, "Jeff");
		bst.insertElement(p1);
		Person p2 = new Person(4, "Jaff");
		Person p3 = new Person(3, "Joff");
		bst.insertElement(p2);
		bst.insertElement(p3);
	}

}
