import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String firstName;
		int userNum;
		String cont;

		// Ask user first name
		System.out.println("What is your first name?");
		firstName = scan.nextLine();
		System.out.println("Nice to meet you " + firstName + "! Would you like to enter a number?");
		cont = scan.next();
		while (cont.equalsIgnoreCase("yes")) {

			System.out.println(firstName + ", please enter a whole number between 1 - 100."); // prompt for number
																								// entered bet 1 - 100
			userNum = scan.nextInt();

			if (userNum > 0 && userNum < 100) { // add validation to make sure user enters valid number

				if ((userNum % 2 == 1) && (userNum > 60)) { // if integer is odd and > 60, print number entered and Odd
															// and over 60
					System.out.println(userNum + " is Odd and over 60.");
				}
				else if (userNum % 2 == 1) { // if/else statements if integer odd, print number entered: Odd
					System.out.println("Odd");
				}
				else if ((userNum % 2 == 0) && (userNum >= 2) && (userNum <= 25)) { // if integer even and in rage of
																					// 2-25, print even and less that 25
					System.out.println("Even and less than 25.");
				}
				else if ((userNum >= 26) && (userNum < 60)) { // if integer is even bet 26-60, print even
					System.out.println("Even");
				}
				else if (userNum >= 60) { // if integer is even and greater than 60, print number entered: Even
					System.out.println(userNum + " is even.");
				}

				scan.nextLine(); // garbage line
			
				System.out.println("Would you like to enter another number?");
				cont = scan.next();
				}
			}

		System.out.println("Have a great day!");
		scan.close();
	}

}
