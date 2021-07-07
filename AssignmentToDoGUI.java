package ProjectDataStructure;

import java.util.LinkedList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class AssignmentToDoGUI extends JFrame { //Assignment To Do GUI class

	private JPanel contentPane;
	
	static LinkedList<AssignmentToDo> assignmentLinkedList = new LinkedList <AssignmentToDo>();
	JLabel lblNewLabel = new JLabel("ASSIGNMENT TO DO");
	
	JLabel lblICourseID = new JLabel("Course ID");
	JTextField txtICourseID = new JTextField();
	JLabel lblName = new JLabel("Subject Name");
	JTextField txtName = new JTextField();
	JLabel lblstatus = new JLabel("Status");
	JTextField txtstatus = new JTextField();
	JLabel lblGivenDate = new JLabel("Given Date");
	JTextField txtGivenDate = new JTextField();
	JLabel lblDue = new JLabel("Due Date");
	JTextField txtDue = new JTextField();
	JLabel lblNote = new JLabel("Note");
	JTextPane Note = new JTextPane();
	JTextArea assignmentListTextArea = new JTextArea();
	
	JButton btnAdd = new JButton("ADD");
	private final JButton btnExit = new JButton("EXIT");
	private int edit;
	private final JButton btnReturn = new JButton("RETURN");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignmentToDoGUI frame = new AssignmentToDoGUI();
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
	public AssignmentToDoGUI() { //constructor with no argument

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 709);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(128, 0, 0)));
		panel.setBounds(0, 0, 985, 672);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(139, 0, 0)));
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setBounds(198, 10, 615, 84);
		panel.add(panel_1);
		
		
		lblNewLabel.setFont(new Font("Rage Italic", Font.PLAIN, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-61, 20, 709, 64);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(128, 0, 0)));
		panel_2.setBackground(new Color(250, 235, 215));
		panel_2.setBounds(59, 118, 371, 431);
		panel.add(panel_2);
		
		lblName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblName.setBounds(10, 77, 127, 39);
		panel_2.add(lblName);
		txtName.setBackground(new Color(230, 230, 250));
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		txtName.setBounds(147, 77, 196, 39);
		panel_2.add(txtName);
		txtName.setColumns(10);
		
		lblstatus.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblstatus.setBounds(10, 135, 127, 39);
		panel_2.add(lblstatus);
		txtstatus.setBackground(new Color(230, 230, 250));
		txtstatus.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			
		txtstatus.setColumns(10);
		txtstatus.setBounds(147, 135, 196, 39);
		panel_2.add(txtstatus);
		
		lblGivenDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblGivenDate.setBounds(10, 206, 127, 39);
		panel_2.add(lblGivenDate);
		txtGivenDate.setBackground(new Color(230, 230, 250));
		txtGivenDate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		txtGivenDate.setColumns(10);
		txtGivenDate.setBounds(147, 206, 196, 39);
		panel_2.add(txtGivenDate);
		
		lblICourseID.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblICourseID.setBounds(10, 11, 127, 39);
		panel_2.add(lblICourseID);
		txtICourseID.setBackground(new Color(230, 230, 250));
		txtICourseID.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		txtICourseID.setColumns(10);
		txtICourseID.setBounds(147, 10, 196, 39);
		panel_2.add(txtICourseID);
		
		lblDue.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblDue.setBounds(10, 285, 127, 39);
		panel_2.add(lblDue);
		txtDue.setBackground(new Color(230, 230, 250));
		txtDue.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		txtDue.setColumns(10);
		txtDue.setBounds(147, 290, 196, 44);
		panel_2.add(txtDue);
		
		lblNote.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNote.setBounds(10, 377, 127, 26);
		panel_2.add(lblNote);
		Note.setBackground(new Color(230, 230, 250));
		Note.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		Note.setBounds(147, 371, 193, 32);
		panel_2.add(Note);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(128, 0, 0)));
		panel_1_1.setBackground(new Color(250, 235, 215));
		panel_1_1.setBounds(10, 578, 965, 84);
		panel.add(panel_1_1);
		btnAdd.setBackground(new Color(250, 240, 230));
		
		panel_1_1.add(btnAdd);
		setFont(new Font("Snap ITC", Font.PLAIN, 30));
		btnAdd.setFont(new Font("STXinwei", Font.PLAIN, 20));
		btnAdd.setBounds(32, 10, 194, 64);
		btnExit.setBackground(new Color(250, 240, 230));

		panel_1_1.add(btnExit);
		btnExit.setFont(new Font("STXinwei", Font.PLAIN, 20));
		btnExit.setBounds(729, 10, 194, 64);
		btnReturn.setBackground(new Color(250, 240, 230));
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPageGUI mp = new MainPageGUI();
				mp.setModalExclusionType(null);
				mp.setVisible(true);
			}
		});
		btnReturn.setFont(new Font("STXinwei", Font.PLAIN, 20));
		btnReturn.setBounds(393, 10, 194, 64);
		
		panel_1_1.add(btnReturn);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(128, 0, 0)));
		panel_2_1.setBackground(new Color(250, 235, 215));
		panel_2_1.setBounds(461, 104, 507, 460);
		panel.add(panel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 487, 440);
		panel_2_1.add(scrollPane);
		assignmentListTextArea.setBackground(new Color(250, 240, 230));
		
		assignmentListTextArea.setEditable(false);
		scrollPane.setViewportView(assignmentListTextArea);
		
		
		btnAdd.addActionListener(event -> addAssignment());
		btnExit.addActionListener(event -> exitApplication());
	
	}
	
	private boolean iscourseIDInLinkedList(String txtcourseID) {
		boolean isID = false;
		
		for(AssignmentToDo ass : assignmentLinkedList) 
		{	
			if(ass.getcourseID().compareToIgnoreCase(txtcourseID)==0) 
			{
				isID =true;
			}

		}
		return isID;
	}
	
	// add assignment in linked list method
	private void addAssignment() {
		
			if( iscourseIDInLinkedList(txtICourseID.getText()) == true) {
				JOptionPane.showMessageDialog(null, "Error: This subject already existed!");
			}
			else {
			
				assignmentLinkedList.add(new AssignmentToDo(txtICourseID.getText(),txtName.getText(),txtGivenDate.getText(),txtstatus.getText(),txtDue.getText(),Note.getText()));
				assignmentListTextArea.setText("");
				assignmentListTextArea.setText("Assignment Information"
											+ "\nCourse ID\t: " + txtICourseID.getText()
											+ "\nSubject Name\t: " + txtName.getText()
											+ "\nStatus\t: " + txtstatus.getText()
											+ "\nGiven Date\t: " + txtGivenDate.getText()
											+ "\nDue Date\t: " + txtDue.getText()
											+ "\nNote\t: " + Note.getText());
				JOptionPane.showMessageDialog (null, "Assignment successful added!!");	
				
				txtICourseID.setText("");
				txtName.setText("");
				txtstatus.setText("");
				txtGivenDate.setText("");
				txtDue .setText("");
				Note.setText("");

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
} //end of Assignment To Do GUI class
