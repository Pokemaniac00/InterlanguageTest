import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Read
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("Mediator.txt");
			Scanner input = new Scanner(file);
			int a = Integer.parseInt(input.nextLine());
			int b = Integer.parseInt(input.nextLine());
			int c = Integer.parseInt(input.nextLine());
			System.out.printf("%d * %d = %d\n", a, b, c);
		} // end try
		catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} // end catch
	} // end main
} // end class

