package air;

import java.util.Scanner;

public class economy extends seat {

	void fare()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base price : ");
		double bp=sc.nextDouble();
		double fare=bp*15;
		System.out.println("Total fare : "+fare);
		sc.close();
	}
}
