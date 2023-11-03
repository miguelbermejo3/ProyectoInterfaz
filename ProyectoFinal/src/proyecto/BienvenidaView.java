package proyecto;

import javax.swing.JLabel;

import proyecto.modelo.Usuario;

public class BienvenidaView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BienvenidaView(App appController, Usuario u) {
		super(appController);
		setLayout(null);

		System.out.println(u.getNombre());
		JLabel lblNewLabel = new JLabel("HOLA, " + u.getNombre());
		// lblNewLabel.setText(appController.);
		lblNewLabel.setBounds(171, 107, 233, 92);

		add(lblNewLabel);
		// TODO Auto-generated constructor stub
	}
}