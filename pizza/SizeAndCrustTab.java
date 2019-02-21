package pizza;
//@@ -0,0 +1,103 @@
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
//import com.jgoodies.forms.layout.Sizes;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class SizeAndCrustTab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SizeAndCrustTab frame = new SizeAndCrustTab();
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
	public SizeAndCrustTab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 5, 0, 332, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{36, 23, 106, 20, 81, 20, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSelectPizzaSize = new JLabel("Select Pizza Size and Crust Type");
		lblSelectPizzaSize.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSelectPizzaSize.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblSelectPizzaSize = new GridBagConstraints();
		gbc_lblSelectPizzaSize.gridwidth = 2;
		gbc_lblSelectPizzaSize.anchor = GridBagConstraints.NORTH;
		gbc_lblSelectPizzaSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectPizzaSize.gridx = 2;
		gbc_lblSelectPizzaSize.gridy = 1;
		contentPane.add(lblSelectPizzaSize, gbc_lblSelectPizzaSize);
		
		JComboBox cboxPizzaSize = new JComboBox();
		cboxPizzaSize.setModel(new DefaultComboBoxModel(new String[] {"Select Pizza Size.....", "Personal ", "Small", "Medium", "Large", "X-Large"}));
		GridBagConstraints gbc_cboxPizzaSize = new GridBagConstraints();
		gbc_cboxPizzaSize.anchor = GridBagConstraints.NORTH;
		gbc_cboxPizzaSize.insets = new Insets(0, 0, 5, 5);
		gbc_cboxPizzaSize.gridx = 3;
		gbc_cboxPizzaSize.gridy = 3;
		contentPane.add(cboxPizzaSize, gbc_cboxPizzaSize);
		
		JComboBox cboxCrustType = new JComboBox();
		cboxCrustType.setModel(new DefaultComboBoxModel(new String[] {"Select the Crust Type.....", "Regular", "Thin Crust", "Deep Dish"}));
		cboxCrustType.setMaximumRowCount(4);
		GridBagConstraints gbc_cboxCrustType = new GridBagConstraints();
		gbc_cboxCrustType.insets = new Insets(0, 0, 5, 5);
		gbc_cboxCrustType.anchor = GridBagConstraints.NORTH;
		gbc_cboxCrustType.gridx = 3;
		gbc_cboxCrustType.gridy = 5;
		contentPane.add(cboxCrustType, gbc_cboxCrustType);
		
		JButton btnPreviousPg2 = new JButton("Previous Page");
		GridBagConstraints gbc_btnPreviousPg2 = new GridBagConstraints();
		gbc_btnPreviousPg2.insets = new Insets(0, 0, 0, 5);
		gbc_btnPreviousPg2.gridx = 1;
		gbc_btnPreviousPg2.gridy = 9;
		contentPane.add(btnPreviousPg2, gbc_btnPreviousPg2);
		
		JButton btnNextPg2 = new JButton("Next Page");
		GridBagConstraints gbc_btnNextPg2 = new GridBagConstraints();
		gbc_btnNextPg2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNextPg2.gridwidth = 3;
		gbc_btnNextPg2.anchor = GridBagConstraints.SOUTH;
		gbc_btnNextPg2.gridx = 5;
		gbc_btnNextPg2.gridy = 9;
		contentPane.add(btnNextPg2, gbc_btnNextPg2);
	}

}