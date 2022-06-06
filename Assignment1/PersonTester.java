import java.util.ArrayList;
public class PersonTester
{
	public static void main (String [] args)
	{
		System.out.println("Creating first person: Abraham Lincoln \n");
		Person Abraham = new Person ("Abraham", "Lincoln");
		
		System.out.print ("Printing Person 1's first name: ");
		Abraham.printFirstName();
		
		System.out.print ("Printing Person 1's last name: ");
		Abraham.printLastName();
		
		System.out.print ("Printing Person 1's full name: ");
		Abraham.printFullName();
		
		System.out.print ("Printing Person 1's ID: ");
		Abraham.printID();
		
		System.out.println("\nPrinting with toString: ");
		System.out.println(Abraham);
		
		System.out.println("Creating second person: Donald Trump");
		Person Donald = new Person ("Donald", "Trump");
		System.out.println("Printing Person 2's data - Note that Person 2's ID is automatically set to 2. ");
		System.out.println(Donald);
		
		System.out.println("Creating third person: Joe Biden");
		Person Joe = new Person ("Joe", "Biden");
		System.out.println("Printing Person 3's data - Note that Person 3's ID is automatically set to 3. ");
		System.out.println(Joe);
		
		System.out.println("------------------------------------------------------------------------------\n");
		
		System.out.println("Creating first full time employee: Sara Adams. Sara works in the Marketing Department and earns a salary of $80,000:");
		FullTimeEmployee Sara = new FullTimeEmployee ("Sara", "Adams", "Marketing", 80000);
		System.out.println(Sara);
		
		System.out.println("Changing Sara's Department to Telecommunications");
		Sara.setDepartment("Telecommunications");
		System.out.println(Sara);
		
		System.out.println("Changing Sara's Salary to $100,000");
		Sara.setSalary(100000);
		System.out.println(Sara);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("Creating first hourly wage employee: John Smith.");
		System.out.print("John works in the Sales Department for $20/hour - ");
		System.out.println("he works 5 hours in the first week, 8 hours in the second, 10 hours in the third, and 20 hours in the fourth. ");
		HourlyEmployee John = new HourlyEmployee ("Sales", "John", "Smith", 20, 5, 8, 10, 20);
		System.out.println(John);
		
		System.out.println("Changing John's Department to Human Resources");
		John.setDepartment("Human Resources");
		System.out.println(John);
		
		System.out.println("Setting hourly wages to $30/hour.");
		John.setHourlyRate(30);
		System.out.println(John);
		
		System.out.println("Setting weekly hours to: 15, 17, 19, 21");
		John.setWeeklyHours(0,15);
		John.setWeeklyHours(1,17);
		John.setWeeklyHours(2,19);
		John.setWeeklyHours(3, 21);
		System.out.println(John);
		
		System.out.println("------------------------------------------------------------------------------\n");
		
		System.out.println("Creating first student: Keshav Narang - Math (97%), English (95%), Computer Science (98%)");
		Student Keshav = new Student ("Keshav", "Narang");
		Keshav.addClass ("Math", 97);
		Keshav.addClass ("English", 95);
		Keshav.addClass ("Computer Science", 98);
		System.out.println(Keshav);

		System.out.println("Adding a new subject - Physics (93%)");
		Keshav.addClass ("Physics", 93);
		System.out.println(Keshav.printClasses());

		System.out.println("Dropping a subject - English");
		Keshav.removeClass ("English");
		System.out.println(Keshav.printClasses());
		
		System.out.println("Changing the score of a course - Computer Science (100%)");
		Keshav.setScore ("Computer Science", 100);
		System.out.println(Keshav.printClasses());
		
		System.out.println("------------------------------------------------------------------------------\n");
		
		System.out.println("Creating an address book of students. Only students can be added to this collection, or an error will be thrown. ");
		AddressBook <Student> Book = new AddressBook <Student> ();
		System.out.println("Adding Keshav Narang to the address book: ");
		Book.add(Keshav);
		System.out.println(Book);
		
		System.out.println("Adding a new student: Alice Beckham - English (95%), History (88%), Art (93%), Philosophy (86%)");
		Student Alice = new Student ("Alice", "Beckham");
		Alice.addClass ("English", 95);
		Alice.addClass ("History", 88);
		Alice.addClass ("Art", 93);
		Alice.addClass ("Philosophy", 86);
		Book.add(Alice);
		System.out.println(Book);
		
		System.out.println("Adding a new student: Charles Darwin - Biology (100%), Chemistry (97%), English (94%)");
		Student Charles = new Student ("Charles", "Darwin");
		Charles.addClass ("Biology", 100);
		Charles.addClass ("Chemistry", 97);
		Charles.addClass ("English", 94);
		Book.add(Charles);
		System.out.println(Book);
		
		System.out.println("Trying to add a duplicate of Alice Beckham - Not allowed: ");
		Student Alice2 = new Student ("Alice", "Beckham");
		Alice2.addClass ("English", 95);
		Alice2.addClass ("History", 88);
		Alice2.addClass ("Art", 93);
		Alice2.addClass ("Philosophy", 86);
		Book.add(Alice2);
		System.out.println(Book);
		
		System.out.println("Removing Keshav Narang: ");
		Book.remove(Keshav);
		System.out.println(Book);
		
		System.out.println("Searching for Charles Darwin by first name.");
		System.out.println(Book.search("Charles"));
		
		System.out.println("Searching for Charles Darwin by last name.");
		System.out.println(Book.search("Darwin"));
		
		System.out.println("Searching for Charles Darwin by ID.");
		System.out.println(Book.search(8));
		
		System.out.println("Searching for Keshav Narang [Deleted] by first name.");
		System.out.println(Book.search("Keshav"));
	}
}
class Person
{
	private String firstName;
	private String lastName;
	private int personID;
	private static int ID = 1;
	
