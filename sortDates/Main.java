package sortDates;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		start();

	}

	private static void start() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of dates");
		int number=scanner.nextInt();
		scanner.nextLine();
		Date []date=new Date[number];
		//System.out.println("enter the dates in dd/mm/yyyy");
		for(int index=0;index<number;index++)
		{
			System.out.println("enter the dates in dd/mm/yyyy");
			String strDate=scanner.nextLine();
			//String parts[]=strDate.split("/");
			String parts[]=new String[3];
			int index1=0;
			for(int i=0;i<strDate.length();)
			{
				String temp="";
				while(i<strDate.length()    &&   strDate.charAt(i)!='/')
				{
					temp+=strDate.charAt(i);
					i++;
				}
				
				parts[index1]=temp;
				index1++;
				i++;
			}
			int day=Integer.parseInt(parts[0]);
			int month=Integer.parseInt(parts[1]);
			int year=Integer.parseInt(parts[2]);
			date[index]=new Date(day,month,year);
		}
		sortDates(date);
	
		for(Date dates:date)
		{
			System.out.println(dates.toString());
		}
		
	}

	private static void sortDates(Date[] date) 
	{
		int length=date.length;
		
		for(int first=0;first<length-1;first++)
		{
			int minIndex=first;
			for(int second=first+1;second<=length-1;second++)
			{
				if(date[second].compareTo(date[minIndex])<0)
				{
					minIndex=second;
				}
			}
			Date temp=date[minIndex];
			date[minIndex]=date[first];
			date[first]=temp;
		}
		
	}

}
