package pointOfSale;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class posApplicationWindow {

	private JFrame frame;
	private JTable table;
	private JTextField jtxtTotal;
	private JTextField jtxtPayed;
	private JTextField jtxtChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					posApplicationWindow window = new posApplicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public posApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(747, 516, 723, 247);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBounds(347, 26, 366, 187);
		panel.add(panel_3_2);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(10, 10, 133, 78);
		panel_3_2.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("New button");
		btnNewButton_7_1.setBounds(224, 128, 133, 49);
		panel_3_2.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton("New button");
		btnNewButton_7_2.setBounds(10, 98, 133, 79);
		panel_3_2.add(btnNewButton_7_2);
		
		JButton btnNewButton_7_3 = new JButton("New button");
		btnNewButton_7_3.setBounds(224, 10, 133, 49);
		panel_3_2.add(btnNewButton_7_3);
		
		JButton btnNewButton_7_4 = new JButton("New button");
		btnNewButton_7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7_4.setBounds(224, 69, 133, 49);
		panel_3_2.add(btnNewButton_7_4);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2_1.setBounds(24, 26, 288, 187);
		panel.add(panel_3_2_1);
		
		jtxtPayed = new JTextField();
		jtxtPayed.setColumns(10);
		jtxtPayed.setBounds(114, 27, 164, 47);
		panel_3_2_1.add(jtxtPayed);
		
		JLabel lblNewLabel_2 = new JLabel("Payed");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 27, 119, 48);
		panel_3_2_1.add(lblNewLabel_2);
		
		jtxtChange = new JTextField();
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(114, 100, 164, 47);
		panel_3_2_1.add(jtxtChange);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChange.setBounds(10, 100, 119, 47);
		panel_3_2_1.add(lblChange);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 707, 753);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6.setBounds(10, 10, 156, 141);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_6_3 = new JButton("");
		btnNewButton_6_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3.setBounds(10, 161, 156, 141);
		panel_2.add(btnNewButton_6_3);
		
		JButton btnNewButton_6_3_1 = new JButton("");
		btnNewButton_6_3_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1.setBounds(10, 312, 156, 141);
		panel_2.add(btnNewButton_6_3_1);
		
		JButton btnNewButton_6_1 = new JButton("");
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_1.setBounds(176, 10, 156, 141);
		panel_2.add(btnNewButton_6_1);
		
		JButton btnNewButton_6_3_2 = new JButton("");
		btnNewButton_6_3_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_2.setBounds(176, 161, 156, 141);
		panel_2.add(btnNewButton_6_3_2);
		
		JButton btnNewButton_6_3_1_1 = new JButton("");
		btnNewButton_6_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_1.setBounds(176, 312, 156, 141);
		panel_2.add(btnNewButton_6_3_1_1);
		
		JButton btnNewButton_6_2 = new JButton("");
		btnNewButton_6_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_2.setBounds(352, 10, 156, 141);
		panel_2.add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3_3 = new JButton("");
		btnNewButton_6_3_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_3.setBounds(352, 161, 156, 141);
		panel_2.add(btnNewButton_6_3_3);
		
		JButton btnNewButton_6_3_1_2 = new JButton("");
		btnNewButton_6_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_2.setBounds(352, 312, 156, 141);
		panel_2.add(btnNewButton_6_3_1_2);
		
		JButton btnNewButton_6_4 = new JButton("");
		btnNewButton_6_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_4.setBounds(530, 10, 156, 141);
		panel_2.add(btnNewButton_6_4);
		
		JButton btnNewButton_6_3_4 = new JButton("");
		btnNewButton_6_3_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_4.setBounds(530, 161, 156, 141);
		panel_2.add(btnNewButton_6_3_4);
		
		JButton btnNewButton_6_3_1_3 = new JButton("");
		btnNewButton_6_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_3.setBounds(530, 312, 156, 141);
		panel_2.add(btnNewButton_6_3_1_3);
		
		JButton btnNewButton_6_3_1_4 = new JButton("");
		btnNewButton_6_3_1_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_4.setBounds(10, 463, 156, 141);
		panel_2.add(btnNewButton_6_3_1_4);
		
		JButton btnNewButton_6_3_1_1_1 = new JButton("");
		btnNewButton_6_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_1_1.setBounds(176, 463, 156, 141);
		panel_2.add(btnNewButton_6_3_1_1_1);
		
		JButton btnNewButton_6_3_1_2_1 = new JButton("");
		btnNewButton_6_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_2_1.setBounds(352, 463, 156, 141);
		panel_2.add(btnNewButton_6_3_1_2_1);
		
		JButton btnNewButton_6_3_1_3_1 = new JButton("");
		btnNewButton_6_3_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_3_1.setBounds(530, 463, 156, 141);
		panel_2.add(btnNewButton_6_3_1_3_1);
		
		JButton btnNewButton_6_3_1_5 = new JButton("");
		btnNewButton_6_3_1_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_5.setBounds(10, 612, 156, 141);
		panel_2.add(btnNewButton_6_3_1_5);
		
		JButton btnNewButton_6_3_1_1_2 = new JButton("");
		btnNewButton_6_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_1_2.setBounds(176, 612, 156, 141);
		panel_2.add(btnNewButton_6_3_1_1_2);
		
		JButton btnNewButton_6_3_1_2_2 = new JButton("");
		btnNewButton_6_3_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_2_2.setBounds(352, 612, 156, 141);
		panel_2.add(btnNewButton_6_3_1_2_2);
		
		JButton btnNewButton_6_3_1_3_2 = new JButton("");
		btnNewButton_6_3_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1_3_2.setBounds(530, 612, 156, 141);
		panel_2.add(btnNewButton_6_3_1_3_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBounds(1151, 10, 319, 496);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 25, 95, 93);
		panel_1_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_1.setBounds(115, 25, 95, 93);
		panel_1_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_2.setBounds(220, 25, 95, 93);
		panel_1_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_3.setBounds(10, 142, 95, 93);
		panel_1_1.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_1_1.setBounds(115, 142, 95, 93);
		panel_1_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_2_1.setBounds(220, 142, 95, 93);
		panel_1_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_4.setBounds(10, 258, 95, 93);
		panel_1_1.add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_1_2.setBounds(115, 258, 95, 93);
		panel_1_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_2_2.setBounds(220, 258, 95, 93);
		panel_1_1.add(btnNewButton_2_2);
		
		JButton btnNewButton_5 = new JButton("0");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_5.setBounds(10, 374, 95, 93);
		panel_1_1.add(btnNewButton_5);
		
		JButton btnNewButton_1_3 = new JButton(".");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_1_3.setBounds(115, 374, 95, 93);
		panel_1_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("C");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_2_3.setBounds(220, 374, 95, 93);
		panel_1_1.add(btnNewButton_2_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(727, 10, 414, 431);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Item", "Amount"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(65);
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(727, 10, 414, 431);
		frame.getContentPane().add(panel_1);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setBounds(806, 451, 272, 47);
		frame.getContentPane().add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(727, 451, 69, 48);
		frame.getContentPane().add(lblNewLabel);
	}
}
