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
		System.out.println("\nPodaj dat� wykonanego �wiczenia");
		this.date = in.nextLine();
		
		System.out.println("\nPodaj nazw� �wiczenia: ");
		this.excersise = in.nextLine();
		
		System.out.println("\nPodaj liczb� serii: ");
		this.set = in.nextInt();
		
		System.out.println("\nPodaj liczb� powt�rze� wykonan� w seriach: ");
		this.repeats = in.nextInt();
		
		System.out.println("\nPodaj obci��enie: ");
		this.weight = in.nextDouble();
		
		//Saving results
		
		try
		{
			PrintWriter printer = new PrintWriter(new FileWriter("cwiczenia.txt",true));
			printer.println("---------------------------------");
			printer.println("Data: " + date);
			printer.println("�wiczenie: " + excersise);
			printer.println("Ilo�� serii: " + set);
			printer.println("Ilo�� powt�rze�: " + repeats);
			printer.println("Obci��enie: " +weight + "kg");
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
		return "\nNazwa �wiczenia: " + excersise + "\nilo�� serii: " + set + 
				"\nilo�� powt�rze�:  " + repeats + "\nobci��enie: " + weight + "kg";
		
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