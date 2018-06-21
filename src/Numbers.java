import java.util.Scanner;

public class Numbers {
	private static Scanner input;

	public static void main(String[] args) {

                input = new Scanner(System.in);

                //Values of each digit
                int hundreds = 0;
                int tens = 0;
                int ones = 0;
                int hundreds2 = 0;
                int tens2 = 0;
                int ones2 = 0;
                int sumHundreds;
                int sumTens;
                int sumOnes;
                
                //Prompt user to input 3 digit number           
                System.out.print("Enter a 3 digit number: ");
                int number1 = input.nextInt();
                System.out.print("Enter a 3 digit number: ");
                int number2 = input.nextInt();
                
                //Displays hundreds place digit
                hundreds = number1 / 100;
                System.out.printf("Hundreds place digit: %d " , hundreds);
                hundreds2 = number2/100;
                System.out.printf("Hundreds place digit: %d " , hundreds2);
                
                //Displays tens digit
                tens = (number1 / 10 %10);
                System.out.printf("\nTens place digit: % d " , tens);
                tens2 = (number2 / 10 %10); 
                System.out.printf("\nTens place digit: %d " , tens2);

                //Display ones digit
                ones = (number1 %10);
                System.out.printf("\nOnes place digit: %d " , ones);   
                ones2 = (number2 %10);
                System.out.printf("\nOnes palce digit: %d " , ones2);
                
                sumOnes = ones + ones2;
                sumTens = tens + tens2;
                sumHundreds = hundreds + hundreds2;
                
              if (sumOnes == sumTens && sumTens == sumHundreds) {
            	  System.out.print("\nTrue");
            	  
              } else {
            	  System.out.println("\nFalse");
              }
              }
}