	public Person (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		personID = ID;
		ID++;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	public int getID()
	{
		return personID;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setFullName(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void printFirstName()
	{
		System.out.println(getFirstName());
	}
	
	public void printLastName()
	{
		System.out.println(getLastName());
	}
	
	public void printFullName()
	{
		System.out.println(getFirstName() + " " + getLastName());
	}
	
	public void printID()
	{
		System.out.println(getID());
	}
	
	public String toString()
	{
		return "\nName: " + getFullName() + "\nID: " + getID() + "\n"; 
	}
}

class Student extends Person
{
	private ArrayList <String> classes = new ArrayList <String> ();;
	private ArrayList <Integer> grades = new ArrayList <Integer> ();;
	
	public Student (String firstName, String lastName)
	{
		super (firstName, lastName);
	}
	
	public ArrayList <String> getClasses ()
	{
		return classes;
	}
	
	public ArrayList <Integer> getScores ()
	{
		return grades;
	}
	
	public int getScore (String className)
	{
		for (int i = 0 ; i < classes.size(); i++)
		{
			if (classes.get(i) == className)
			{
				return grades.get(i);
			}
		}
		
		return -1;
	}
	
	public void setScore (String className, int grade)
	{
		for (int i = 0 ; i < classes.size(); i++)
		{
			if (classes.get(i) == className)
			{
				grades.set(i, grade);
			}
		}
	}
	
	public void addClass (String className, int grade)
	{
		for (int i = 0 ; i < classes.size(); i++)
		{
			if (classes.get(i) == className)
			{
				return;
			}
		}
		
		classes.add(className);
		grades.add(grade);
	}
	
	public void removeClass (String className)
	{
		for (int i = 0 ; i < classes.size(); i++)
		{
			if (classes.get(i) == className)
			{
				classes.remove(i);
				grades.remove(i);
			}
		}
	}
	
	public String printClasses ()
	{
		String toReturn = "";
		for (int i = 0; i < classes.size(); i++)
		{
			toReturn += classes.get(i) + " (" + grades.get(i) + "%) \n";
		}
		return toReturn;
	}
	
	public String toString()
	{
		return super.toString() + printClasses();
	}
}

class HourlyEmployee extends Person
{
	private String department;
	private int hourlyRate;
	private int [] weeklyHours = new int [4];
	
	public HourlyEmployee (String department, String firstName, String lastName, int hourlyRate, int firstWeekHours, int secondWeekHours, int thirdWeekHours, int fourthWeekHours)
	{
		super(firstName, lastName);
		this.department = department;
		this.hourlyRate = hourlyRate;
		weeklyHours[0] = firstWeekHours;
		weeklyHours[1] = secondWeekHours;
		weeklyHours[2] = thirdWeekHours;
		weeklyHours[3] = fourthWeekHours;
	}
	
	public String getDepartment ()
	{
		return department;
	}
	
	public void setDepartment (String department)
	{
		this.department = department;
	}
	
	public int getTotalHours ()
	{
		return weeklyHours[0] + weeklyHours[1] + weeklyHours[2] + weeklyHours[3];
	}
	
	public double getAverageWeeklyHours ()
	{
		return getTotalHours()/weeklyHours.length;
	}
	
	public int getTotalWages ()
	{
		return hourlyRate*getTotalHours();
	}
	
	public void setHourlyRate (int hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	
	public void setWeeklyHours (int weekNumber, int numberHours)
	{
		weeklyHours[weekNumber] = numberHours;
	}
	
	public String toString ()
	{
		String hourlyWageEmployeeInformation = "";
		hourlyWageEmployeeInformation += "Department: " + getDepartment();
		hourlyWageEmployeeInformation += "\nWeek 1: Worked " + weeklyHours[0] + " hours for $" + hourlyRate + "/hour. Weekly Wage: $" + weeklyHours[0]*hourlyRate;
		hourlyWageEmployeeInformation += "\nWeek 2: Worked " + weeklyHours[1] + " hours for $" + hourlyRate + "/hour. Weekly Wage: $" + weeklyHours[1]*hourlyRate;
		hourlyWageEmployeeInformation += "\nWeek 3: Worked " + weeklyHours[2] + " hours for $" + hourlyRate + "/hour. Weekly Wage: $" + weeklyHours[2]*hourlyRate;
		hourlyWageEmployeeInformation += "\nWeek 4: Worked " + weeklyHours[3] + " hours for $" + hourlyRate + "/hour. Weekly Wage: $" + weeklyHours[3]*hourlyRate;
		
		hourlyWageEmployeeInformation += "\nTotal Hours Worked: " + getTotalHours();
		hourlyWageEmployeeInformation += "\nAverage Hours Worked / Week: " + getAverageWeeklyHours();
		hourlyWageEmployeeInformation += "\nTotal Wages: $" + getTotalWages() + "\n";
		
		return super.toString() + hourlyWageEmployeeInformation;
	}
}

class FullTimeEmployee extends Person
{
	private String department;
	private int salary;
	
	public FullTimeEmployee (String firstName, String lastName, String department, int salary)
	{
		super(firstName, lastName);
		this.department = department;
		this.salary = salary;
	}
	
	public String getDepartment ()
	{
		return department;
	}
	
	public int getSalary ()
	{
		return salary;
	}
	
	public void setDepartment (String department)
	{
		this.department = department;
	}
	
	public void setSalary (int salary)
	{
		this.salary = salary;
	}
	
	public String toString ()
	{
		String fullTimeEmployeeSpecificInformation = "";
		fullTimeEmployeeSpecificInformation += "Department: " + getDepartment();
		fullTimeEmployeeSpecificInformation += "\nSalary: $" + getSalary() + "\n";
		return super.toString() + fullTimeEmployeeSpecificInformation;
	}
}
class AddressBook <Item extends Person>
{
	private ArrayList <Item> Book = new ArrayList <Item> ();
	
	public void add (Item Person)
	{
		for (int i = 0; i < Book.size(); i++)
		{
			if (Book.get(i).getFullName().equals(Person.getFullName()))
			{
				return;
			}
		}
		Book.add(Person);
	}
	
	public void remove (Item Person)
	{
		for (int i = 0; i < Book.size(); i++)
		{
			if (Book.get(i).getFullName().equals(Person.getFullName()))
			{
				Book.remove(i);
			}
		}
	}
	
	public <Type> Item search (Type Search)
	{
		if (Search instanceof Integer)
		{
			for (int i = 0; i < Book.size(); i++)
			{
				if (Book.get(i).getID() == ((Integer)Search))
				{
					return Book.get(i);
				}
			}
		}
		else if (Search instanceof String)
		{
			for (int i = 0; i < Book.size(); i++)
			{
				if ((Book.get(i).getFirstName() == (Search)) || (Book.get(i).getLastName() == (Search)))
				{
					return Book.get(i);
				}
			}
		}
		return null;
	}
	
	public String toString ()
	{
		String addressBookInformation = "\nAddress Book:";
		for (Item person: Book)
		{
			addressBookInformation += person.toString();
		}
		return addressBookInformation;
	}
}