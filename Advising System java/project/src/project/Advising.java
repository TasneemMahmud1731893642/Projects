package project;

import java.util.Scanner;

public class Advising extends registration{

	public Advising(String firstname, String secondname, String dob, String email, String phone) {
		super(firstname, secondname, dob, email, phone);
		
	}
	
	int i;
	String ar,am,ak,al,ao;
	
	int[] arr = new int[5];
	int[] brr = new int[5];{
	System.out.println("Welcome to your advising portal!!");
	for(i=0;i<5;i++) {
		System.out.println("Choose the number of preferable courses:");
		System.out.println("1.CSE215");
		System.out.println("2.CSE215L");
		System.out.println("3.MAT120");
		System.out.println("4.MAT125");
		System.out.println("5.ENV203");
		Scanner sd= new Scanner(System.in);
		int n=sd.nextInt();
		switch(n) {
	    case 1:
	    	System.out.println("Choose number of class days:");
			System.out.println("1.ST(Sunday and Tuesday)");
			System.out.println("2.MW(Monday and Wednesday)");
			System.out.println("3.RA(Thursday and Saturday)");
			arr[i]=sd.nextInt();
			switch(arr[i]) {
			case 1:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("CSE215               ST               8:00-9:30");
					ar="CSE215               ST               8:00-9:30";
					break;
				case 2:
					System.out.println("CSE215               ST               9:40-11:10");
					ar="CSE215               ST               9:40-11:10";
					break;
				case 3:
					System.out.println("CSE215               ST               11:20-12:50");
					ar="CSE215               ST               11:20-12:50";
					break;
				case 4:
					System.out.println("CSE215               ST               1:00-2:30");
					ar="CSE215               ST               1:00-2:30";
					break;
				case 5:
					System.out.println("CSE215               ST               2:40-4:10");
				    ar="CSE215               ST               2:40-4:10";
					break;
				case 6:
					System.out.println("CSE215               ST               4:20-5:50");
				    ar="CSE215               ST               4:20-5:50";
					break;
				}
			
				break;
			case 2:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("CSE215               MW               8:00-9:30");
					ar="CSE215               MW               8:00-9:30";
					break;
				case 2:
					System.out.println("CSE215               MW               9:40-11:10");
					ar="CSE215               MW               9:40-11:10";
					break;
				case 3:
					System.out.println("CSE215               MW               11:20-12:50");
					ar="CSE215               MW               11:20-12:50";
					break;
				case 4:
					System.out.println("CSE215               MW               1:00-2:30");
					ar="CSE215               MW               1:00-2:30";
					break;
				case 5:
					System.out.println("CSE215               MW               2:40-4:10");
				    ar="CSE215               MW               2:40-4:10";
					break;
				case 6:
					System.out.println("CSE215               MW               4:20-5:50");
				    ar="CSE215               MW               4:20-5:50";
					break;
				}
				break;
			case 3:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("CSE215               RA               8:00-9:30");
					ar="CSE215               RA               8:00-9:30";
					break;
				case 2:
					System.out.println("CSE215               RA               9:40-11:10");
					ar="CSE215               RA               9:40-11:10";
					break;
				case 3:
					System.out.println("CSE215               RA               11:20-12:50");
					ar="CSE215               RA               11:20-12:50";
					break;
				case 4:
					System.out.println("CSE215               RA               1:00-2:30");
					ar="CSE215               RA               1:00-2:30";
					break;
				case 5:
					System.out.println("CSE215               RA               2:40-4:10");
					ar="CSE215               RA               2:40-4:10";
				    break;
				case 6:
					System.out.println("CSE215               RA               4:20-5:50");
					ar="CSE215               RA               4:20-5:50";
				    break;
				}
				break;
			}
			break;
		case 2:
			System.out.println("Choose number of class days:");
			System.out.println("1.ST(Sunday and Tuesday)");
			System.out.println("2.MW(Monday and Wednesday)");
			System.out.println("3.RA(Thursday and Saturday)");
			arr[i]=sd.nextInt();
			switch(arr[i]) {
			case 1:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("CSE215L              ST               8:00-9:30");
					am="CSE215L              ST               8:00-9:30";
					break;
				case 2:
					System.out.println("CSE215L              ST               9:40-11:10");
					am="CSE215L              ST               9:40-11:10";
					break;
				case 3:
					System.out.println("CSE215L              ST               11:20-12:50");
					am="CSE215L              ST               11:20-12:50";
					break;
				case 4:
					System.out.println("CSE215L              ST               1:00-2:30");
					am="CSE215L              ST               1:00-2:30";
					break;
				case 5:
					System.out.println("CSE215L              ST               2:40-4:10");
					am="CSE215L              ST               2:40-4:10";
				    break;
				case 6:
					System.out.println("CSE215L              ST               4:20-5:50");
					am="CSE215L              ST               4:20-5:50";
				    break;
				}
			
