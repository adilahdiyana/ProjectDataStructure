package ProjectDataStructure;

import java.util.*;

public class Update { //Update class
	
	public static void update() { 
		
	// Update assignment information 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter course ID: ");
		String ID = scanner.nextLine();
		
		boolean found = false;
		
		for(AssignmentToDo at : AssignmentToDo.assignmentList){
			for(int i = 0; i < AssignmentToDo.assignmentList.size();i++){
				// if assignment info is found
				if(AssignmentToDo.assignmentList.get(i).getcourseID().contains(ID)){
					found = true;
					
					// select information to edit
					System.out.println("Assignment found! Select the details you would like to edit:\n");
					System.out.println("1. Course ID");
					System.out.println("2. Subject Name");
					System.out.println("3. Status");
					System.out.println("4. Given Date");
					System.out.println("5. Due Date");
					System.out.println("6. Note");
					
					System.out.print("\nEnter option: ");
					int option = scanner.nextInt();
					scanner.nextLine();
					
						// edit assignment info
					switch(option){
						case 1:
							System.out.print("Enter the new course ID: ");
							String newID = scanner.nextLine();
							at.setcourseID(newID);
							System.out.println("Course ID successfully updated!");
							break;
						case 2:
							System.out.print("Enter the new subject name: ");
							String newName = scanner.nextLine();
							at.setsubjectName(newName);
							System.out.println("Subject Name successfully updated.");
							break;
						case 3:
							System.out.print("Enter the new status: ");
							String newstatus = scanner.nextLine();
							at.setstatus(newstatus);
							System.out.println("Status successfully updated!");
							break;
						case 4:
							System.out.print("Enter the new given date: ");
							String newgivenDate = scanner.nextLine();
							at.setgivenDate(newgivenDate);
							System.out.println("Given date successfully updated!");
							break;
						case 5:
							System.out.print("Enter the new due date: ");
							String newdueDate = scanner.nextLine();
							at.setdueDate(newdueDate);
							System.out.println("Due date successfully updated!");
							break;
						case 6:
							System.out.print("Enter the new note: ");
							String newnote = scanner.nextLine();
							at.setnote(newnote);
							System.out.println("Note successfully updated!");
							break;
						default:
							System.out.println("Invalid option.");
						}
					}
					if(found == false) // assignment info not found
						System.out.println("Assignment not found.");
			}	
		}
	}

} //end of Update class
