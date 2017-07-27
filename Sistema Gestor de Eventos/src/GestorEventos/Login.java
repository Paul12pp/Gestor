package GestorEventos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomUser;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 512);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de Cuenta:");
		lblTipoDeCuenta.setBounds(15, 60, 150, 20);
		contentPane.add(lblTipoDeCuenta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Portero"}));
		comboBox.setBounds(180, 54, 179, 26);
		contentPane.add(comboBox);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setBounds(15, 114, 150, 20);
		contentPane.add(lblNombreDeUsuario);
		
		tfNomUser = new JTextField();
		tfNomUser.setBounds(180, 108, 179, 26);
		contentPane.add(tfNomUser);
		tfNomUser.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(15, 161, 113, 20);
		contentPane.add(lblContrasea);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("dd");
			}
		});
		btnSignIn.setBounds(120, 265, 125, 39);
		contentPane.add(btnSignIn);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "New user", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(15, 331, 344, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setBounds(106, 48, 123, 37);
		panel.add(btnSignUp);
		
		JLabel lblForgotPassword = new JLabel("Forgot password?");
		lblForgotPassword.setBounds(15, 216, 150, 20);
		contentPane.add(lblForgotPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 155, 179, 26);
		contentPane.add(passwordField);
	}
}
