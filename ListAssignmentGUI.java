package ProjectDataStructure;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class ListAssignmentGUI extends JFrame { //List Assignment GUI class

	private JPanel contentPane;

	JLabel lblNewLabel = new JLabel("LIST ASSIGNMENT\r\n");
	
	JLabel lblCourseID = new JLabel("Course ID");
	JTextField txtICourseID = new JTextField();
	JLabel lblName = new JLabel("Subject Name");
	JTextField txtName = new JTextField();
	JLabel lblstatus = new JLabel("Status");
	JTextField txtstatus = new JTextField();
	JLabel lblGivenDate = new JLabel("Given Date");
	JTextField txtGivenDate = new JTextField();
	JLabel lblDueDate = new JLabel("Due Date");
	JTextField txtDueDate = new JTextField();
	JLabel lblNote = new JLabel("Note");
	JTextPane noteTextPane = new JTextPane();
	JTextArea assignmentListTextArea = new JTextArea();
	
	private final JButton btnExit = new JButton("EXIT");
	private JTextField SearchCourseID;
	private int edit;
	private final JButton btnReturn = new JButton("RETURN");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListAssignmentGUI frame = new ListAssignmentGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListAssignmentGUI() { //constructor with no argument
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel.setBounds(0, 0, 985, 672);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(139, 0, 0)));
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setBounds(195, 10, 578, 84);
		panel.add(panel_1);
		
		
		lblNewLabel.setFont(new Font("Rage Italic", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 599, 64);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_2.setBackground(new Color(250, 235, 215));
		panel_2.setBounds(56, 104, 329, 253);
		panel.add(panel_2);
		
		lblName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblName.setBounds(10, 47, 127, 26);
		panel_2.add(lblName);
		txtName.setBackground(new Color(230, 230, 250));
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		
		txtName.setBounds(147, 47, 150, 26);
		panel_2.add(txtName);
		txtName.setColumns(10);
		
		lblstatus.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblstatus.setBounds(10, 84, 127, 26);
		panel_2.add(lblstatus);
		txtstatus.setBackground(new Color(230, 230, 250));
		txtstatus.setFont(new Font("Times New Roman", Font.PLAIN, 10));
			
		txtstatus.setColumns(10);
		txtstatus.setBounds(147, 84, 150, 26);
		panel_2.add(txtstatus);
		
		lblGivenDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblGivenDate.setBounds(10, 121, 127, 26);
		panel_2.add(lblGivenDate);
		txtGivenDate.setBackground(new Color(230, 230, 250));
		txtGivenDate.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		
		txtGivenDate.setColumns(10);
		txtGivenDate.setBounds(147, 121, 150, 26);
		panel_2.add(txtGivenDate);
		
		lblCourseID.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblCourseID.setBounds(10, 11, 127, 26);
		panel_2.add(lblCourseID);
		txtICourseID.setBackground(new Color(230, 230, 250));
		txtICourseID.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		
		txtICourseID.setColumns(10);
		txtICourseID.setBounds(147, 10, 150, 26);
		panel_2.add(txtICourseID);
		
		lblDueDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblDueDate.setBounds(10, 158, 127, 26);
		panel_2.add(lblDueDate);
		txtDueDate.setBackground(new Color(230, 230, 250));
		txtDueDate.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		
		txtDueDate.setColumns(10);
		txtDueDate.setBounds(147, 158, 150, 26);
		panel_2.add(txtDueDate);
		
		lblNote.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNote.setBounds(10, 194, 127, 26);
		panel_2.add(lblNote);
		noteTextPane.setForeground(new Color(0, 0, 0));
		noteTextPane.setBackground(new Color(230, 230, 250));
		noteTextPane.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		
		noteTextPane.setBounds(147, 195, 150, 26);
		panel_2.add(noteTextPane);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_1_1.setBackground(new Color(250, 235, 215));
		panel_1_1.setBounds(10, 578, 965, 84);
		panel.add(panel_1_1);
		btnExit.setBackground(new Color(250, 240, 230));

		panel_1_1.add(btnExit);
		btnExit.setFont(new Font("STXinwei", Font.PLAIN, 20));
		btnExit.setBounds(796, 10, 159, 64);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBackground(new Color(250, 240, 230));
		btnUpdate.setFont(new Font("STXinwei", Font.PLAIN, 20));
		btnUpdate.setBounds(25, 11, 159, 63);
		panel_1_1.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBackground(new Color(250, 240, 230));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setFont(new Font("STXinwei", Font.PLAIN, 20));
		btnDelete.setBounds(424, 11, 159, 63);
		panel_1_1.add(btnDelete);
		
		JButton displayAllButton = new JButton("DISPLAY");
		displayAllButton.setBackground(new Color(250, 240, 230));
		displayAllButton.setFont(new Font("STXinwei", Font.PLAIN, 20));
		displayAllButton.setBounds(223, 11, 159, 63);
		panel_1_1.add(displayAllButton);
		btnReturn.setBackground(new Color(250, 240, 230));
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPageGUI mp = new MainPageGUI();
				mp.setModalExclusionType(null);
				mp.setVisible(true);
			}
		});
		btnReturn.setFont(new Font("STXinwei", Font.PLAIN, 20));
		btnReturn.setBounds(613, 10, 159, 64);
		
		panel_1_1.add(btnReturn);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_2_1.setBackground(new Color(250, 235, 215));
		panel_2_1.setBounds(419, 104, 510, 460);
		panel.add(panel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 487, 440);
		panel_2_1.add(scrollPane);
		assignmentListTextArea.setBackground(new Color(250, 240, 230));

		assignmentListTextArea.setEditable(false);
		scrollPane.setViewportView(assignmentListTextArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_3.setBackground(new Color(250, 235, 215));
		panel_3.setBounds(56, 385, 329, 163);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		SearchCourseID = new JTextField();
		SearchCourseID.setBackground(new Color(230, 230, 250));
		SearchCourseID.setBounds(78, 50, 171, 36);
		panel_3.add(SearchCourseID);
		SearchCourseID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Search Course ID");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(78, 10, 421, 45);
		panel_3.add(lblNewLabel_1);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setBackground(new Color(250, 240, 230));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setFont(new Font("STXinwei", Font.PLAIN, 24));
		btnSearch.setBounds(99, 96, 132, 36);
		panel_3.add(btnSearch);
		
		displayAllButton.addActionListener (event -> displayAll ());
		btnExit.addActionListener(event -> exitApplication());
		btnUpdate.addActionListener(event -> updateAssignment());
		btnDelete.addActionListener(event -> deleteAssignment());
		btnSearch.addActionListener(event -> searchAssignment());
		
	}
	
	private boolean iscourseIDInLinkedList(String txtcourseID) {
		boolean isID = false;
		
		for(AssignmentToDo ass : AssignmentToDoGUI.assignmentLinkedList) {	
			if(ass.getcourseID().compareToIgnoreCase(txtcourseID)==0) {
				isID =true;
			}

		}
		return isID;
	}
	
	// Display all assignment method
	private void displayAll (){
		assignmentListTextArea.setText ("");
		
		if (AssignmentToDoGUI.assignmentLinkedList.size() == 0){
	         JOptionPane.showMessageDialog (null, "Error: Database is empty!");
	      }
		
		for (AssignmentToDo ass : AssignmentToDoGUI.assignmentLinkedList) {
				assignmentListTextArea.append( ass + "\n\n");   
		}
	        
	}
	
	// Update assignment's information in linked list method
	private void updateAssignment() {
		 if (AssignmentToDoGUI.assignmentLinkedList.size() == 0){
	         JOptionPane.showMessageDialog ( ListAssignmentGUI.this,
	                                        "Error: Database is empty!");
	      }
	      else if (iscourseIDInLinkedList (SearchCourseID.getText()) == false) {
	         JOptionPane.showMessageDialog (ListAssignmentGUI.this,
	                                        "Error: Course ID is not in the database!");
	      }
	      else{
	         for (int s = 0; s < AssignmentToDoGUI.assignmentLinkedList.size(); s++) {
	            String ID = AssignmentToDoGUI.assignmentLinkedList.get (s).getcourseID ();

	            if (ID.compareToIgnoreCase (SearchCourseID.getText()) == 0){
	            	edit = s;
	            	s = AssignmentToDoGUI.assignmentLinkedList.size();
	            }
	         }
	         if(edit >= 0) {
	        	 
	        	 AssignmentToDoGUI.assignmentLinkedList.get(edit).setcourseID(txtICourseID.getText());
	        	 AssignmentToDoGUI.assignmentLinkedList.get(edit).setsubjectName(txtName.getText());
	        	 AssignmentToDoGUI.assignmentLinkedList.get(edit).setstatus(txtstatus.getText());
	        	 AssignmentToDoGUI.assignmentLinkedList.get(edit).setgivenDate(txtGivenDate.getText());
	        	 AssignmentToDoGUI.assignmentLinkedList.get(edit).setdueDate(txtDueDate.getText());
	        	 AssignmentToDoGUI.assignmentLinkedList.get(edit).setnote(noteTextPane.getText());
	         
	        	 JOptionPane.showMessageDialog (null, "Assignment's information successful updated!");	
	        	 
	        	 assignmentListTextArea.setText("Assignment Information"
							+ "\nCourse ID\t\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getcourseID()
							+ "\nSubject Name\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getsubjectName()
							+ "\nStatus\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getstatus()
							+ "\nGiven Date\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getgivenDate()
							+ "\nDue Date\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getdueDate()
							+ "\nNote\t\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getnote());
	        	 
	        	 txtICourseID.setText("");
	        	 txtName.setText("");
	        	 txtstatus.setText("");
	        	 txtGivenDate.setText("");
	        	 txtDueDate.setText("");
	        	 noteTextPane.setText("");
	        	 SearchCourseID.setText("");
	         }
	      }
	}

	// Delete assignment in linked list method
	private void deleteAssignment() {
		 if (AssignmentToDoGUI.assignmentLinkedList.size() == 0){
	         JOptionPane.showMessageDialog (null, "Error: Database is empty!");
	      }
	      else if ( iscourseIDInLinkedList (SearchCourseID.getText()) == false){
	         JOptionPane.showMessageDialog (null, "Error: Course ID is not in the database.");
	      }
	      else{
	         for (int s = 0; s < AssignmentToDoGUI.assignmentLinkedList.size(); s++) {
	            String ID = AssignmentToDoGUI.assignmentLinkedList.get (s).getcourseID ();

	            if (ID.compareToIgnoreCase (SearchCourseID.getText()) == 0){
	            	AssignmentToDoGUI.assignmentLinkedList.remove (s);
	            }
	         }
	         
	         txtICourseID.setText("");
        	 txtName.setText("");
        	 txtstatus.setText("");
        	 txtGivenDate.setText("");
        	 txtDueDate.setText("");
        	 noteTextPane.setText("");
	         SearchCourseID.setText("");
	         assignmentListTextArea.setText("");
	         JOptionPane.showMessageDialog (null, "Assignment's information successful deleted!");		
	      }
	   }
	
	// Search assignment in linked list method
	private void searchAssignment() {
		 if (iscourseIDInLinkedList (SearchCourseID.getText()) == false)
	         JOptionPane.showMessageDialog ( ListAssignmentGUI.this,
	                                        "Error: Database is empty!");
	    
		 else if(iscourseIDInLinkedList (SearchCourseID.getText()) == true){
			 for (int s = 0; s < AssignmentToDoGUI.assignmentLinkedList.size(); s++){
				 String ID = AssignmentToDoGUI.assignmentLinkedList.get(s).getcourseID();

	            if (ID.compareToIgnoreCase (SearchCourseID.getText()) == 0){
	            	edit = s;
	            	s = AssignmentToDoGUI.assignmentLinkedList.size();
	            	}
	            }
			 
			 if (edit >=0) {
				 txtICourseID.setText( AssignmentToDoGUI.assignmentLinkedList.get(edit).getcourseID());
	        	 txtName.setText( AssignmentToDoGUI.assignmentLinkedList.get(edit).getsubjectName());
	        	 txtstatus.setText( AssignmentToDoGUI.assignmentLinkedList.get(edit).getstatus());
	        	 txtGivenDate.setText( AssignmentToDoGUI.assignmentLinkedList.get(edit).getgivenDate());
	        	 txtDueDate.setText( AssignmentToDoGUI.assignmentLinkedList.get(edit).getdueDate());
	        	 noteTextPane.setText( AssignmentToDoGUI.assignmentLinkedList.get(edit).getnote());
	        	 
				 assignmentListTextArea.setText("Assignment Information"
							+ "\nCourse ID\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getcourseID()
							+ "\nSubject Name\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getsubjectName()
							+ "\nStatus\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getstatus()
							+ "\nGiven Date\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getgivenDate()
							+ "\nDue Date\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getdueDate()
							+ "\nNote\t: " + AssignmentToDoGUI.assignmentLinkedList.get(edit).getnote());
				 }
			 }
		 }

	// Exit application method
	private void exitApplication() {
		JFrame frame = new JFrame();
		if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!", "Assignment System", 
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
			System.exit(0);
		}
	}
	
} //end of List Assignment GUI class

