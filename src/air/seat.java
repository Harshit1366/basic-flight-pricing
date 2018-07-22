package air;
import java.util.Scanner;

public class seat {
static Scanner sc=new Scanner(System.in);
int seatno;
int flino;
static int j=0,i=0;
void fare()
{}
public static void main(String args[])
{
	int a=1;
	business b=new business();
	economy e=new economy();
	System.out.println("Enter the no. of seats in flight : ");
	int n=sc.nextInt();
	int fn[]=new int[n];
	int sn[]=new int[n];
	do
	{
	System.out.println("Enter the flight no : ");
	fn[i]=sc.nextInt();
	System.out.println("Enter the seat no : ");
	sn[i]=sc.nextInt();
	if(sn[i]<(n/2))
	{
		e.fare();
	}
	else
	{
		b.fare();
	}	
	i++;
	j++;
	System.out.println("Do you wish to enter more?(1/0) : ");
	a=sc.nextInt();
	}while(a==1);
	System.out.println("Total no of seats : "+j);
	for(i=0;i<j;i++)
	{
		System.out.println("\nFlight No : "+fn[i]+"\nSeat No. : "+sn[i]);
	}

}
}
