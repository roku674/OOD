//@@ -0,0 +1,387 @@
package pizza;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JFormattedTextField;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class CheckoutTab extends JFrame {

	private JPanel contentPane;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZipCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckoutTab frame = new CheckoutTab();
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
	public CheckoutTab() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 208, 0, 144, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPickYourToppings = new JLabel("Checkout");
		lblPickYourToppings.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPickYourToppings.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblPickYourToppings = new GridBagConstraints();
		gbc_lblPickYourToppings.insets = new Insets(0, 0, 25, 5);
		gbc_lblPickYourToppings.gridx = 6;
		gbc_lblPickYourToppings.gridy = 0;
		contentPane.add(lblPickYourToppings, gbc_lblPickYourToppings );
		
		JLabel lblFoodBeverage = new JLabel("Food & Beverage Total");
		GridBagConstraints gbc_lblFoodBeverage = new GridBagConstraints();
		gbc_lblFoodBeverage.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoodBeverage.gridx = 4;
		gbc_lblFoodBeverage.gridy = 1;
		contentPane.add(lblFoodBeverage, gbc_lblFoodBeverage);
		
		JFormattedTextField txtPreTaxTotal = new JFormattedTextField();
		lblFoodBeverage.setLabelFor(txtPreTaxTotal);
		GridBagConstraints gbc_txtPreTaxTotal = new GridBagConstraints();
		gbc_txtPreTaxTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtPreTaxTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPreTaxTotal.gridx = 6;
		gbc_txtPreTaxTotal.gridy = 1;
		contentPane.add(txtPreTaxTotal, gbc_txtPreTaxTotal);
		
		JLabel lblTaxes = new JLabel("Taxes");
		GridBagConstraints gbc_lblTaxes = new GridBagConstraints();
		gbc_lblTaxes.insets = new Insets(0, 0, 5, 5);
		gbc_lblTaxes.gridx = 4;
		gbc_lblTaxes.gridy = 2;
		contentPane.add(lblTaxes, gbc_lblTaxes);
		
		JFormattedTextField txtTaxField = new JFormattedTextField();
		lblTaxes.setLabelFor(txtTaxField);
		GridBagConstraints gbc_txtTaxField = new GridBagConstraints();
		gbc_txtTaxField.anchor = GridBagConstraints.NORTH;
		gbc_txtTaxField.insets = new Insets(0, 0, 5, 5);
		gbc_txtTaxField.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTaxField.gridx = 6;
		gbc_txtTaxField.gridy = 2;
		contentPane.add(txtTaxField, gbc_txtTaxField);
		
		JLabel lblYourTotal = new JLabel("Your Total");
		GridBagConstraints gbc_lblYourTotal = new GridBagConstraints();
		gbc_lblYourTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblYourTotal.gridx = 4;
		gbc_lblYourTotal.gridy = 3;
		contentPane.add(lblYourTotal, gbc_lblYourTotal);
		
		JFormattedTextField txtYourTotal = new JFormattedTextField();
		lblYourTotal.setLabelFor(txtYourTotal);
		GridBagConstraints gbc_txtYourTotal = new GridBagConstraints();
		gbc_txtYourTotal.anchor = GridBagConstraints.NORTH;
		gbc_txtYourTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtYourTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtYourTotal.gridx = 6;
		gbc_txtYourTotal.gridy = 3;
		contentPane.add(txtYourTotal, gbc_txtYourTotal);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 4;
		gbc_separator.gridy = 4;
		contentPane.add(separator, gbc_separator);
		
		JLabel lblFirstAndLast = new JLabel("First Name");
		GridBagConstraints gbc_lblFirstAndLast = new GridBagConstraints();
		gbc_lblFirstAndLast.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstAndLast.gridx = 4;
		gbc_lblFirstAndLast.gridy = 6;
		contentPane.add(lblFirstAndLast, gbc_lblFirstAndLast);
		
		JFormattedTextField txtFirstName = new JFormattedTextField();
		lblFirstAndLast.setLabelFor(txtFirstName);
		GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
		gbc_txtFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_txtFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFirstName.gridx = 6;
		gbc_txtFirstName.gridy = 6;
		contentPane.add(txtFirstName, gbc_txtFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 4;
		gbc_lblLastName.gridy = 7;
		contentPane.add(lblLastName, gbc_lblLastName);
		
		JFormattedTextField txtLastName = new JFormattedTextField();
		lblLastName.setLabelFor(txtLastName);
		GridBagConstraints gbc_txtLastName = new GridBagConstraints();
		gbc_txtLastName.insets = new Insets(0, 0, 5, 5);
		gbc_txtLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLastName.gridx = 6;
		gbc_txtLastName.gridy = 7;
		contentPane.add(txtLastName, gbc_txtLastName);
		
		JLabel lblEmailAddress = new JLabel("Email address\r\n(optional)");
		GridBagConstraints gbc_lblEmailAddress = new GridBagConstraints();
		gbc_lblEmailAddress.fill = GridBagConstraints.VERTICAL;
		gbc_lblEmailAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailAddress.gridx = 4;
		gbc_lblEmailAddress.gridy = 8;
		contentPane.add(lblEmailAddress, gbc_lblEmailAddress);
		
		JFormattedTextField txtEmail = new JFormattedTextField();
		lblEmailAddress.setLabelFor(txtEmail);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.gridx = 6;
		gbc_txtEmail.gridy = 8;
		contentPane.add(txtEmail, gbc_txtEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		GridBagConstraints gbc_lblPhoneNumber = new GridBagConstraints();
		gbc_lblPhoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneNumber.gridx = 4;
		gbc_lblPhoneNumber.gridy = 9;
		contentPane.add(lblPhoneNumber, gbc_lblPhoneNumber);
		
		JFormattedTextField txtPhoneNumber = new JFormattedTextField();
		lblPhoneNumber.setLabelFor(txtPhoneNumber);
		GridBagConstraints gbc_txtPhoneNumber = new GridBagConstraints();
		gbc_txtPhoneNumber.insets = new Insets(0, 0, 5, 5);
		gbc_txtPhoneNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPhoneNumber.gridx = 6;
		gbc_txtPhoneNumber.gridy = 9;
		contentPane.add(txtPhoneNumber, gbc_txtPhoneNumber);
		
		JLabel lblPayAtStore = new JLabel("Pay at Store");
		GridBagConstraints gbc_lblPayAtStore = new GridBagConstraints();
		gbc_lblPayAtStore.insets = new Insets(0, 0, 5, 5);
		gbc_lblPayAtStore.gridx = 4;
		gbc_lblPayAtStore.gridy = 10;
		contentPane.add(lblPayAtStore, gbc_lblPayAtStore);
		
		JRadioButton rbtnPayAtStore = new JRadioButton("");
		lblPayAtStore.setLabelFor(rbtnPayAtStore);
		GridBagConstraints gbc_rbtnPayAtStore = new GridBagConstraints();
		gbc_rbtnPayAtStore.anchor = GridBagConstraints.NORTH;
		gbc_rbtnPayAtStore.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnPayAtStore.gridx = 6;
		gbc_rbtnPayAtStore.gridy = 10;
		contentPane.add(rbtnPayAtStore, gbc_rbtnPayAtStore);
		
		JLabel lblPayOnline = new JLabel("Pay Online");
		GridBagConstraints gbc_lblPayOnline = new GridBagConstraints();
		gbc_lblPayOnline.insets = new Insets(0, 0, 5, 5);
		gbc_lblPayOnline.gridx = 4;
		gbc_lblPayOnline.gridy = 11;
		contentPane.add(lblPayOnline, gbc_lblPayOnline);
		
		JRadioButton rbtnPayOnline = new JRadioButton("");
		lblPayOnline.setLabelFor(rbtnPayOnline);
		GridBagConstraints gbc_rbtnPayOnline = new GridBagConstraints();
		gbc_rbtnPayOnline.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnPayOnline.gridx = 6;
		gbc_rbtnPayOnline.gridy = 11;
		contentPane.add(rbtnPayOnline, gbc_rbtnPayOnline);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 4;
		gbc_separator_1.gridy = 12;
		contentPane.add(separator_1, gbc_separator_1);
		
		JLabel lblNewLabel = new JLabel("Name on Card");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 14;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JFormattedTextField txtNameOnCard = new JFormattedTextField();
		lblNewLabel.setLabelFor(txtNameOnCard);
		GridBagConstraints gbc_txtNameOnCard = new GridBagConstraints();
		gbc_txtNameOnCard.insets = new Insets(0, 0, 5, 5);
		gbc_txtNameOnCard.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNameOnCard.gridx = 6;
		gbc_txtNameOnCard.gridy = 14;
		contentPane.add(txtNameOnCard, gbc_txtNameOnCard);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		GridBagConstraints gbc_lblCreditCardNumber = new GridBagConstraints();
		gbc_lblCreditCardNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreditCardNumber.gridx = 4;
		gbc_lblCreditCardNumber.gridy = 15;
		contentPane.add(lblCreditCardNumber, gbc_lblCreditCardNumber);
		
		JFormattedTextField txtCreditCardNumber = new JFormattedTextField();
		lblCreditCardNumber.setLabelFor(txtCreditCardNumber);
		GridBagConstraints gbc_txtCreditCardNumber = new GridBagConstraints();
		gbc_txtCreditCardNumber.insets = new Insets(0, 0, 5, 5);
		gbc_txtCreditCardNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCreditCardNumber.gridx = 6;
		gbc_txtCreditCardNumber.gridy = 15;
		contentPane.add(txtCreditCardNumber, gbc_txtCreditCardNumber);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date");
		GridBagConstraints gbc_lblExpirationDate = new GridBagConstraints();
		gbc_lblExpirationDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblExpirationDate.gridx = 4;
		gbc_lblExpirationDate.gridy = 16;
		contentPane.add(lblExpirationDate, gbc_lblExpirationDate);
		
		JFormattedTextField txtExpirationDate = new JFormattedTextField();
		lblExpirationDate.setLabelFor(txtExpirationDate);
		GridBagConstraints gbc_txtExpirationDate = new GridBagConstraints();
		gbc_txtExpirationDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtExpirationDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtExpirationDate.gridx = 6;
		gbc_txtExpirationDate.gridy = 16;
		contentPane.add(txtExpirationDate, gbc_txtExpirationDate);
		
		JLabel lblCvvNumber = new JLabel("CVV Number");
		GridBagConstraints gbc_lblCvvNumber = new GridBagConstraints();
		gbc_lblCvvNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblCvvNumber.gridx = 4;
		gbc_lblCvvNumber.gridy = 17;
		contentPane.add(lblCvvNumber, gbc_lblCvvNumber);
		
		JFormattedTextField txtCVVNumber = new JFormattedTextField();
		lblCvvNumber.setLabelFor(txtCVVNumber);
		GridBagConstraints gbc_txtCVVNumber = new GridBagConstraints();
		gbc_txtCVVNumber.insets = new Insets(0, 0, 5, 5);
		gbc_txtCVVNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCVVNumber.gridx = 6;
		gbc_txtCVVNumber.gridy = 17;
		contentPane.add(txtCVVNumber, gbc_txtCVVNumber);
		
		JLabel lblStreet = new JLabel("Street");
		GridBagConstraints gbc_lblStreet = new GridBagConstraints();
		gbc_lblStreet.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lblStreet.insets = new Insets(0, 0, 5, 5);
		gbc_lblStreet.gridx = 4;
		gbc_lblStreet.gridy = 19;
		contentPane.add(lblStreet, gbc_lblStreet);
		
		txtStreet = new JTextField();
		lblStreet.setLabelFor(txtStreet);
		GridBagConstraints gbc_txtStreet = new GridBagConstraints();
		gbc_txtStreet.anchor = GridBagConstraints.NORTH;
		gbc_txtStreet.insets = new Insets(0, 0, 5, 5);
		gbc_txtStreet.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStreet.gridx = 6;
		gbc_txtStreet.gridy = 19;
		contentPane.add(txtStreet, gbc_txtStreet);
		txtStreet.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		GridBagConstraints gbc_lblCity = new GridBagConstraints();
		gbc_lblCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblCity.gridx = 4;
		gbc_lblCity.gridy = 20;
		contentPane.add(lblCity, gbc_lblCity);
		
		txtCity = new JTextField();
		lblCity.setLabelFor(txtCity);
		GridBagConstraints gbc_txtCity = new GridBagConstraints();
		gbc_txtCity.insets = new Insets(0, 0, 5, 5);
		gbc_txtCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCity.gridx = 6;
		gbc_txtCity.gridy = 20;
		contentPane.add(txtCity, gbc_txtCity);
		txtCity.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		GridBagConstraints gbc_lblState = new GridBagConstraints();
		gbc_lblState.insets = new Insets(0, 0, 5, 5);
		gbc_lblState.gridx = 4;
		gbc_lblState.gridy = 21;
		contentPane.add(lblState, gbc_lblState);
		
		txtState = new JTextField();
		lblState.setLabelFor(txtState);
		GridBagConstraints gbc_txtState = new GridBagConstraints();
		gbc_txtState.insets = new Insets(0, 0, 5, 5);
		gbc_txtState.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtState.gridx = 6;
		gbc_txtState.gridy = 21;
		contentPane.add(txtState, gbc_txtState);
		txtState.setColumns(10);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		GridBagConstraints gbc_lblZipCode = new GridBagConstraints();
		gbc_lblZipCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblZipCode.gridx = 4;
		gbc_lblZipCode.gridy = 22;
		contentPane.add(lblZipCode, gbc_lblZipCode);
		
		txtZipCode = new JTextField();
		lblZipCode.setLabelFor(txtZipCode);
		GridBagConstraints gbc_txtZipCode = new GridBagConstraints();
		gbc_txtZipCode.insets = new Insets(0, 0, 5, 5);
		gbc_txtZipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtZipCode.gridx = 6;
		gbc_txtZipCode.gridy = 22;
		contentPane.add(txtZipCode, gbc_txtZipCode);
		txtZipCode.setColumns(10);
		
		JLabel lblSpecialInstructions = new JLabel("Any Special Instructions");
		GridBagConstraints gbc_lblSpecialInstructions = new GridBagConstraints();
		gbc_lblSpecialInstructions.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpecialInstructions.gridx = 4;
		gbc_lblSpecialInstructions.gridy = 24;
		contentPane.add(lblSpecialInstructions, gbc_lblSpecialInstructions);
		
		JTextArea txtSpecialInstructions = new JTextArea();
		lblSpecialInstructions.setLabelFor(txtSpecialInstructions);
		GridBagConstraints gbc_txtSpecialInstructions = new GridBagConstraints();
		gbc_txtSpecialInstructions.gridheight = 2;
		gbc_txtSpecialInstructions.insets = new Insets(0, 0, 5, 5);
		gbc_txtSpecialInstructions.fill = GridBagConstraints.BOTH;
		gbc_txtSpecialInstructions.gridx = 6;
		gbc_txtSpecialInstructions.gridy = 24;
		contentPane.add(txtSpecialInstructions, gbc_txtSpecialInstructions);
		
		JButton btnPreviousPg5 = new JButton("Previous Page");
		GridBagConstraints gbc_btnPreviousPg5 = new GridBagConstraints();
		gbc_btnPreviousPg5.gridwidth = 3;
		gbc_btnPreviousPg5.insets = new Insets(0, 0, 0, 0);
		gbc_btnPreviousPg5.gridx = 3;
		gbc_btnPreviousPg5.gridy = 30;
		contentPane.add(btnPreviousPg5, gbc_btnPreviousPg5);
		
		JButton btnNextPg5 = new JButton("Next Page");
		GridBagConstraints gbc_btnNextPg5 = new GridBagConstraints();
		gbc_btnNextPg5.insets = new Insets(0, 0, 0, 15);
		gbc_btnNextPg5.anchor = GridBagConstraints.SOUTH;
		gbc_btnNextPg5.gridwidth = 3;
		gbc_btnNextPg5.gridx = 7;
		gbc_btnNextPg5.gridy = 30;
		contentPane.add(btnNextPg5, gbc_btnNextPg5);
	}

}