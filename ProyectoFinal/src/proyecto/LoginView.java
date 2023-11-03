package proyecto;

import javax.swing.JTextField;

import proyecto.modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldCorreo;
	private JPasswordField passwordField;

	public LoginView(App appController) {
		super(appController);
		setLayout(null);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(118, 46, 85, 19);
		add(lblEmail);

		textFieldCorreo = new JTextField();
		textFieldCorreo.setBounds(118, 76, 174, 20);
		add(textFieldCorreo);
		textFieldCorreo.setColumns(10);

		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setBounds(118, 107, 70, 14);
		add(lblPassword);

		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Usuario u = new Usuario();
				u.setCorreo(textFieldCorreo.getText());
				char[] pass = passwordField.getPassword();
				String password = new String(pass);
				u.setContraseña(password);

				appController.loginUsuario(u);

				textFieldCorreo.setText("");
				passwordField.setText("");

			}
		});
		btnEntrar.setBounds(216, 173, 89, 23);
		add(btnEntrar);

		JButton btnSolicitarAcceso = new JButton("SOLICITAR ACCESO");
		btnSolicitarAcceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irAPantallaAltaUser();
			}
		});
		btnSolicitarAcceso.setBounds(184, 254, 131, 23);
		add(btnSolicitarAcceso);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(328, 254, 89, 23);
		add(btnSalir);

		passwordField = new JPasswordField();
		passwordField.setText("");
		passwordField.setBounds(118, 132, 174, 20);
		add(passwordField);

	}
}