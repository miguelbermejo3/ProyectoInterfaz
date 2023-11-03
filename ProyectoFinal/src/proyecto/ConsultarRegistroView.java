package proyecto;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import proyecto.modelo.Registro;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultarRegistroView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;

	public ConsultarRegistroView(App appController) {
		super(appController);
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 58, 418, 184);
		add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel modelo = new TableModel();

		table.setModel(modelo);

		JButton btnRefrescar = new JButton("REFRESCAR");
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List<Registro> registros = appController.consultarRegistro();

				modelo.setRegistros(registros);
				modelo.fireTableDataChanged();

			}
		});
		btnRefrescar.setBounds(313, 253, 113, 23);
		add(btnRefrescar);
		// TODO Auto-generated constructor stub

	}
}