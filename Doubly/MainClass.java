import java.util.Scanner;
public class MainClass{
	public static String[] banner = {
								"?????????????????????????????????????????????????",
								"???                                           ???",
								"???  "+"\u001b[32;1m"+"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN"+"\u001B[0m"+"     ???",
								"???  "+"\u001b[32;1m"+"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM"+"\u001B[0m"+"   ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMN"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM          Dumb Minds             MMM"+"\u001B[0m"+"  ???",	
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",	
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",	
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",		
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMM                                 MMM"+"\u001B[0m"+"  ???",	
								"???  "+"\u001b[32;1m"+"MMM                                 MMN"+"\u001B[0m"+"  ???",
								"???  "+"\u001b[32;1m"+"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM"+"\u001B[0m"+"   ???",
								"???  "+"\u001b[32;1m"+"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN"+"\u001B[0m"+"    ???",
								"???                                           ???",
								"?????????????????????????????????????????????????",
								"?????????????????????????????????????????????????"	,
								" Youtube : \u001b[34;1m"+"https://youtube.com/c/Dumbminds/"+"\u001B[0m",
								" Facebook : \u001b[34;1m"+"https://www.facebook.com/dumbminds01/"+"\u001B[0m",
								" Blogger : \u001b[34;1m"+"https://dumbmindsblog.blogspot.com/"+"\u001B[0m",
							};
	public static void main(String args[]){
		Doubly list = new Doubly();
		System.out.print("\033[H\033[2J");  
		System.out.flush();
		for(int i=0;i<banner.length;i++){
			System.out.println(banner[i]);
		}
		Doubly b = new Doubly();
		outer:
		while(true){
			System.out.println("\u001b[32;1m"+" 1.Add\n 2.Delete\n 3.Update\n 4.Sort\n 5.Display\n 6.Exit\n 7.Banner"+"\u001B[0m");
			Scanner sc = new Scanner(System.in);
			int a;
			try{
				a = sc.nextInt();
			}catch(Exception e){
				System.out.println(e+"\nPlease enter valid input:");
				continue outer;
			}
			switch(a){
				case 1:
					int c;
					try{
						System.out.print("Enter numer to insert: ");
						c = sc.nextInt();
					}catch(Exception e){
						System.out.println(e+"\nEnter integers only!..");
						continue outer;
					}
					System.out.println(b.insert(c));
					break;
				case 2:
					int d;
					try{
						System.out.print("Enter number to delete: ");
						d = sc.nextInt();
					}catch(Exception e){
						System.out.println(e+"\nEnter integers only!..");
						continue outer;
					}
					System.out.println(b.delete(d));
					break;
				case 3:
					int f,g;
					try{
						System.out.print("Enter number to update(space)updated_number: ");
						f = sc.nextInt();
						g = sc.nextInt();
					}catch(Exception e){
						System.out.println(e+"\nEnter integers only!..");
						continue outer;
					}
					System.out.println(b.update(f,g));
					break;
				case 4:
					b.sort();
					System.out.println("Successfully sorted");
					break;
				case 5:
					b.display();
					break;
				case 6:
					b.display();
					System.out.println("Sorry for leaving !");
					return;
				case 7:
					System.out.print("\033[H\033[2J");  
					System.out.flush();
					for(int i=0;i<banner.length;i++){
						System.out.println(banner[i]);
					}
					break;
				default:
					System.out.println("Enter valid input only!");
			}
		}
	}
}
