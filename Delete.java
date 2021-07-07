package ProjectDataStructure;

import java.util.*;

public class Delete { //Delete class
	public static void delete(){
		
		/* DELETE INFO */
		// search for assignment by ID
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Course ID: ");
		String ID = sc.nextLine();
		
		boolean found = false;
	
		for(int i = 0; i < AssignmentToDo.assignmentList.size(); i++){
			// if assignment info is found
			if(AssignmentToDo.assignmentList.get(i).getcourseID().contains(ID))
			{
				found = true;
				// delete assignment info
				AssignmentToDo.assignmentList.remove(i);
				System.out.println("Course ID info successfully deleted!");
			}
		}
		
		if(found == false) // assignment info not found
			System.out.println("Course ID not found.");
	}

} //end of Delete class
