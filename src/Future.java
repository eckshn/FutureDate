import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Future {

	public static void main(String[] args) {
		Date today = new Date();
		String myName = new String();
		double future = 0;
		boolean correct = false;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		myName = kb.nextLine();
		
		System.out.println(myName + " please enter the number of days: ");
		while(!correct) {
			try { 
				future = kb.nextDouble();
				correct = true;
			} catch(InputMismatchException e) {
				System.out.println(myName + " please enter a NUMBER: ");
				kb.nextLine();
			}
		}
		
		System.out.println(FutureDate(myName, future, today));

	}
	
	public static String FutureDate(String name, double future, Date d) {
		int day = (int) future;
		double hour = 0;		
		double minute = 0;
		int second = 0;
		
		if(future != (int) future) {
			hour = future - ((int) future);
			hour = hour * 24;
			
			if(hour != (int) hour) {
				minute = hour - ((int) hour );
				minute = minute * 60;
				
				if(minute != (int) minute) {
					second = ((int) (hour - ((int) hour)));
					second = second * 60;
				}
			}
		}
		day = day + d.getDate();
		hour = hour + d.getHours();
		minute = minute + d.getMinutes();
		second = second + d.getSeconds();
		
		d.setDate(day);
		d.setHours((int) hour);
		d.setMinutes((int) minute);
		d.setSeconds(second);
		
		name = "Dear " + name + ", the date in " + future + " days will be around " + d + ".";
		return name;
	}

}
