import java.util.ArrayList;
/*
 * A simple general class that describes a report. It consists of a title, author, date and a list of sections
 */
public class Report
{
	private String title;
	private String author;//school name for report card
	private String date;
	private ArrayList<String> sections; 
	
	public Report(String title, String author, String date)
	{
		this.title = title;
		this.author = author;
		this.date = date;
		sections = new ArrayList<String>();
	}
	
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}
	
	public void setSection(String section)
	{
		sections.add(section);
	}

	public void print()
	{
		System.out.println(title + "\n\n" + author + "   " + date);
		for (int i = 0; i < sections.size(); i++)
		{
			System.out.println(sections.get(i));
		}
	}
	
}
