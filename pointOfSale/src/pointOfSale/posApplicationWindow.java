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
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.image.*;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
	
	//----------------------------------------------------All cost Functions Start
	
	public void AllCost(){
	
	double sum = 0;
	
	for (int i=0; i < table.getRowCount(); i++) {
		
		sum = sum + Double.parseDouble((String) table.getValueAt(i, 1).toString());
		
	}
		jtxtTotal.setText(Double.toString(sum));
	
		double cTotal = Double.parseDouble(jtxtTotal.getText());
		
		String iSubTotal = String.format("£ %.2f", cTotal);
		jtxtTotal.setText(iSubTotal);

	}
	//-----------------------------------------------------Functions End
	
	//----------------------------------------------------Change Functions Start
	
	public void Change(){
		
		double sum = 0;
		double cash = Double.parseDouble(jtxtTotal.getSelectedText());
		
		for (int i=0; i < table.getRowCount(); i++) {
			
			sum = sum + Double.parseDouble((String) table.getValueAt(i, 1).toString());
			
		}
		
		double cChange= (cash-sum);
		String ChangeGiven = String.format("£ %.2f", cChange);
		jtxtChange.setText(ChangeGiven);
	
	}	
		
	//-----------------------------------------------------Functions End

	
	

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
		
		JButton jbtnPay = new JButton("Pay");
		jbtnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnPay.setBounds(10, 10, 133, 78);
		panel_3_2.add(jbtnPay);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnExit.setBounds(153, 128, 204, 49);
		panel_3_2.add(jbtnExit);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtTotal.setText(null);
				jtxtPayed.setText(null);
				jtxtChange.setText(null);	
				
				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnReset.setBounds(10, 98, 133, 79);
		panel_3_2.add(jbtnReset);
		
		JButton jbtnRemove = new JButton("Remove Item");
		jbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int RemoveItem = table.getSelectedRow();
				if (RemoveItem >= 0) {
					model.removeRow(RemoveItem);
				}
				AllCost();
			}
		});
		jbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnRemove.setBounds(153, 10, 204, 49);
		panel_3_2.add(jbtnRemove);
		
		JButton jbtnPrint = new JButton("Print");
		jbtnPrint.setFont(new Font("Tahoma", Font.BOLD, 25));
		jbtnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Receipt");
				MessageFormat footer = new MessageFormat("Page(0, number, integer");
				
				try {
					table.print(JTable.PrintMode.NORMAL,header,footer);
				}
				
				catch(java.awt.print.PrinterException ex) {
					System.err.format("No Printer found", ex.getMessage());
				}
			
			}
		});
		jbtnPrint.setBounds(153, 69, 204, 49);
		panel_3_2.add(jbtnPrint);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2_1.setBounds(49, 26, 288, 187);
		panel.add(panel_3_2_1);
		
		jtxtPayed = new JTextField();
		jtxtPayed.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtPayed.setColumns(10);
		jtxtPayed.setBounds(114, 73, 164, 47);
		panel_3_2_1.add(jtxtPayed);
		
		JLabel lblNewLabel_2 = new JLabel("Payed");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 72, 119, 48);
		panel_3_2_1.add(lblNewLabel_2);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(114, 130, 164, 47);
		panel_3_2_1.add(jtxtChange);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChange.setBounds(10, 130, 119, 47);
		panel_3_2_1.add(lblChange);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Visa Card"}));
		comboBox.setBounds(114, 16, 164, 47);
		panel_3_2_1.add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("Method");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(10, 15, 119, 48);
		panel_3_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 707, 753);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jbtnApple = new JButton("");
		jbtnApple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 0.40;
				DefaultTableModel model =(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Apple",PriceOfItem});
				AllCost();
				
			}
		});
		jbtnApple.setIcon(new ImageIcon("img/Apple-icon.png"));
		jbtnApple.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnApple.setBounds(10, 10, 156, 141);
		panel_2.add(jbtnApple);
		
		JButton btnNewButton_6_3 = new JButton("");
		btnNewButton_6_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3.setBounds(10, 161, 156, 141);
		panel_2.add(btnNewButton_6_3);
		
		JButton btnNewButton_6_3_1 = new JButton("");
		btnNewButton_6_3_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_6_3_1.setBounds(10, 312, 156, 141);
		panel_2.add(btnNewButton_6_3_1);
		
		JButton jbtnBanana = new JButton("");
		jbtnBanana.setIcon(new ImageIcon("img/bananas-icon.png"));
		jbtnBanana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 0.47;
				DefaultTableModel model =(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Banana",PriceOfItem});
				AllCost();
				
			}
		});
		jbtnBanana.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnBanana.setBounds(176, 10, 156, 141);
		panel_2.add(jbtnBanana);
		
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
		btnNewButton_6_3_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		JButton jbtnNum7 = new JButton("7");
		jbtnNum7.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum7.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum7.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			}
		});
		jbtnNum7.setBounds(10, 25, 95, 93);
		panel_1_1.add(jbtnNum7);
		
		JButton jbtnNum8 = new JButton("8");
		jbtnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum8.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum8.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			}
		});
		jbtnNum8.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum8.setBounds(115, 25, 95, 93);
		panel_1_1.add(jbtnNum8);
		
		JButton jbtnNum9 = new JButton("9");
		jbtnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum9.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum9.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			
			}
		});
		jbtnNum9.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum9.setBounds(220, 25, 95, 93);
		panel_1_1.add(jbtnNum9);
		
		JButton jbtnNum4 = new JButton("4");
		jbtnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum4.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum4.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			
			}
		});
		jbtnNum4.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum4.setBounds(10, 142, 95, 93);
		panel_1_1.add(jbtnNum4);
		
		JButton jbtnNum5 = new JButton("5");
		jbtnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum5.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum5.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			
			}
		});
		jbtnNum5.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum5.setBounds(115, 142, 95, 93);
		panel_1_1.add(jbtnNum5);
		
		JButton jbtnNum6 = new JButton("6");
		jbtnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum6.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum6.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			
			}
		});
		jbtnNum6.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum6.setBounds(220, 142, 95, 93);
		panel_1_1.add(jbtnNum6);
		
		JButton jbtnNum1 = new JButton("1");
		jbtnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum1.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum1.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			
			}
		});
		jbtnNum1.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum1.setBounds(10, 258, 95, 93);
		panel_1_1.add(jbtnNum1);
		
		JButton jbtnNum2 = new JButton("2");
		jbtnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum2.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum2.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			
			}
		});
		jbtnNum2.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum2.setBounds(115, 258, 95, 93);
		panel_1_1.add(jbtnNum2);
		
		JButton jbtnNum3 = new JButton("3");
		jbtnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum3.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum3.getText();
					jtxtPayed.setText(Enternumber);
				}
				
		
			}
		});
		jbtnNum3.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum3.setBounds(220, 258, 95, 93);
		panel_1_1.add(jbtnNum3);
		
		JButton jbtnNum0 = new JButton("0");
		jbtnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtPayed.getText();
				
				if (Enternumber == "") {
					
					jtxtPayed.setText(jbtnNum0.getText());
				}
				else {
					Enternumber = jtxtPayed.getText()+ jbtnNum0.getText();
					jtxtPayed.setText(Enternumber);
				}
				
			
			}
		});
		jbtnNum0.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnNum0.setBounds(10, 374, 95, 93);
		panel_1_1.add(jbtnNum0);
		
		JButton jbtnPoint = new JButton(".");
		jbtnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (! jtxtPayed.getText().contains(".")) {
					
					jtxtPayed.setText(jtxtPayed.getText() + jbtnPoint.getText());
				}
				
			}
		});
		jbtnPoint.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnPoint.setBounds(115, 374, 95, 93);
		panel_1_1.add(jbtnPoint);
		
		JButton jbtnClear = new JButton("C");
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtPayed.setText(null);
				jtxtChange.setText(null);
			}
		});
		jbtnClear.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnClear.setBounds(220, 374, 95, 93);
		panel_1_1.add(jbtnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(727, 10, 414, 431);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
		jtxtTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtTotal.setBounds(806, 451, 272, 47);
		frame.getContentPane().add(jtxtTotal);
		jtxtTotal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(727, 451, 69, 48);
		frame.getContentPane().add(lblNewLabel);
	}
}
