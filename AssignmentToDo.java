package ProjectDataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class AssignmentToDo { //Assignment To Do class

	//declare the data fields
	protected String subjectName;
	protected String givenDate;
	protected String status;
	protected String courseID;
	protected String dueDate;
	protected String note;
	protected static LinkedList<AssignmentToDo> assignmentList = new LinkedList <AssignmentToDo>();
	static Scanner in = new Scanner(System.in);
	
	public AssignmentToDo( String cid, String sn, String gd, String s, String dd, String n) { //constructor with 6 arguments
		//declare and initialize the data fields
		this.courseID = cid;
		this.subjectName = sn;
		this.givenDate = gd;
		this.status = s;
		this.dueDate = dd;
		this.note = n;
	}
	
	//setter and getter method
	public String getsubjectName() {
		return this.subjectName;
	}
	
	public String getgivenDate() {
		return this.givenDate;
	}
	
	public String getstatus() {
		return this.status;
	}
	
	public String getcourseID() {
		return this.courseID;
	}
	
	public String getdueDate() {
		return this.dueDate;
	}
	
	public String getnote() {
		return this.note;
	}
	
	// mutator
	public void setsubjectName(String sn) {
		this.subjectName = sn;
	}

	public void setgivenDate(String gd) {
		this.givenDate = gd;
	}
	
	public void setstatus(String s) {
		this.status = s;
	}
	
	public void setcourseID(String cid) {
		this.courseID = cid;
	}
	
	
	public void setdueDate(String dd) {
		this.dueDate = dd;
	}
	
	public void setnote(String n) {
		this.note = n;
	}
	
	public String toString() { //overriding method
		return "Course ID\t: " + this.courseID
				+ "\n" + "Subject Name\t\t: " + this.subjectName
				+ "\n" + "Status\t\t: " + this.status 
				+ "\n" + "Given Date\t\t: " + this.givenDate 
				+ "\n" + "Due Date\t\t: " + this.dueDate
				+ "\n" + "Note\t: " + this.note;
	}
	
	private boolean iscourseIDInLinkedList(String txtcourseID) {
		boolean isID = true;
		
		for(AssignmentToDo ass : assignmentList) 
		{	
			if(ass.getcourseID().compareToIgnoreCase(txtcourseID)==0) 
			{
				isID = false;
			}

		}
		return isID;
	}
	
	// Add assignment into linked list
	public void addAssignment() { 
		
		// Check whether the assignment exist or not
		if( iscourseIDInLinkedList(getcourseID()) == false) {
			System.out.println("Error: This subject already existed!");
		}
		else {
			System.out.print("Course ID\t: ");
			this.courseID = in.next();
			in.nextLine();
			System.out.print("Subject Name\t\t: ");
			this.subjectName = in.nextLine();
			System.out.print("Status\t\t: ");
			this.status = in.nextLine();
			System.out.print("Given Date\t\t: ");
			this.givenDate = in.nextLine();
			System.out.print("Due Date\t\t: ");
			this.dueDate = in.nextLine();
			System.out.print("Note\t: ");
			this.note = in.nextLine();
			 assignmentList.add(new AssignmentToDo(getcourseID(), getsubjectName(),  getstatus(),  getgivenDate(), getdueDate(), getnote()));
			 System.out.println("Assignment successful added!");			
			}
	}
		
} //end of Assignment To Do class


