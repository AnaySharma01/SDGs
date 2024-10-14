/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Imports the Scanner Class to allow for input
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//Creates a counter to check the number  of SDGs guessed correctly
		int correctCounter = 0;
		System.out.println("Let' see if you can name all 17 sustainable development goals.");
		System.out.print("Enter goal 1: ");
		//Takes in input
		String goal1 = keyboard.nextLine();
		//Checks if the input is equal to the SDG
		goal1 = goal1.toUpperCase();
		if (goal1.equals("NO POVERTY"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 2: ");
		String goal2 = keyboard.nextLine();
		goal2 = goal2.toUpperCase();
		if (goal2.equals("ZERO HUNGER"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 3: ");
		String goal3 = keyboard.nextLine();
		goal3 = goal1.toUpperCase();
		if (goal1.equals("GOOD HEALTH AND WELL BEING"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 4: ");
		String goal4 = keyboard.nextLine();
		goal4 = goal4.toUpperCase();
		if (goal4.equals("QUALITY EDUCATION"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 5: ");
		String goal5 = keyboard.nextLine();
		goal5 = goal5.toUpperCase();
		if (goal5.equals("GENDER EQUALITY"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 6: ");
		String goal6 = keyboard.nextLine();
		goal6 = goal6.toUpperCase();
		if (goal6.equals("CLEAN WATER AND SANITATION"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 7: ");
		String goal7 = keyboard.nextLine();
		goal7 = goal7.toUpperCase();
		if (goal7.equals("AFFORDABLE AND CLEAN ENERGY"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 8: ");
		String goal8 = keyboard.nextLine();
		goal8 = goal8.toUpperCase();
		if (goal8.equals("DECENT WORK AND EDUCATION"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 9: ");
		String goal9 = keyboard.nextLine();
		goal9 = goal9.toUpperCase();
		if (goal9.equals("INDUSTRY, INNOVATION AND INFRASTRUCTURE") || goal9.equals("INDUSTRY, INNOVATION, AND INFRASTRUCTURE"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 10: ");
		String goal10 = keyboard.nextLine();
		goal10 = goal10.toUpperCase();
		if (goal10.equals("REDUCED INEQUALITIES"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 11: ");
		String goal11 = keyboard.nextLine();
		goal11 = goal1.toUpperCase();
		if (goal11.equals("SUSTAINABLE CITIES AND COMMUNITIES"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 12: ");
		String goal12 = keyboard.nextLine();
		goal12 = goal12.toUpperCase();
		if (goal12.equals("RESPONSIBLE CONSUMPTION AND PRODUCTION"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 13: ");
		String goal13 = keyboard.nextLine();
		goal13 = goal13.toUpperCase();
		if (goal13.equals("CLIMATE ACTION"))

		{
			correctCounter += 1;
		}


		System.out.print("Enter goal 14: ");
		String goal14 = keyboard.nextLine();
		goal14 = goal14.toUpperCase();
		if (goal14.equals("LIFE BELOW WATER"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 15: ");
		String goal15 = keyboard.nextLine();
		goal15 = goal15.toUpperCase();
		if (goal15.equals("LIFE ON LAND"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 16: ");
		String goal16 = keyboard.nextLine();
		goal16 = goal16.toUpperCase();
		if (goal16.equals("PEACE, JUSTICE, AND STRONG INSTITUTIONS"))

		{
			correctCounter += 1;
		}

		System.out.print("Enter goal 17: ");
		String goal17 = keyboard.nextLine();
		goal17 = goal17.toUpperCase();
		if (goal17.equals("PARTNERSHIP FOR THE GOALS"))

		{
			correctCounter += 1;
		}

		//Displays the number of SDGs guessed coreect
		System.out.println("You got " + correctCounter + " goals correct!");

	}
}
