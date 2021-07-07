package ProjectDataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class Main { //Main class

	static Scanner in = new Scanner(System.in);
	static LinkedList<AssignmentToDo> assignmentList = new LinkedList<AssignmentToDo>();
	
	public static void main(String[] args) {
		int option = 0;
		System.out.println("Welcome to Assignment Weekly List");
		while (option < 6) {
		System.out.println("Menu:"
				+ "\n1. Add"
				+ "\n2. Update"
				+ "\n3. Search"
				+ "\n4. Delete"
				+ "\n5. Display"
				+ "\n6. Exit");
		System.out.print("Option: ");
		option = in.nextInt();
		
		AssignmentToDo ass = new AssignmentToDo("Course ID","Subject Name", "Status", "Given Date", "Due Date", "Note");
		
			if(option == 1) {
				ass.addAssignment();
			}
			else if(option == 2) {
				Update.update();
			}
			else if(option == 3) {
				Searching.search();
			}
			else if(option == 4) {
				Delete.delete();
			}
			else if(option == 5) {
				Display.display();
			}
			else {
				System.out.println("Thank you for your listing!");
				System.exit(0);
			}
		}
	}
} //end of Main class
