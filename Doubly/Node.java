class Node{
	private int data;
	public Node llink;
	public Node rlink;
	public Node(int a){
		this.data = a;
		this.llink = null;
		this.rlink = null;
	}
	public int getData(){
		return this.data;
	}
	public void setData(int a){
		this.data = a;
	}
}
