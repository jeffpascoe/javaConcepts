package Trees;

public class BinarySearchTree extends Tree {
	
	public BinarySearchTree(Person rootElement) {
		super(rootElement);
	}
	
	public BinarySearchTree() {
		super(null);
	}

	@Override
	public void insertElement(Person element) {
		if(this.root == null) {
			this.root = new Node(element);
			System.out.println(this.root.getElement().getName());
			return;
		}
		else recursiveInsert(root, element);
	}
	
	public Node recursiveInsert(Node currentNode, Person element) {
		if(currentNode.getElement().getAge() > element.getAge()) {
			if(currentNode.getLeftChild() == null) {
				currentNode.setLeftChild(new Node(element));
				return currentNode.getLeftChild();
			}
			return recursiveInsert(currentNode.getLeftChild(), element);
		} else if(currentNode.getElement().getAge() < element.getAge()) {
			if(currentNode.getRightChild() == null){ 
				currentNode.setRightChild(new Node(element)); 
				return currentNode.getRightChild();
			}
			return recursiveInsert(currentNode.getRightChild(), element);
		}
		return null;
	}
	@Override
	public Node deleteElement(Person element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person retrieveElement(Integer age) {
		
		return null;
	}

	@Override
	public Integer getTreeLength() {
		// TODO Auto-generated method stub
		return null;
	}

}
