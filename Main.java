import java.io.IOException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		// Menu
		while(1>0)
		{
		//1. Add a new workout
		System.out.println("\n Wci�nij 1, aby doda� �wiczenia\n Wci�nij 2 �eby zako�czy� program\n "
				+ "Wci�nij 3 aby wy�wietli� histori� dodanych �wicze�" );
		
		Scanner in = new Scanner(System.in);
		int choose = in.nextInt();
	
		
		switch(choose){
		
		case 1: choose = 1;
		
		//2. Ask for number of excersises to add
				System.out.println("\nIle �wicze� chcesz doda�?");
				int howMany = in.nextInt();
				Excersises[] excersises = new Excersises[howMany];
				for(int n = 0; n< howMany; n++)
				{
					
				excersises[n] = new Excersises();
				
				
				
		
				
					System.out.print(excersises[n].toString());	
		// Return to menu
				}	
					continue;
				
					
		case 2: choose = 2;
				System.out.println("\nZamykanie programu");
				System.exit(0);
				
				
		case 3: choose = 3;
		//3.Workout summary
				Excersises.Summary();
				
				continue;
				 
		
				}
		}
		}
		
		
		
		
		
		
	}


