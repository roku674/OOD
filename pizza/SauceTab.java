package pizza;
//@@ -0,0 +1,166 @@
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Insets;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class SauceTab extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SauceTab frame = new SauceTab();
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
	public SauceTab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 60, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{23, 0, 24, 0, 15, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPickYourSauce = new JLabel("Pick your Sauce");
		lblPickYourSauce.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPickYourSauce.setForeground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblPickYourSauce = new GridBagConstraints();
		gbc_lblPickYourSauce.gridwidth = 8;
		gbc_lblPickYourSauce.insets = new Insets(0, 0, 5, 5);
		gbc_lblPickYourSauce.anchor = GridBagConstraints.NORTH;
		gbc_lblPickYourSauce.gridx = 0;
		gbc_lblPickYourSauce.gridy = 0;
		contentPane.add(lblPickYourSauce, gbc_lblPickYourSauce);
		
		table = new JTable();
		table.setBackground(SystemColor.control);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.VERTICAL;
		gbc_table.gridx = 3;
		gbc_table.gridy = 2;
		contentPane.add(table, gbc_table);
		
		//make this red
		JLabel lblTraditionalMarinara = new JLabel("Traditional Marinara");
		GridBagConstraints gbc_lblTraditionalMarinara = new GridBagConstraints();
		gbc_lblTraditionalMarinara.insets = new Insets(0, 0, 5, 5);
		gbc_lblTraditionalMarinara.gridx = 2;
		gbc_lblTraditionalMarinara.gridy = 3;
		contentPane.add(lblTraditionalMarinara, gbc_lblTraditionalMarinara);
		
		JComboBox comboBox = new JComboBox();
		lblTraditionalMarinara.setLabelFor(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select amount of Sauce...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 3;
		contentPane.add(comboBox, gbc_comboBox);
		
		//make white or eggshell white
		JLabel lblAlfredoSauce = new JLabel("Alfredo Sauce");
		GridBagConstraints gbc_lblAlfredoSauce = new GridBagConstraints();
		gbc_lblAlfredoSauce.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlfredoSauce.gridx = 2;
		gbc_lblAlfredoSauce.gridy = 4;
		contentPane.add(lblAlfredoSauce, gbc_lblAlfredoSauce);
		
		JComboBox cboxAlfredoSauce = new JComboBox();
		lblAlfredoSauce.setLabelFor(cboxAlfredoSauce);
		cboxAlfredoSauce.setModel(new DefaultComboBoxModel(new String[] {"Select amount of Sauce...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxAlfredoSauce = new GridBagConstraints();
		gbc_cboxAlfredoSauce.insets = new Insets(0, 0, 5, 5);
		gbc_cboxAlfredoSauce.gridx = 3;
		gbc_cboxAlfredoSauce.gridy = 4;
		contentPane.add(cboxAlfredoSauce, gbc_cboxAlfredoSauce);
		
		//make brown
		JLabel lblBbqSauce = new JLabel("BBQ Sauce");
		GridBagConstraints gbc_lblBbqSauce = new GridBagConstraints();
		gbc_lblBbqSauce.anchor = GridBagConstraints.BELOW_BASELINE;
		gbc_lblBbqSauce.insets = new Insets(0, 0, 5, 5);
		gbc_lblBbqSauce.gridx = 2;
		gbc_lblBbqSauce.gridy = 5;
		contentPane.add(lblBbqSauce, gbc_lblBbqSauce);
		
		JComboBox cboxBBQSauce = new JComboBox();
		lblBbqSauce.setLabelFor(cboxBBQSauce);
		cboxBBQSauce.setModel(new DefaultComboBoxModel(new String[] {"Select amount of Sauce...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxBBQSauce = new GridBagConstraints();
		gbc_cboxBBQSauce.insets = new Insets(0, 0, 5, 5);
		gbc_cboxBBQSauce.gridx = 3;
		gbc_cboxBBQSauce.gridy = 5;
		contentPane.add(cboxBBQSauce, gbc_cboxBBQSauce);
		
		JLabel lblNoSauce = new JLabel("No Sauce");
		GridBagConstraints gbc_lblNoSauce = new GridBagConstraints();
		gbc_lblNoSauce.insets = new Insets(0, 0, 5, 5);
		gbc_lblNoSauce.gridx = 2;
		gbc_lblNoSauce.gridy = 6;
		contentPane.add(lblNoSauce, gbc_lblNoSauce);
		
		JRadioButton rdbtnNoSauce = new JRadioButton("");
		lblNoSauce.setLabelFor(rdbtnNoSauce);
		rdbtnNoSauce.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_rdbtnNoSauce = new GridBagConstraints();
		gbc_rdbtnNoSauce.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNoSauce.gridx = 3;
		gbc_rdbtnNoSauce.gridy = 6;
		contentPane.add(rdbtnNoSauce, gbc_rdbtnNoSauce);
		
		JButton btnPreviousPg3 = new JButton("Previous Page");
		GridBagConstraints gbc_btnPreviousPg3 = new GridBagConstraints();
		gbc_btnPreviousPg3.insets = new Insets(0, 0, 0, 5);
		gbc_btnPreviousPg3.gridx = 2;
		gbc_btnPreviousPg3.gridy = 9;
		contentPane.add(btnPreviousPg3, gbc_btnPreviousPg3);
		
		JButton btnNextPg3 = new JButton("Next Page");
		GridBagConstraints gbc_btnNextPg3 = new GridBagConstraints();
		gbc_btnNextPg3.insets = new Insets(0, 0,0, 5);
		gbc_btnNextPg3.gridwidth = 3;
		gbc_btnNextPg3.gridx = 3;
		gbc_btnNextPg3.gridy = 9;
		contentPane.add(btnNextPg3, gbc_btnNextPg3);
	}
}