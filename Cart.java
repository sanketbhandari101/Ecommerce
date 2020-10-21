import java.util.Scanner;

public class Cart 
{
	Scanner sc=new Scanner(System.in);
	void menu()
	{	
	int bill=0,bill1=0,bill2=0,bill3=0,bill4=0,Tbill=0,rm=0;
	boolean flag=false;
	System.out.println("Choose a product to add to cart from available");
	System.out.println("1.Samsung A1");
	System.out.println("2.Redmi note 8 pro");
	System.out.println("3.Iphone12");
	System.out.println("4.Mackbook");
	System.out.println("5.GenerateBill");
	System.out.println("6.Remove a product from cart");
	System.out.println("7.Exit");
	
	while(flag!=true)
	{

		System.out.println("Please enter your choice");
		int choice=sc.nextInt();
		if(choice>=1 && choice<=6)
		{
			switch(choice)
			{
			case 1:System.out.println("Samsung A1=19999");
			bill1=bill+19999;
			break;
			case 2:System.out.println("Redmi note 8 pro=15999");
			bill2=bill+15999;
			break;
			case 3:System.out.println("Iphone12=35000");
			bill3=bill+35000;
			break;
			case 4:System.out.println("Mackbook=95000");
			bill4=bill+95000;
			break;  
			case 5:System.out.println("Total bill=");
			Tbill=bill1+bill2+bill3+bill4-rm;
			System.out.println(+Tbill);
			break;
			case 6:System.out.println("Enter a price of product to remove from cart");
			rm=sc.nextInt();
			Tbill=Tbill-rm;
			
			System.out.println("Removed successfully");
			System.out.println("Total checkout amount="+Tbill);
			break;
		
			
										
					
			}
		}
		else
		{
			System.exit(0);
			System.out.println("Invalid choice");
		}
}

}

		
		

	}
