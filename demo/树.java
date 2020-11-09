
class 树节点 {
	树节点 左孩子 = null, 右孩子 = null;
	String 数据 = "虚空";

	public 树节点(String 数据, 树节点 左孩子, 树节点 右孩子) {
		this.左孩子 = 左孩子;
		this.右孩子 = 右孩子;
		this.数据 = 数据;
	}

	public 树节点(String 数据) {
		this.数据 = 数据;
	}
}

public class 树{
	static void 中序遍历(树节点 某个节点){
		if(某个节点 != null){
		   中序遍历(某个节点.左孩子);
		   //访问我自己
		   System.out.print(某个节点.数据 + ", ");
		  中序遍历(某个节点.右孩子);
		}
	}

	static void 先序遍历(树节点 节点) {
		if(节点 != null) {
			System.out.print(节点.数据 + ", ");
			先序遍历(节点.左孩子);
			先序遍历(节点.右孩子);
		}
	}

	public static void main(String[] args) {
		树节点 根节点 = new 树节点("A",
				new 树节点("B", null, new 树节点("C")),
				new 树节点("D"));

		System.out.println("中序遍历的结果：");
		中序遍历(根节点);
		System.out.println("\n\n先序遍历的结果：");
		先序遍历(根节点);
	}
}
