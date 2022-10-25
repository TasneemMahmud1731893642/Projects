package project;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		System.out.println("Enter First Name:");
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println("Enter Second Name:");
		String b=sc.nextLine();
		System.out.println("Enter Date of Birth:");
		String c=sc.nextLine();
		System.out.println("Enter Email address:");
		String d=sc.nextLine();
		System.out.println("Enter Phone number:");
		String e=sc.nextLine();
		System.out.println("Enter Password:");
		String f=sc.nextLine();
		System.out.println("Confirm Password:");
		String g=sc.nextLine();
		if(f.equals(g)) {
			System.out.println("You have succesfully Signed up!");
		}
		else
		{
			for( ; ; ) {
				System.out.println("Re-enter Password:");
				String h=sc.nextLine();
				if(f.equals(h)) {
					break;
				}
			}
			System.out.println("You have succesfully Signed up!");
		}
		System.out.println("WELCOME!!!!");
		System.out.println("1.Student Information");
		System.out.println("2.Grades");
		System.out.println("3.Courses Completed");
		System.out.println("4.Advising");
		System.out.println("5.CGPA");
		System.out.println("6.Log out");
		System.out.println("Enter the number of the preferable option:");
		int k=sc.nextInt();
		switch(k) {
		case 1:
			Studentinfo ab= new Studentinfo(a, b, c, d, e);
			System.out.println(ab.student());
			break;
		case 2:
			System.out.println("No item available");
			break;
		case 3:
			System.out.println("No item available");
			break;
		case 4:
			Advising ag= new Advising(a, b, c, d, e);
			break;
		case 5:
		    break;
		case 6:
			break;
		}
		
		
		}
	
	}


