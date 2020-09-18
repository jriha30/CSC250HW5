
public class Driver
{
	public static void main(String[] args)
	{
		BibleBook book1 = new BibleBook("Revelation", 22, "Description of the end times.");
		BibleBook book2 = new BibleBook("John", 21, "An account of Jesus' life written by John.");
		BibleBook book3 = new BibleBook("Romans", 16, "Letters written to the Romans by Paul.");
		
		book1.display();
		book2.display();
		book3.display();
	}
}
