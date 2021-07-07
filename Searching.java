package ProjectDataStructure;

import java.util.Scanner;

public class Searching { //Searching class
		
		public static void search() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter course ID: ");
			String ID = sc.nextLine();
			
			boolean found = false;

			for(int i = 0; i <AssignmentToDo.assignmentList.size(); i++){
				// if assignment info is found
				if(AssignmentToDo.assignmentList.get(i).getcourseID().contains(ID))
				{
					found = true;
					System.out.println(AssignmentToDo.assignmentList.get(i));
				}
			}
			
			if(found == false) // assignment info not found
				System.out.println("Assignment not found!");
		}

} //end of Searching class
