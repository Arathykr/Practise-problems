import java.util.Scanner;
class Emp
{
	int emno;
	String empname;
	String desi;
        //instance variable=within a class but outside the function
}
class Employee
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Emp e1=new Emp();
		System.out.println("enter no");
		e1.emno=sc.nextInt();
		System.out.println("enter name");
    e1.empname=sc.next();
    System.out.println("enter des");
    e1.desi=sc.next();
		System.out.println(e1.emno);
		System.out.println(e1.empname);
		System.out.println(e1.desi);
		
		}
}