				break;
			case 2:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("CSE215L              MW               8:00-9:30");
					am="CSE215L              MW               8:00-9:30";
					break;
				case 2:
					System.out.println("CSE215L              MW               9:40-11:10");
					am="CSE215L              MW               9:40-11:10";
					break;
				case 3:
					System.out.println("CSE215L              MW               11:20-12:50");
					am="CSE215L              MW               11:20-12:50";
					break;
				case 4:
					System.out.println("CSE215L              MW               1:00-2:30");
					am="CSE215L              MW               1:00-2:30";
					break;
				case 5:
					System.out.println("CSE215L              MW               2:40-4:10");
					am="CSE215L              MW               2:40-4:10";
				    break;
				case 6:
					System.out.println("CSE215L              MW               4:20-5:50");
					am="CSE215L              MW               4:20-5:50";
				    break;
				}
				break;
			case 3:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("CSE215L              RA               8:00-9:30");
					am="CSE215L              RA               8:00-9:30";
					break;
				case 2:
					System.out.println("CSE215L              RA               9:40-11:10");
					am="CSE215L              RA               9:40-11:10";
					break;
				case 3:
					System.out.println("CSE215L              RA               11:20-12:50");
					am="CSE215L              RA               11:20-12:50";
					break;
				case 4:
					System.out.println("CSE215L              RA               1:00-2:30");
					am="CSE215L              RA               1:00-2:30";
					break;
				case 5:
					System.out.println("CSE215L              RA               2:40-4:10");
					am="CSE215L              RA               2:40-4:10";
				    break;
				case 6:
					System.out.println("CSE215L              RA               4:20-5:50");
					am="CSE215L              RA               4:20-5:50";
				    break;
				}
				break;
			}
			break;
		case 3:
			System.out.println("Choose number of class days:");
			System.out.println("1.ST(Sunday and Tuesday)");
			System.out.println("2.MW(Monday and Wednesday)");
			System.out.println("3.RA(Thursday and Saturday)");
			arr[i]=sd.nextInt();
			switch(arr[i]) {
			case 1:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("MAT120               ST               8:00-9:30");
					al="MAT120               ST               8:00-9:30";
					break;
				case 2:
					System.out.println("MAT120               ST               9:40-11:10");
					al="MAT120               ST               9:40-11:10";
					break;
				case 3:
					System.out.println("MAT120               ST               11:20-12:50");
					al="MAT120               ST               11:20-12:50";
					break;
				case 4:
					System.out.println("MAT120               ST               1:00-2:30");
					al="MAT120               ST               1:00-2:30";
					break;
				case 5:
					System.out.println("MAT120               ST               2:40-4:10");
					al="MAT120               ST               2:40-4:10";
				    break;
				case 6:
					System.out.println("MAT120               ST               2:40-4:10");
					al="MAT120               ST               2:40-4:10";
				    break;
				}
			
				break;
			case 2:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("MAT120               MW               8:00-9:30");
					al="MAT120               MW               8:00-9:30";
					break;
				case 2:
					System.out.println("MAT120               MW               9:40-11:10");
					al="MAT120               MW               9:40-11:10";
					break;
				case 3:
					System.out.println("MAT120               MW               11:20-12:50");
					al="MAT120               MW               11:20-12:50";
					break;
				case 4:
					System.out.println("MAT120               MW               1:00-2:30");
					al="MAT120               MW               1:00-2:30";
					break;
				case 5:
					System.out.println("MAT120               MW               2:40-4:10");
					al="MAT120               MW               2:40-4:10";
				    break;
				case 6:
					System.out.println("MAT120               MW               4:20-5:50");
					al="MAT120               MW               4:20-5:50";
				    break;
				}
				break;
			case 3:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("MAT120               RA               8:00-9:30");
					al="MAT120                RA               8:00-9:30";
					break;
				case 2:
					System.out.println("MAT120               RA               9:40-11:10");
					al="MAT120                RA               9:40-11:10";
					break;
				case 3:
					System.out.println("MAT120              RA               11:20-12:50");
					al="MAT120               RA               11:20-12:50";
					break;
				case 4:
					System.out.println("MAT120               RA               1:00-2:30");
					al="MAT120                RA               1:00-2:30";
					break;
				case 5:
					System.out.println("MAT120               RA               2:40-4:10");
					al="MAT120                RA               2:40-4:10";
				    break;
				case 6:
					System.out.println("MAT120               RA               4:20-5:50");
					al="MAT120                RA               4:20-5:50";
				    break;
				}
				break;
			}
			break;
		case 4:
			System.out.println("Choose number of class days:");
			System.out.println("1.ST(Sunday and Tuesday)");
			System.out.println("2.MW(Monday and Wednesday)");
			System.out.println("3.RA(Thursday and Saturday)");
			arr[i]=sd.nextInt();
			switch(arr[i]) {
			case 1:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("MAT125               ST               8:00-9:30");
					ak="MAT125               ST               8:00-9:30";
					break;
				case 2:
					System.out.println("MAT125               ST               9:40-11:10");
					ak="MAT125               ST               9:40-11:10";
					break;
				case 3:
					System.out.println("MAT125               ST               11:20-12:50");
					ak="MAT125               ST               11:20-12:50";
					break;
				case 4:
					System.out.println("MAT125               ST               1:00-2:30");
					ak="MAT125               ST               1:00-2:30";
					break;
				case 5:
					System.out.println("MAT125               ST               2:40-4:10");
					ak="MAT125               ST               2:40-4:10";
				    break;
				case 6:
					System.out.println("MAT125               ST               4:20-5:50");
					ak="MAT125               ST               4:20-5:50";
				    break;
				}
			
				break;
			case 2:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("MAT125               MW               8:00-9:30");
					ak="MAT125               MW               8:00-9:30";
					break;
				case 2:
					System.out.println("MAT125               MW               9:40-11:10");
					ak="MAT125               MW               9:40-11:10";
					break;
				case 3:
					System.out.println("MAT125               MW               11:20-12:50");
					ak="MAT125               MW               11:20-12:50";
					break;
				case 4:
					System.out.println("MAT125               MW               1:00-2:30");
					ak="MAT125               MW               1:00-2:30";
					break;
				case 5:
					System.out.println("MAT125               MW               2:40-4:10");
					ak="MAT125               MW               2:40-4:10";
				    break;
				case 6:
					System.out.println("MAT125               MW               4:20-5:50");
					ak="MAT125               MW               4:20-5:50";
				    break;
				}
				break;
			case 3:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("MAT125               RA               8:00-9:30");
					ak="MAT125               RA               8:00-9:30";
					break;
				case 2:
					System.out.println("MAT125               RA               9:40-11:10");
					ak="MAT125               RA               9:40-11:10";
					break;
				case 3:
					System.out.println("MAT125               RA               11:20-12:50");
					ak="MAT125               RA               11:20-12:50";
					break;
				case 4:
					System.out.println("MAT125               RA               1:00-2:30");
					ak="MAT125               RA               1:00-2:30";
					break;
				case 5:
					System.out.println("MAT125               RA               2:40-4:10");
					ak="MAT125               RA               2:40-4:10";
				    break;
				case 6:
					System.out.println("MAT125               RA               4:20-5:50");
					ak="MAT125               RA               4:20-5:50";
				    break;
				}
				break;
			}
			break;
		case 5:
			System.out.println("Choose number of class days:");
			System.out.println("1.ST(Sunday and Tuesday)");
			System.out.println("2.MW(Monday and Wednesday)");
			System.out.println("3.RA(Thursday and Saturday)");
			arr[i]=sd.nextInt();
			switch(arr[i]) {
			case 1:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("ENV203               ST               8:00-9:30");
					ao="ENV203               ST               8:00-9:30";
					break;
				case 2:
					System.out.println("ENV203               ST               9:40-11:10");
					ao="ENV203               ST               9:40-11:10";
					break;
				case 3:
					System.out.println("ENV203               ST               11:20-12:50");
					ao="ENV203               ST               11:20-12:50";
					break;
				case 4:
					System.out.println("ENV203               ST               1:00-2:30");
					ao="ENV203               ST               1:00-2:30";
					break;
				case 5:
					System.out.println("ENV203               ST               2:40-4:10");
					ao="ENV203               ST               2:40-4:10";
				    break;
				case 6:
					System.out.println("ENV203               ST               4:20-5:50");
					ao="ENV203               ST               4:20-5:50";
				    break;
				}
			
				break;
			case 2:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("ENV203               MW               8:00-9:30");
					ao="ENV203               MW               8:00-9:30";
					break;
				case 2:
					System.out.println("ENV203               MW               9:40-11:10");
					ao="ENV203               MW               9:40-11:10";
					break;
				case 3:
					System.out.println("ENV203               MW               11:20-12:50");
					ao="ENV203               MW               11:20-12:50";
					break;
				case 4:
					System.out.println("ENV203               MW               1:00-2:30");
					ao="ENV203               MW               1:00-2:30";
					break;
				case 5:
					System.out.println("ENV203               MW               2:40-4:10");
					ao="ENV203               MW               2:40-4:10";
				    break;
				case 6:
					System.out.println("ENV203               MW               4:20-5:50");
					ao="ENV203               MW               4:20-5:50";
				    break;
				}
				break;
			case 3:
				System.out.println("Choose the number of preferable class timing:");
				System.out.println("1.8:00-9:30");
				System.out.println("2.9:40-11:10");
				System.out.println("3.11:20-12:50");
				System.out.println("4.1:00-2:30");
				System.out.println("5.2:40-4:10");
				System.out.println("6.4:20-5:50");
				brr[i]=sd.nextInt();
				switch(brr[i]) {
				case 1:
					System.out.println("ENV203               RA               8:00-9:30");
					ao="ENV203               RA               8:00-9:30";
					break;
				case 2:
					System.out.println("ENV203               RA               9:40-11:10");
					ao="ENV203               RA               9:40-11:10";
					break;
				case 3:
					System.out.println("ENV203               RA               11:20-12:50");
					ao="ENV203               RA               11:20-12:50";
					break;
				case 4:
					System.out.println("ENV203               RA               1:00-2:30");
					ao="ENV203               RA               1:00-2:30";
					break;
				case 5:
					System.out.println("ENV203               RA               2:40-4:10");
					ao="ENV203               RA               2:40-4:10";
				    break;
				case 6:
					System.out.println("ENV203               RA               4:20-5:50");
					ao="ENV203               RA               4:20-5:50";
				    break;
				}
				break;
			}
		    break;
		
		}
	}
	System.out.println(ar);
	System.out.println(am);
	System.out.println(al);
	System.out.println(ak);
	System.out.println(ao);

}
}


