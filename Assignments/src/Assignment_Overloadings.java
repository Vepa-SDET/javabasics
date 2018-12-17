
public class Assignment_Overloadings {

	public static void main(String[] args) {
		// Ass_8
		System.out.println(getDurationString(5000));
		System.out.println(getDurationString(400,55));
		
		// Ass_9
		System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0,4.0));
		System.out.println(area(-1,4.0));
		
		//Ass_10
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);

	}
	
	public static String getDurationString(int minutes, int seconds) {
		if(minutes>=0 && seconds>=0 && seconds<=59) {
			int mins=minutes%60;
			int hours=(minutes-mins)/60;
			return hours+"h "+mins+"m "+seconds+"s";
		}else {
			return "Invalid Value";
		}
	}
	
	public static String getDurationString(int seconds) {
		if(seconds>=0) {
			int secs=seconds%60;
			int minutes=(seconds-secs)/60;
			return getDurationString(minutes,secs);
		}else {
			return "Invalid Value";
		}
	}
	
	public static double area(double radius) {
		if(radius>0) {
			return radius*radius*3.14159;
		}else {
			return -1;
		}
	}
	
	public static double area(double x,double y) {
		if(y>0 && x>0) {
			return x*y;
		}else {
			return -1;
		}
	}
	
	public static void printYearsAndDays(long minutes) {
		if(minutes>0) {
			long hours=(minutes-minutes%60)/60;
			long days=(hours-hours%24)/24;
			long years=(days-days%365)/365;
			System.out.println(minutes+" min = "+years+" y and "+days%365+" d");
		}else {
			System.out.println("Invalid Value");
		}
	}

}
