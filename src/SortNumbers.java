import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class SortNumbers {

	public static void main(String[] args) {
		int[] array = new int[6];
		
		// Inmatning av numer
		enterNumbers(array);
		// Skriva ut inmatade nummer
		System.out.print("You have enterd: ");
		displayNumbers(array);
		// Sortera nummer
		Arrays.sort(array);
		// skriv ut sorterade nummer
		System.out.print("Sorted: ");
		displayNumbers(array);
	}
	
	private static void displayNumbers(int array[]) {
		// skriver ut 6 nummer i arrayen
		for(int i = 0; i < 6; ++i){
			System.out.print(array[i] + "  ");
		}
		System.out.println("!");
	}

	private static void enterNumbers(int array[]) {
		System.out.println("Please insert 6 numbers");
		//användaren skriver in 6 nummer
		for(int i = 0; i < 6 ; ++i){
			Scanner scan = new Scanner(System.in);
			int k = scan.nextInt();
			array[i]= k;
		}
	}

}
