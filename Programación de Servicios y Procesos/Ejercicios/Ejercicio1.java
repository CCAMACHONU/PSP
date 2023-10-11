


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Ejercicio1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
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
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Bloc de notas");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ccamacho1774\\Downloads\\MicrosoftTeams-image (2).png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = "C:\\WINDOWS\\System32\\notepad.exe";
				LanzadorProcesos lp = new LanzadorProcesos();
					lp.ejecutar(ruta);
				System.out.println("Finalizado");
			}
		});
		btnNewButton.setBounds(41, 57, 84, 114);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcaludora");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta = "C:\\WINDOWS\\System32\\calc.exe";
				LanzadorProcesos lp = new LanzadorProcesos();

					lp.ejecutar(ruta);

			
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ccamacho1774\\Downloads\\MicrosoftTeams-image.png"));
		btnNewButton_1.setBounds(262, 57, 84, 114);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}
