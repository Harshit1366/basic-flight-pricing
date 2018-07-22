package air;
import java.util.Scanner;
public class business extends seat {

	void fare()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base price : ");
		double bp=sc.nextDouble();
		double init=(bp*20);
		double sur=((3/10)*init);
		double fare=init+sur;
		System.out.println("Total fare : "+fare);
		sc.close();
	}
}
