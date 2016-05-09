package session2_Assignments;

import java.util.Scanner;

public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Month=0;
		int Year=0;
		int MaxDaysOfMonth=0;
		System.out.println("Please Enter Month(M) & press Enter.");
		Scanner scaner=new Scanner(System.in);
		Month=scaner.nextInt();
		System.out.println("Please Enter Year(YYYY) & press Enter.");
		Year=scaner.nextInt();
		switch(Month){
		case 1:
			MaxDaysOfMonth=31;
			break;
		case 2:
			if(Year%4==0){
				MaxDaysOfMonth=29;
			}else
			MaxDaysOfMonth=28;
			break;
		case 3:
			MaxDaysOfMonth=31;
			break;
		case 4:
			MaxDaysOfMonth=30;
			break;
		case 5:
			MaxDaysOfMonth=31;
			break;
		case 6:
			MaxDaysOfMonth=30;
			break;
		case 7:
			MaxDaysOfMonth=31;
			break;
		case 8:
			MaxDaysOfMonth=31;
			break;
		case 9:
			MaxDaysOfMonth=30;
			break;
		case 10:
			MaxDaysOfMonth=31;
			break;
		case 11:
			MaxDaysOfMonth=30;
			break;
		case 12:
			MaxDaysOfMonth=31;
			break;
		}
		
		for(int i=1;i<=MaxDaysOfMonth;i++){
			System.out.println(i);
		}
		

	}

}
