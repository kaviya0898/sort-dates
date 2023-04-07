package sortDates;

public class Date {
   
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDate() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public int compareTo(Date other)
	{
		if(this.year<other.year)
		{
			return -1;
		}
		else if(this.year>other.year)
		{
			return 1;
		}
		else if(this.month<other.month)
		{
			return -1;
		}
		else if(this.month>other.month)
		{
			return 1;
		}
		else if(this.day<other.day)
		{
			return -1;
		}
		else if(this.day>other.day)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public String toString()
	{
		String day=(this.day<10?"0":"")+this.day;
		String month=(this.month<10?"0":"")+this.month;
		return day+"/"+month+"/"+this.year;
	}
	
}
