public class BibleBook
{
	private String bookName;
	private int numberOfChapters;
	private String chapterSummary;
	
	public BibleBook(String bookName, int numberOfChapters, String chapterSummary)
	{
		this.bookName = bookName;
		this.numberOfChapters = numberOfChapters;
		this.chapterSummary = chapterSummary;
	}
	
	public void display()
	{
		System.out.println(this.bookName + " (" + this.numberOfChapters + " Chapters)");
		System.out.println(this.chapterSummary);
	}
}