package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Model.HeapSort;
import Model.SortedArrayPriorityQueue;
import Object.Course;
import Object.Student;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class PopupAttendance extends JFrame {

	private JPanel contentPane;
	private JButton btnAddStudent;
	private JTable table;

	private static String [] columnNames = new String [] {
            "MSV", "Họ và tên", "Số buổi vắng", "Điểm danh"};
	
	private Object data = new Object [][] {
		
	};
	/**
	 * Launch the application.
	 */
	public PopupAttendance(SortedArrayPriorityQueue student) {
		initPopupAttendance(student);
	}
	/**
	 * Create the frame.
	 */
	public void initPopupAttendance(SortedArrayPriorityQueue student) {
		setTitle("T\u1EA1o l\u1EDBp h\u1ECDc");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1017, 646);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0110I\u1EC2M DANH SINH VI\u00CAN");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(393, 21, 268, 22);
		contentPane.add(lblNewLabel);
		
		btnAddStudent = new JButton("Th\u00EAm");
		btnAddStudent.setBackground(new Color(47, 79, 79));
		btnAddStudent.setForeground(Color.WHITE);
		btnAddStudent.setBounds(820, 527, 171, 31);
		contentPane.add(btnAddStudent);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 82, 981, 418);
		contentPane.add(scrollPane);
		
		table = new JTable();
		Object [][] students = new Object[student.size()][9];
		for (int i = 0; i < student.size(); i++) {
			Student s = (Student)student.get(i).getValue();
			students[i][0] = s.getCode();
			students[i][1] = s.getName();
			students[i][2] = s.getRoom().get(0).getNumOfAbsences();
        }
		
		
		DefaultTableModel model = new DefaultTableModel(students, columnNames);
        table = new JTable(model) {

            private static final long serialVersionUID = 1L;
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    default:
                        return Boolean.class;
                }
            }
        };

		table.setModel(new DefaultTableModel(students,columnNames));
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
	    table.getColumnModel().getColumn(1).setPreferredWidth(300);
	    table.getColumnModel().getColumn(2).setPreferredWidth(50);
	    table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.setRowHeight(30);
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		scrollPane.setPreferredSize(new Dimension (480, 300));
	}
	
	 public void addCheckStudentListener(ListSelectionListener listener) {
		  
		 table.getSelectionModel().addListSelectionListener(listener);
	 }
	 
	 public String[] getValueStudent() {
		 String code_stu = "";
		 Boolean checked = false;
		 int row = table.getSelectedRow();
        if (row >= 0) {
        	checked = Boolean.valueOf(table.getModel().getValueAt(row, 3).toString());
        	if(checked) {
        		code_stu = String.valueOf(table.getModel().getValueAt(row, 0).toString());
        	}
        }
        return new String[] {String.valueOf(checked), code_stu } ;
	 }
}
