import java.util.Scanner;
class MainClass{
	public static void main(String args[]){
		Linked list = new Linked();
		Scanner sc = new Scanner(System.in);
		int a;
		while(true){
			System.out.println("1.Insert\n2.Delete\n3.Search\n4.toArray\n5.sort\n6.Traverse\nEnter your option:");
			a = sc.nextInt();
			switch(a){
				case 1:
					System.out.println("Enter number to insert:");
					int b = sc.nextInt();
					list.insert(b);
					System.out.println("\n\nSuccessfully inserted.");
					break;
				case 2:
					System.out.println("Enter number to delete:");
					int c = sc.nextInt();
					list.delete(c);
					break;
				case 3:
					System.out.println("Enter number to search:");
					int d = sc.nextInt();
					list.search(d);
					break;
				case 4:
					int arr[] = new int[list.length()];
					arr = list.toArray(list.length());
					System.out.println("\n\nSuccessfully loaded to array:");
					for(int i=0;i<arr.length;i++){
						System.out.print(arr[i]+" ");
					}
					System.out.println();
					break;
				case 5:
					list = list.sort(list.length());
					System.out.println("\n\nSuccessfully sorted.");
					break;
				case 6:
					System.out.println("\n\n");
					list.traverse();
					break;
				default:
					System.out.println("\n\nEnter valid input only..");
			}
		}
	}
}
