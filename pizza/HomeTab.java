package pizza;
//@@ -0,0 +1,91 @@
import java.awt.BorderLayout;
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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class HomeTab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeTab frame = new HomeTab();
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
	public HomeTab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{186, 121, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{23, 231, 25, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblWelcomeTo = new JLabel("Welcome to _____ Pizza Place ");
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblWelcomeTo = new GridBagConstraints();
		gbc_lblWelcomeTo.gridwidth = 3;
		gbc_lblWelcomeTo.anchor = GridBagConstraints.NORTH;
		gbc_lblWelcomeTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblWelcomeTo.gridx = 1;
		gbc_lblWelcomeTo.gridy = 0;
		contentPane.add(lblWelcomeTo, gbc_lblWelcomeTo);
		
		JButton btnCarryOut = new JButton("Carry Out");
		GridBagConstraints gbc_btnCarryOut = new GridBagConstraints();
		gbc_btnCarryOut.insets = new Insets(0, 0, 5, 5);
		gbc_btnCarryOut.gridx = 1;
		gbc_btnCarryOut.gridy = 1;
		contentPane.add(btnCarryOut, gbc_btnCarryOut);
		
		JButton btnDelivery = new JButton("Delivery");
		GridBagConstraints gbc_btnDelivery = new GridBagConstraints();
		gbc_btnDelivery.insets = new Insets(0, 0, 5, 5);
		gbc_btnDelivery.gridx = 3;
		gbc_btnDelivery.gridy = 1;
		contentPane.add(btnDelivery, gbc_btnDelivery);
		
		JButton btnLetsGetStarted = new JButton("Let's get started!");
		btnLetsGetStarted.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnLetsGetStarted = new GridBagConstraints();
		gbc_btnLetsGetStarted.gridwidth = 3;
		gbc_btnLetsGetStarted.insets = new Insets(50, -20, 5, 5);
		gbc_btnLetsGetStarted.anchor = GridBagConstraints.NORTH;
		gbc_btnLetsGetStarted.gridx = 1;
		gbc_btnLetsGetStarted.gridy = 2;
		contentPane.add(btnLetsGetStarted, gbc_btnLetsGetStarted);
	}

}