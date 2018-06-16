package Trees;

public class Node {
	private Node leftChild;
	private Node rightChild;
	private Person element;
	
	public Node(Person element) {
		this.element = element;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public Node() {
		this(null);
	}
	
	public void setElement(Person element) {
		this.element = element;
	}
	
	public Person getElement() {
		return this.element;
	}
	
	public void setLeftChild(Node leftChild) {
		if(this.leftChild != null) this.leftChild = leftChild;
	}
	
	public void setRightChild(Node rightChild) {
		if(this.rightChild != null) this.rightChild = rightChild;
	}
	
	public Node getLeftChild() {
		return this.leftChild;
	}
	
	public Node getRightChild() {
		return this.rightChild;
	}
	
}
