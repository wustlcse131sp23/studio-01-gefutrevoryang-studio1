package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The frist of two intergers to be averaged?");
		int x = in.nextInt();
		System.out.println("The second of two intergers to be averaged?");
		int y = in.nextInt();
		
		double z = (x+y) / 2.0;
		System.out.println("Average of " + x + " and " + y + " is " + z);
	}

}
