import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Excersises {

	private int set;
	private int repeats;
	private String excersise;
	private double weight;
	private String date;
	

	public Excersises()
	{
	//add a excersise
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nPodaj datê wykonanego æwiczenia");
		this.date = in.nextLine();
		
		System.out.println("\nPodaj nazwê æwiczenia: ");
		this.excersise = in.nextLine();
		
		System.out.println("\nPodaj liczbê serii: ");
		this.set = in.nextInt();
		
		System.out.println("\nPodaj liczbê powtórzeñ wykonan¹ w seriach: ");
		this.repeats = in.nextInt();
		
		System.out.println("\nPodaj obci¹¿enie: ");
		this.weight = in.nextDouble();
		
		//Saving results
		
		try
		{
			PrintWriter printer = new PrintWriter(new FileWriter("cwiczenia.txt",true));
			printer.println("---------------------------------");
			printer.println("Data: " + date);
			printer.println("Æwiczenie: " + excersise);
			printer.println("Iloœæ serii: " + set);
			printer.println("Iloœæ powtórzeñ: " + repeats);
			printer.println("Obci¹¿enie: " +weight + "kg");
			printer.println("---------------------------------");
			printer.close();	
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	

	// print the summary
	
	public String toString()
	{
		return "\nNazwa æwiczenia: " + excersise + "\niloœæ serii: " + set + 
				"\niloœæ powtórzeñ:  " + repeats + "\nobci¹¿enie: " + weight + "kg";
		
	}
	
	// Summary of saved excersises
public static void Summary()
{
	BufferedReader br = null;
	FileReader fr = null;

	try {

		//br = new BufferedReader(new FileReader(FILENAME));
		fr = new FileReader("cwiczenia.txt");
		br = new BufferedReader(fr);

		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}

	} catch (IOException e) {

		e.printStackTrace();

	} finally {

		try {

			if (br != null)
				br.close();

			if (fr != null)
				fr.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}

	}
	
}

	

}