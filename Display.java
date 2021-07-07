package ProjectDataStructure;

public class Display { //Display class
	
	// Display all assignments' information
	public static void display() {
		
		int i=1;
		for(AssignmentToDo ass :  AssignmentToDo.assignmentList) {
			System.out.println("Assignment " + i + "\n" + ass + "\n");
			i++;
		}
	}

} //end of Display class
