package ProjectDataStructure;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class MainPageGUI extends JFrame { //Main Page GUI class

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPageGUI frame = new MainPageGUI();
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
	public MainPageGUI() { //constructor with no argument
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1016, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel.setBounds(0, 0, 1002, 673);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAssignmentListWeekly = new JButton("Assignment List Weekly");
		btnAssignmentListWeekly.setBackground(new Color(250, 240, 230));
		btnAssignmentListWeekly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListAssignmentGUI assignmentGui = new ListAssignmentGUI();
				assignmentGui.setModalExclusionType(null);
				assignmentGui.setVisible(true);
			}
		});
		btnAssignmentListWeekly.setFont(new Font("Stencil", Font.BOLD, 22));
		btnAssignmentListWeekly.setBounds(419, 598, 327, 65);
		panel.add(btnAssignmentListWeekly);
		
		JButton btnAssignmenttodo = new JButton("Assignment-To-Do");
		btnAssignmenttodo.setBackground(new Color(250, 240, 230));
		btnAssignmenttodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AssignmentToDoGUI assGui = new AssignmentToDoGUI();
				assGui.setModalExclusionType(null);
				assGui.setVisible(true);
			}
		});
		btnAssignmenttodo.setFont(new Font("Stencil", Font.BOLD, 22));
		btnAssignmenttodo.setBounds(419, 523, 327, 65);
		panel.add(btnAssignmenttodo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 5));
		panel_1.setBounds(44, 10, 927, 89);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ASSIGNMENT LIST WEEKLY");
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(250, 240, 230));
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\assignment.jpg"));
		lblNewLabel_1.setBounds(10, 10, 982, 653);
		panel.add(lblNewLabel_1);
	}
} //end of Main Page GUI class
