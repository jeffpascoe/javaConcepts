package Trees;


 public abstract class Tree {
	protected Node root;
	private Integer length;
	
	public Tree(Person rootElement) {
		this.root = new Node(rootElement);
	}
	
	public Tree() {
		this(null);
	}
	
	public abstract void insertElement(Person element);
	public abstract Node deleteElement(Person element);
	public abstract Person retrieveElement(Integer age);
	public abstract Integer getTreeLength();
}
