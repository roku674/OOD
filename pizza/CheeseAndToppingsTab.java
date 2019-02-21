package pizza;
//@@ -0,0 +1,514 @@
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;

public class CheeseAndToppingsTab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheeseAndToppingsTab frame = new CheeseAndToppingsTab();
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
	public CheeseAndToppingsTab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 65, 0, 23, 100, 0, 0, 51, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPickYourToppings = new JLabel("Choose Your Toppings");
		lblPickYourToppings.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPickYourToppings.setForeground(Color.DARK_GRAY);
		GridBagConstraints gbc_lblPickYourToppings = new GridBagConstraints();
		gbc_lblPickYourToppings.gridwidth = 2;
		gbc_lblPickYourToppings.insets = new Insets(0, 0, 35, 5);
		gbc_lblPickYourToppings.gridx = 4;
		gbc_lblPickYourToppings.gridy = 0;
		contentPane.add(lblPickYourToppings, gbc_lblPickYourToppings);
		
		JLabel lblCheeses = new JLabel("Cheeses");
		lblCheeses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheeses.setForeground(Color.YELLOW);
		GridBagConstraints gbc_lblCheeses = new GridBagConstraints();
		gbc_lblCheeses.gridwidth = 2;
		gbc_lblCheeses.insets = new Insets(0, 0, 5, 5);
		gbc_lblCheeses.gridx = 1;
		gbc_lblCheeses.gridy = 2;
		contentPane.add(lblCheeses, gbc_lblCheeses);
		
		JLabel lblMeats = new JLabel("Meats");
		lblMeats.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMeats.setForeground(Color.RED);
		GridBagConstraints gbc_lblMeats = new GridBagConstraints();
		gbc_lblMeats.gridwidth = 2;
		gbc_lblMeats.insets = new Insets(0, 0, 5, 5);
		gbc_lblMeats.gridx = 4;
		gbc_lblMeats.gridy = 2;
		contentPane.add(lblMeats, gbc_lblMeats);
		
		JLabel lblVeggies = new JLabel("Veggies");
		lblVeggies.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVeggies.setForeground(Color.GREEN);
		GridBagConstraints gbc_lblVeggies = new GridBagConstraints();
		gbc_lblVeggies.gridwidth = 2;
		gbc_lblVeggies.insets = new Insets(0, 0, 5, 5);
		gbc_lblVeggies.gridx = 7;
		gbc_lblVeggies.gridy = 2;
		contentPane.add(lblVeggies, gbc_lblVeggies);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 3;
		contentPane.add(separator, gbc_separator);
		
		JLabel lblNewLabel = new JLabel("Standard Cheese");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 4;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox cboxStdCheese = new JComboBox();
		lblNewLabel.setLabelFor(cboxStdCheese);
		cboxStdCheese.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxStdCheese = new GridBagConstraints();
		gbc_cboxStdCheese.insets = new Insets(0, 0, 5, 5);
		gbc_cboxStdCheese.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxStdCheese.gridx = 2;
		gbc_cboxStdCheese.gridy = 4;
		contentPane.add(cboxStdCheese, gbc_cboxStdCheese);
		
		JLabel lblPepperoni = new JLabel("Pepperoni");
		GridBagConstraints gbc_lblPepperoni = new GridBagConstraints();
		gbc_lblPepperoni.insets = new Insets(0, 0, 5, 5);
		gbc_lblPepperoni.gridx = 4;
		gbc_lblPepperoni.gridy = 4;
		contentPane.add(lblPepperoni, gbc_lblPepperoni);
		
		JComboBox cboxPepperoni = new JComboBox();
		lblPepperoni.setLabelFor(cboxPepperoni);
		cboxPepperoni.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxPepperoni = new GridBagConstraints();
		gbc_cboxPepperoni.insets = new Insets(0, 0, 5, 5);
		gbc_cboxPepperoni.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxPepperoni.gridx = 5;
		gbc_cboxPepperoni.gridy = 4;
		contentPane.add(cboxPepperoni, gbc_cboxPepperoni);
		
		JLabel lblBlackOlives = new JLabel("Black Olives");
		GridBagConstraints gbc_lblBlackOlives = new GridBagConstraints();
		gbc_lblBlackOlives.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlackOlives.gridx = 7;
		gbc_lblBlackOlives.gridy = 4;
		contentPane.add(lblBlackOlives, gbc_lblBlackOlives);
		
		JComboBox cboxBlackOlives = new JComboBox();
		lblBlackOlives.setLabelFor(cboxBlackOlives);
		cboxBlackOlives.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxBlackOlives = new GridBagConstraints();
		gbc_cboxBlackOlives.insets = new Insets(0, 0, 5, 5);
		gbc_cboxBlackOlives.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxBlackOlives.gridx = 8;
		gbc_cboxBlackOlives.gridy = 4;
		contentPane.add(cboxBlackOlives, gbc_cboxBlackOlives);
		
		JLabel lblCheddarCheese = new JLabel("Cheddar");
		GridBagConstraints gbc_lblCheddarCheese = new GridBagConstraints();
		gbc_lblCheddarCheese.insets = new Insets(0, 0, 5, 5);
		gbc_lblCheddarCheese.gridx = 1;
		gbc_lblCheddarCheese.gridy = 5;
		contentPane.add(lblCheddarCheese, gbc_lblCheddarCheese);
		
		JComboBox cboxCheddar = new JComboBox();
		lblCheddarCheese.setLabelFor(cboxCheddar);
		cboxCheddar.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxCheddar = new GridBagConstraints();
		gbc_cboxCheddar.insets = new Insets(0, 0, 5, 5);
		gbc_cboxCheddar.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxCheddar.gridx = 2;
		gbc_cboxCheddar.gridy = 5;
		contentPane.add(cboxCheddar, gbc_cboxCheddar);
		
		JLabel lblItalianSausage = new JLabel("Italian Sausage");
		GridBagConstraints gbc_lblItalianSausage = new GridBagConstraints();
		gbc_lblItalianSausage.insets = new Insets(0, 0, 5, 5);
		gbc_lblItalianSausage.gridx = 4;
		gbc_lblItalianSausage.gridy = 5;
		contentPane.add(lblItalianSausage, gbc_lblItalianSausage);
		
		JComboBox cboxSausage = new JComboBox();
		lblItalianSausage.setLabelFor(cboxSausage);
		cboxSausage.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxSausage = new GridBagConstraints();
		gbc_cboxSausage.insets = new Insets(0, 0, 5, 5);
		gbc_cboxSausage.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxSausage.gridx = 5;
		gbc_cboxSausage.gridy = 5;
		contentPane.add(cboxSausage, gbc_cboxSausage);
		
		JLabel lblGreenOlives = new JLabel("Green Olives");
		GridBagConstraints gbc_lblGreenOlives = new GridBagConstraints();
		gbc_lblGreenOlives.insets = new Insets(0, 0, 5, 5);
		gbc_lblGreenOlives.gridx = 7;
		gbc_lblGreenOlives.gridy = 5;
		contentPane.add(lblGreenOlives, gbc_lblGreenOlives);
		
		JComboBox cboxGreenOlives = new JComboBox();
		lblGreenOlives.setLabelFor(cboxGreenOlives);
		cboxGreenOlives.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxGreenOlives = new GridBagConstraints();
		gbc_cboxGreenOlives.insets = new Insets(0, 0, 5, 5);
		gbc_cboxGreenOlives.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxGreenOlives.gridx = 8;
		gbc_cboxGreenOlives.gridy = 5;
		contentPane.add(cboxGreenOlives, gbc_cboxGreenOlives);
		
		JLabel lblFeta = new JLabel("Feta");
		GridBagConstraints gbc_lblFeta = new GridBagConstraints();
		gbc_lblFeta.insets = new Insets(0, 0, 5, 5);
		gbc_lblFeta.gridx = 1;
		gbc_lblFeta.gridy = 6;
		contentPane.add(lblFeta, gbc_lblFeta);
		
		JComboBox cboxFeta = new JComboBox();
		lblFeta.setLabelFor(cboxFeta);
		cboxFeta.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxFeta = new GridBagConstraints();
		gbc_cboxFeta.insets = new Insets(0, 0, 5, 5);
		gbc_cboxFeta.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxFeta.gridx = 2;
		gbc_cboxFeta.gridy = 6;
		contentPane.add(cboxFeta, gbc_cboxFeta);
		
		JLabel lblBeef = new JLabel("Beef");
		GridBagConstraints gbc_lblBeef = new GridBagConstraints();
		gbc_lblBeef.insets = new Insets(0, 0, 5, 5);
		gbc_lblBeef.gridx = 4;
		gbc_lblBeef.gridy = 6;
		contentPane.add(lblBeef, gbc_lblBeef);
		
		JComboBox cboxBeef = new JComboBox();
		lblBeef.setLabelFor(cboxBeef);
		cboxBeef.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxBeef = new GridBagConstraints();
		gbc_cboxBeef.insets = new Insets(0, 0, 5, 5);
		gbc_cboxBeef.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxBeef.gridx = 5;
		gbc_cboxBeef.gridy = 6;
		contentPane.add(cboxBeef, gbc_cboxBeef);
		
		JLabel lblBananaPeppers = new JLabel("Banana Peppers");
		GridBagConstraints gbc_lblBananaPeppers = new GridBagConstraints();
		gbc_lblBananaPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_lblBananaPeppers.gridx = 7;
		gbc_lblBananaPeppers.gridy = 6;
		contentPane.add(lblBananaPeppers, gbc_lblBananaPeppers);
		
		JComboBox cboxBananaPeppers = new JComboBox();
		lblBananaPeppers.setLabelFor(cboxBananaPeppers);
		cboxBananaPeppers.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxBananaPeppers = new GridBagConstraints();
		gbc_cboxBananaPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_cboxBananaPeppers.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxBananaPeppers.gridx = 8;
		gbc_cboxBananaPeppers.gridy = 6;
		contentPane.add(cboxBananaPeppers, gbc_cboxBananaPeppers);
		
		JLabel lblShreddedPamesean = new JLabel("Shredded Pamesean");
		GridBagConstraints gbc_lblShreddedPamesean = new GridBagConstraints();
		gbc_lblShreddedPamesean.insets = new Insets(0, 0, 5, 5);
		gbc_lblShreddedPamesean.gridx = 1;
		gbc_lblShreddedPamesean.gridy = 7;
		contentPane.add(lblShreddedPamesean, gbc_lblShreddedPamesean);
		
		JComboBox cboxParmesean = new JComboBox();
		lblShreddedPamesean.setLabelFor(cboxParmesean);
		cboxParmesean.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxParmesean = new GridBagConstraints();
		gbc_cboxParmesean.insets = new Insets(0, 0, 5, 5);
		gbc_cboxParmesean.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxParmesean.gridx = 2;
		gbc_cboxParmesean.gridy = 7;
		contentPane.add(cboxParmesean, gbc_cboxParmesean);
		
		JLabel lblPhillySteak = new JLabel("Philly Steak");
		GridBagConstraints gbc_lblPhillySteak = new GridBagConstraints();
		gbc_lblPhillySteak.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhillySteak.gridx = 4;
		gbc_lblPhillySteak.gridy = 7;
		contentPane.add(lblPhillySteak, gbc_lblPhillySteak);
		
		JComboBox cboxPhillySteak = new JComboBox();
		lblPhillySteak.setLabelFor(cboxPhillySteak);
		cboxPhillySteak.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxPhillySteak = new GridBagConstraints();
		gbc_cboxPhillySteak.insets = new Insets(0, 0, 5, 5);
		gbc_cboxPhillySteak.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxPhillySteak.gridx = 5;
		gbc_cboxPhillySteak.gridy = 7;
		contentPane.add(cboxPhillySteak, gbc_cboxPhillySteak);
		
		JLabel lblJalapenoPeppers = new JLabel("Jalapeno Peppers");
		GridBagConstraints gbc_lblJalapenoPeppers = new GridBagConstraints();
		gbc_lblJalapenoPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_lblJalapenoPeppers.gridx = 7;
		gbc_lblJalapenoPeppers.gridy = 7;
		contentPane.add(lblJalapenoPeppers, gbc_lblJalapenoPeppers);
		
		JComboBox cboxJalapenoPeppers = new JComboBox();
		lblJalapenoPeppers.setLabelFor(cboxJalapenoPeppers);
		cboxJalapenoPeppers.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxJalapenoPeppers = new GridBagConstraints();
		gbc_cboxJalapenoPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_cboxJalapenoPeppers.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxJalapenoPeppers.gridx = 8;
		gbc_cboxJalapenoPeppers.gridy = 7;
		contentPane.add(cboxJalapenoPeppers, gbc_cboxJalapenoPeppers);
		
		JLabel lblShreddedProvolone = new JLabel("Shredded Provolone");
		GridBagConstraints gbc_lblShreddedProvolone = new GridBagConstraints();
		gbc_lblShreddedProvolone.insets = new Insets(0, 0, 5, 5);
		gbc_lblShreddedProvolone.gridx = 1;
		gbc_lblShreddedProvolone.gridy = 8;
		contentPane.add(lblShreddedProvolone, gbc_lblShreddedProvolone);
		
		JComboBox cboxProvolone = new JComboBox();
		lblShreddedProvolone.setLabelFor(cboxProvolone);
		cboxProvolone.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxProvolone = new GridBagConstraints();
		gbc_cboxProvolone.insets = new Insets(0, 0, 5, 5);
		gbc_cboxProvolone.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxProvolone.gridx = 2;
		gbc_cboxProvolone.gridy = 8;
		contentPane.add(cboxProvolone, gbc_cboxProvolone);
		
		JLabel lblHam = new JLabel("Ham");
		GridBagConstraints gbc_lblHam = new GridBagConstraints();
		gbc_lblHam.insets = new Insets(0, 0, 5, 5);
		gbc_lblHam.gridx = 4;
		gbc_lblHam.gridy = 8;
		contentPane.add(lblHam, gbc_lblHam);
		
		JComboBox cboxHam = new JComboBox();
		lblHam.setLabelFor(cboxHam);
		cboxHam.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxHam = new GridBagConstraints();
		gbc_cboxHam.insets = new Insets(0, 0, 5, 5);
		gbc_cboxHam.gridx = 5;
		gbc_cboxHam.gridy = 8;
		contentPane.add(cboxHam, gbc_cboxHam);
		
		JLabel lblRoastedRedPeppers = new JLabel("Roasted Red Peppers");
		GridBagConstraints gbc_lblRoastedRedPeppers = new GridBagConstraints();
		gbc_lblRoastedRedPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_lblRoastedRedPeppers.gridx = 7;
		gbc_lblRoastedRedPeppers.gridy = 8;
		contentPane.add(lblRoastedRedPeppers, gbc_lblRoastedRedPeppers);
		
		JComboBox cboxRoastedRedPeppers = new JComboBox();
		lblRoastedRedPeppers.setLabelFor(cboxRoastedRedPeppers);
		cboxRoastedRedPeppers.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxRoastedRedPeppers = new GridBagConstraints();
		gbc_cboxRoastedRedPeppers.insets = new Insets(0, 0, 5, 5);
		gbc_cboxRoastedRedPeppers.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxRoastedRedPeppers.gridx = 8;
		gbc_cboxRoastedRedPeppers.gridy = 8;
		contentPane.add(cboxRoastedRedPeppers, gbc_cboxRoastedRedPeppers);
		
		JLabel lblBacon = new JLabel("Bacon");
		GridBagConstraints gbc_lblBacon = new GridBagConstraints();
		gbc_lblBacon.insets = new Insets(0, 0, 5, 5);
		gbc_lblBacon.gridx = 4;
		gbc_lblBacon.gridy = 9;
		contentPane.add(lblBacon, gbc_lblBacon);
		
		JComboBox cboxBacon = new JComboBox();
		lblBacon.setLabelFor(cboxBacon);
		cboxBacon.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxBacon = new GridBagConstraints();
		gbc_cboxBacon.insets = new Insets(0, 0, 5, 5);
		gbc_cboxBacon.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxBacon.gridx = 5;
		gbc_cboxBacon.gridy = 9;
		contentPane.add(cboxBacon, gbc_cboxBacon);
		
		JLabel lblMushroom = new JLabel("Mushrooms");
		GridBagConstraints gbc_lblMushroom = new GridBagConstraints();
		gbc_lblMushroom.insets = new Insets(0, 0, 5, 5);
		gbc_lblMushroom.gridx = 7;
		gbc_lblMushroom.gridy = 9;
		contentPane.add(lblMushroom, gbc_lblMushroom);
		
		JComboBox cboxMushrooms = new JComboBox();
		lblMushroom.setLabelFor(cboxMushrooms);
		cboxMushrooms.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxMushrooms = new GridBagConstraints();
		gbc_cboxMushrooms.insets = new Insets(0, 0, 5, 5);
		gbc_cboxMushrooms.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxMushrooms.gridx = 8;
		gbc_cboxMushrooms.gridy = 9;
		contentPane.add(cboxMushrooms, gbc_cboxMushrooms);
		
		JLabel lblSalami = new JLabel("Salami");
		GridBagConstraints gbc_lblSalami = new GridBagConstraints();
		gbc_lblSalami.insets = new Insets(0, 0, 5, 5);
		gbc_lblSalami.gridx = 4;
		gbc_lblSalami.gridy = 10;
		contentPane.add(lblSalami, gbc_lblSalami);
		
		JComboBox cboxSalami = new JComboBox();
		lblSalami.setLabelFor(cboxSalami);
		cboxSalami.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxSalami = new GridBagConstraints();
		gbc_cboxSalami.insets = new Insets(0, 0, 5, 5);
		gbc_cboxSalami.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxSalami.gridx = 5;
		gbc_cboxSalami.gridy = 10;
		contentPane.add(cboxSalami, gbc_cboxSalami);
		
		JLabel lblPineapple = new JLabel("Pineapple");
		GridBagConstraints gbc_lblPineapple = new GridBagConstraints();
		gbc_lblPineapple.insets = new Insets(0, 0, 5, 5);
		gbc_lblPineapple.gridx = 7;
		gbc_lblPineapple.gridy = 10;
		contentPane.add(lblPineapple, gbc_lblPineapple);
		
		JComboBox cboxPineapple = new JComboBox();
		lblPineapple.setLabelFor(cboxPineapple);
		cboxPineapple.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxPineapple = new GridBagConstraints();
		gbc_cboxPineapple.insets = new Insets(0, 0, 5, 5);
		gbc_cboxPineapple.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxPineapple.gridx = 8;
		gbc_cboxPineapple.gridy = 10;
		contentPane.add(cboxPineapple, gbc_cboxPineapple);
		
		JLabel lblChicken = new JLabel("Chicken");
		GridBagConstraints gbc_lblChicken = new GridBagConstraints();
		gbc_lblChicken.insets = new Insets(0, 0, 5, 5);
		gbc_lblChicken.gridx = 4;
		gbc_lblChicken.gridy = 11;
		contentPane.add(lblChicken, gbc_lblChicken);
		
		JComboBox cboxChicken = new JComboBox();
		lblChicken.setLabelFor(cboxChicken);
		cboxChicken.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxChicken = new GridBagConstraints();
		gbc_cboxChicken.insets = new Insets(0, 0, 5, 5);
		gbc_cboxChicken.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxChicken.gridx = 5;
		gbc_cboxChicken.gridy = 11;
		contentPane.add(cboxChicken, gbc_cboxChicken);
		
		JLabel lblOnions = new JLabel("Onions");
		GridBagConstraints gbc_lblOnions = new GridBagConstraints();
		gbc_lblOnions.insets = new Insets(0, 0, 5, 5);
		gbc_lblOnions.gridx = 7;
		gbc_lblOnions.gridy = 11;
		contentPane.add(lblOnions, gbc_lblOnions);
		
		JComboBox cboxOnions = new JComboBox();
		lblOnions.setLabelFor(cboxOnions);
		cboxOnions.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxOnions = new GridBagConstraints();
		gbc_cboxOnions.insets = new Insets(0, 0, 5, 5);
		gbc_cboxOnions.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxOnions.gridx = 8;
		gbc_cboxOnions.gridy = 11;
		contentPane.add(cboxOnions, gbc_cboxOnions);
		
		JLabel lblAnchovies = new JLabel("Anchovies");
		GridBagConstraints gbc_lblAnchovies = new GridBagConstraints();
		gbc_lblAnchovies.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnchovies.gridx = 4;
		gbc_lblAnchovies.gridy = 12;
		contentPane.add(lblAnchovies, gbc_lblAnchovies);
		
		JComboBox cboxAnchovies = new JComboBox();
		lblAnchovies.setLabelFor(cboxAnchovies);
		cboxAnchovies.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxAnchovies = new GridBagConstraints();
		gbc_cboxAnchovies.insets = new Insets(0, 0, 5, 5);
		gbc_cboxAnchovies.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxAnchovies.gridx = 5;
		gbc_cboxAnchovies.gridy = 12;
		contentPane.add(cboxAnchovies, gbc_cboxAnchovies);
		
		JLabel lblSpinach = new JLabel("Spinach");
		GridBagConstraints gbc_lblSpinach = new GridBagConstraints();
		gbc_lblSpinach.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpinach.gridx = 7;
		gbc_lblSpinach.gridy = 12;
		contentPane.add(lblSpinach, gbc_lblSpinach);
		
		JComboBox cboxSpinach = new JComboBox();
		lblSpinach.setLabelFor(cboxSpinach);
		cboxSpinach.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxSpinach = new GridBagConstraints();
		gbc_cboxSpinach.insets = new Insets(0, 0, 5, 5);
		gbc_cboxSpinach.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxSpinach.gridx = 8;
		gbc_cboxSpinach.gridy = 12;
		contentPane.add(cboxSpinach, gbc_cboxSpinach);
		
		JLabel lblDicedTomatoes = new JLabel("Diced Tomatoes");
		GridBagConstraints gbc_lblDicedTomatoes = new GridBagConstraints();
		gbc_lblDicedTomatoes.insets = new Insets(0, 0, 5, 5);
		gbc_lblDicedTomatoes.gridx = 7;
		gbc_lblDicedTomatoes.gridy = 13;
		contentPane.add(lblDicedTomatoes, gbc_lblDicedTomatoes);
		
		JComboBox cboxDicedTomatoes = new JComboBox();
		lblDicedTomatoes.setLabelFor(cboxDicedTomatoes);
		cboxDicedTomatoes.setModel(new DefaultComboBoxModel(new String[] {"Select Quantity...", "None", "Light", "Regular", "Extra"}));
		GridBagConstraints gbc_cboxDicedTomatoes = new GridBagConstraints();
		gbc_cboxDicedTomatoes.insets = new Insets(0, 0, 5, 5);
		gbc_cboxDicedTomatoes.gridx = 8;
		gbc_cboxDicedTomatoes.gridy = 13;
		contentPane.add(cboxDicedTomatoes, gbc_cboxDicedTomatoes);
		
		JButton btnPreviousPg4 = new JButton("Previous Page");
		GridBagConstraints gbc_btnPreviousPg4 = new GridBagConstraints();
		gbc_btnPreviousPg4.insets = new Insets(0, 0, 5, 0);
		gbc_btnPreviousPg4.gridx = 1;
		gbc_btnPreviousPg4.gridy = 20;
		contentPane.add(btnPreviousPg4, gbc_btnPreviousPg4);
		
		JButton btnNextPg4 = new JButton("Next Page");
		GridBagConstraints gbc_btnNextPg4 = new GridBagConstraints();
		gbc_btnNextPg4.insets = new Insets(0, 0, 0, -25);
		gbc_btnNextPg4.gridx = 8;
		gbc_btnNextPg4.gridy = 20;
		contentPane.add(btnNextPg4, gbc_btnNextPg4);
	}

}