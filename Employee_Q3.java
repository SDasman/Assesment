package Java_Sample;

import java.util.Date;

public class Employee_Q3 {

	/**
	 * Variables in Employee field. These are private 
	 * because they will contain sensitive information.
	 */
	private Boolean managerFlag;
	private String name = new String();
	private Date dateHired = new Date();
	private Integer id;
	
	/**
	 * Getters and Setters for Variables.
	 */
	public Boolean getManagerFlag() {
		return managerFlag;
	}

	public String getName() {
		return name;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public Integer getId() {
		return id;
	}

	/**
	* name - name for the Employee
	* dateHired - dateHired for the Employee
	* id - id field for the Employee
	* managerFlag - Whether the Employee is a Manager or Not.
	*/
	public Employee_Q3(String name, Date dateHired, int id, boolean managerFlag){
		
		this.name = name;
		this.dateHired = dateHired;
		this.id = id;
		this.managerFlag = managerFlag;
		
	}//end Employee(String, Date, int)

	/**Here we are initializing the values for the default Employee constructor.*/
	public Employee_Q3(){
		name = "";
		dateHired = null;
		id = 0;
	}
	/** Here we are setting the key Employee variables. Manager Flag
	* indicates if a certain Employee is a Manager.
	*/
	public Employee_Q3(String name, Date dateHired, int id, boolean managerFlag) {
		this.name = name;
		this.dateHired = dateHired;
		this.id = id;
		this.managerFlag = managerFlag;
	}

		/**
	* PartTimeEmployee is a subclass of Employee. This distinction is important since
	* a part time employee will have a smaller week max cap and be paid a different rate.
	*/
	class PartTimeEmployee extends Employee{
		
		/**Fields pertaining exclusively to PartTimeEmployees*/
		private int weekMaxHours;
		private double hourlyRate;
		
		public PartTimeEmployee(){
			super();
			weekMaxHours = 30;
			hourlyRate = 12;
		}

		public PartTimeEmployee(String name, Date dateHired, int id, boolean managerFlag, 
			int weekMaxHours, double hourlyRate){
		super(name, dateHired, id, managerFlag); // This "super" keyword returns the superclass variables from Employee.
		this.weekMaxHours = weekMaxHours;
		this.hourlyRate = hourlyRate;
	}//end PartTimeEmployee(String, Date, int, int, int, double)
	
	/**@return weekMaxHours*/
	public int weekMaxHours(){
		return weekMaxHours;
	}//end getweekMaxHours
	
	/**
	 * @return hourlyRate for this PartTimeEmployee
	 */
	public double getHourlyRate(){
		return hourlyRate;
	}//end getHourlyRate()
	
}//end PartTimeEmployee class

/**
 * FullTimeEmployee is a subclass of Employee and encapsulates data unique
 * to full-time employees, such as salary, number of vacation days, and number of
 * sick days. Since we're keeping track of PartTimeEmployees, it seemed prudent
 * to not only keep track of their information but create a special subclass that would keep
 * track of FullTimeEmployee data.
 * 
 */
class FullTimeEmployee extends Employee{
	
	/**Variable fields*/
	private int salary;
	private int vacationHours;
	private int sickDays;
	
	/**Default Constructor*/
	public FullTimeEmployee(){
		salary = 0;
		vacationHours = 0;
		sickDays = 0;	
	}//end FullTimeEmployee()
	
	/**
	* @param name is set to name field for this Employee
	* @param dateHired is set to dateHired field for this Employee
	* @param id is set to id field for this Employee
	* @param managerFlag flags whether this Employee is a manager
	* 
	* Other fields for this instance are initialized to 0.
	*/
	public FullTimeEmployee(String name, Date dateHired, int id, boolean managerFlag){
		super(name, dateHired, id, managerFlag);
		salary = 0;
		vacationHours = 0;
		sickDays = 0;
	}//end PartTimeEmployee(String, Date, int)
	
	/**
	* @param name is set to name field for this FullTimeEmployee
	* @param dateHired is set to dateHired field for this FullTimeEmployee
	* @param id is set to id field for this FullTimeEmployee
	* @param managerFlag flags whether this FullTimeEmployee is a manager
	* @param salary is stored for this instance of FullTimeEmployee
	* @param vacationHours is stored for this instance of FullTimeEmployee
	* @param sickDays is stored for this instance of FullTimeEmployee
	*/
	public FullTimeEmployee(String name, Date dateHired, int id, boolean managerFlag,
			int salary, int vacationHours, int sickDays){
		super(name, dateHired, id, managerFlag);
		this.salary = salary;
		this.vacationHours = vacationHours;
		this.sickDays = sickDays;
		
	}//end PartTimeEmployee(String, Date, int)

	/**
	 * @return salary
	 */
	public int getSalary() {
		return salary;
	}//end getSalary()

	/**
	 * 
	 * @return vacationHours
	 */
	public int getVacationHours() {
		return vacationHours;
	}//end getVacationHours()

	/**
	 * @return sickDays
	 */
	public int getSickDays() {
		return sickDays;
	}//end getSickDays()
	
}//end FullTimeEmployee
	}

}
