class TNode {
	String data;
	TNode lc;
	TNode rc;

	public TNode(String data, TNode lc, TNode rc) {
		this.data = data;
		this.lc = lc;
		this.rc = rc;
	}

	public TNode(String data) {
		this.data = data;
		this.lc = null;
		this.rc = null;
	}
}

public class Tree {
	static TNode init(){
		TNode root = new TNode("A", null, null);
		TNode b = new TNode("B");
		TNode c = new TNode("C");
		TNode d = new TNode("D");
		root.lc = b;
		root.rc = c;
		b.lc = d;
		return root;
	}
	
	static void visit(TNode node) {
		System.out.println(node.data + ", ");
	}

	static void firstOrderTraverse(TNode node) {
		if(node!=null) {
			visit(node);
			firstOrderTraverse(node.lc);
			firstOrderTraverse(node.rc);
		}
	}

	public static void main(String[] args) {
		TNode root = init();
		firstOrderTraverse(root);
		System.out.println("I'm DONE!");
	}

}