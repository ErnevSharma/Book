public class Book implements Comparable{
	private int pages;
	private String authorsFn;
	private String authorsLn;
	private String bookTitle;
	
	public Book(String bT, String aFN, String aLN, int pgs)
	{
		bookTitle = bT;
		authorsFn = aFN;
		authorsLn = aLN;
		pages = pgs;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public String getAuthorsName() 
	{
		return (authorsFn + " " + authorsLn);
	}
	
	public String getLastName()
	{
		return authorsLn;
	}
	
	public String getFirstName()
	{
		return authorsFn;
	}
	
	public int returnPages()
	{
		return pages;
	}
	
	public String toString()
	{
		String res = "";
		res += getAuthorsName() + ": " + bookTitle;
		return res;
	}

	
	public int compareTo(Object a) {
		
			return this.authorsLn.compareTo(((Book)a).getLastName());
	}

	
	
	
}