public class Linked{
	Node headNode = null;
	Node tailNode = null;
	void insert(int a){
		if((headNode==null) && (tailNode==null)){
			Node temp = new Node(a);
			headNode = temp;
			tailNode = temp;
		}
		else{
			Node temp = new Node(a);
			tailNode.link = temp;
			tailNode = temp;
		}
	}
	void delete(int a){
		if((headNode == null)&& (tailNode == null)){
			System.out.println("List is empty");
			return ;
		}
		else if(headNode.data == a){
			headNode = headNode.link;
			System.out.println("Node deleted.");
			return ;
		}
		else{
			Node p = headNode;
			while(p.link.data != a){
				if(p.link == null){
					if(p.link.data == a){
						tailNode = p;
						return true;
					}
					System.out.println("Not found");
					return ;
				}
				p = p.link;			
			}
			p.link = p.link.link;
			System.out.println("Node deleted.");
			return;
		}
	}
	void search(int a){
		Node p = headNode;
		while(p!=null){
			if(p.data == a){
				System.out.println("Found in the list.");
				return ;			
			}
			p = p.link;
		}
		System.out.println("Not found!");
		return;
	}
	int length(){
		int i = 0;
		Node p = headNode;
		while(p!=null){
			i++;
			p = p.link;
		}
		return i;
	}
	int[] toArray(int n){
		int arr[] = new int[n];
		int i = 0;
		Node p = headNode;
		while(p!=null){
			arr[i++] = p.data;
			p = p.link;
		}
		return arr;			
	}
	Linked sort(int n){
		Linked l = new Linked();
		int arr[] = new int[n];
		int i = 0;
		Node q = headNode;
		while(q!=null){
			arr[i++] = q.data;
			q = q.link;
		}
		for(int j=1;j<i;j++){
			int p=j;
			for(int k=j-1;k>=0;k--){
				if(arr[k]>arr[p]){
					int temp = arr[k];
					arr[k] = arr[p];
					arr[p] = temp;
					p--;
				}
				else{
					break;
				}
			}
		}
		for(int z=0;z<arr.length;z++){
			l.insert(arr[z]);
		}
		return l;
	}
	void traverse(){
		Node p = headNode;
		while(p!=null){
			System.out.print(p.data+" ");
			p = p.link;
		}
		System.out.println();
	}
}
