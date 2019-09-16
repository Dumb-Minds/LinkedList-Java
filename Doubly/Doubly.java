public class Doubly{
	public Node first;
	public Node last;
	
	public Doubly(){
		this.first = null;
		this.last = null;
	}
	public boolean insert(int a){
		if(first == null && last == null){
			Node p = new Node(a);
			this.first = p;
			this.last = p;
		}else{
			Node p = new Node(a);
			last.rlink = p;
			p.llink = last;
			last = last.rlink;
		}
		return true;
	}
	public boolean delete(int a){	
		if(first.getData() == a){
			first = first.rlink;
			first.llink = null;
			return true;
		}else if(last.getData() == a){
			last = last.llink;
			last.rlink = null;
			return true;
		}
		Node p = first;
		while(p!=null){
			if(p.getData() == a){
				Node q = p.llink;
				Node r = p.rlink;
				q.rlink = r;
				r.llink = q;
				return true;
			}
			p = p.rlink;
		}
		return false;
	}
	public void sort(){
		Node p = first;
		while(p!=null){
			int high = p.getData();
			Node q = p;
			while(q!=null){
				if(q.getData() > p.getData()){
					int temp  =q.getData();
					q.setData(p.getData());
					p.setData(temp);
				}
				q = q.rlink;
			}
			p = p.rlink;
		}
	}
	public boolean update(int k, int a){
		Node p = first;
		while(p!=null){
			if(p.getData() == k){
				p.setData(a);
				return true;
			}
			p = p.rlink;
		}
		return false;
	}
	public void display(){
		Node p = first;
		while(p!=null){
			System.out.println(p.getData());
			p = p.rlink;
		}
	}
	public static void main(String args[]){
		Doubly b = new Doubly();
		System.out.println(b.insert(23));
		System.out.println(b.delete(34));
	}
}
