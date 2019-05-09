import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Random;

public class Write
{
	public static void main(String[] args)
	{
		try
		{
			Random generator = new Random();
			File file = new File("Mediator.txt");
			PrintWriter w = new PrintWriter(file);
			w.println(generator.nextInt(50) + 1);
			w.println(generator.nextInt(50) + 1);
			w.close();
		} // end catch
		catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} // end catch
	} // end main
} // end class

