import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 365);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 110, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Usuario.class.getResource("/Imagenes/Logo-J.png")));
		lblNewLabel.setBounds(33, 11, 46, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido a Japi estudio");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(198, 11, 329, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Tu imagina , nosotros diseñamos ¡¡¡¡¡ ");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(225, 55, 260, 23);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setForeground(Color.ORANGE);
		panel_1.setBounds(0, 80, 188, 246);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Proporcionamos ¡¡¡");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 11, 158, 31);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Diseño Grafico");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(30, 53, 138, 31);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Diseño web");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(30, 95, 138, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Marketing Digital");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(30, 125, 138, 23);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2 = new JLabel("Redes sociales");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 160, 120, 25);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_8 = new JLabel("Startup ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(30, 196, 83, 23);
		panel_1.add(lblNewLabel_8);
		
		JButton btnContactos = new JButton("Contactanos ¡¡¡");
		btnContactos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contactanos cambiarVentana = new Contactanos();
	    		cambiarVentana.setVisible(true);
			}
		});
		btnContactos.setBackground(Color.WHITE);
		btnContactos.setForeground(Color.ORANGE);
		btnContactos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContactos.setBounds(429, 292, 155, 23);
		contentPane.add(btnContactos);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(187, 80, 397, 28);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Mi cuenta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuenta cambiarVentana = new Cuenta();
	    		cambiarVentana.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 0, 102, 23);
		panel_2.add(btnNewButton);
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnProyectos = new JButton("Proyectos ");
		btnProyectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proyectos cambiarVentana = new Proyectos();
	    		cambiarVentana.setVisible(true);
			}
		});
		btnProyectos.setBounds(139, 0, 102, 23);
		panel_2.add(btnProyectos);
		btnProyectos.setBackground(Color.WHITE);
		btnProyectos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnProyectos.setForeground(Color.ORANGE);
		
		JButton btnTienda = new JButton("Tienda");
		btnTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tienda cambiarVentana = new Tienda();
	    		cambiarVentana.setVisible(true);
			}
		});
		btnTienda.setBounds(266, 0, 101, 23);
		panel_2.add(btnTienda);
		btnTienda.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTienda.setForeground(Color.ORANGE);
		btnTienda.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Usuario.class.getResource("/Imagenes/Captura1.PNG")));
		lblNewLabel_9.setBounds(198, 119, 101, 88);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Usuario.class.getResource("/Imagenes/Captura2.PNG")));
		lblNewLabel_10.setBounds(337, 119, 101, 88);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Usuario.class.getResource("/Imagenes/Captura3.PNG")));
		lblNewLabel_11.setBounds(467, 119, 93, 88);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Usuario.class.getResource("/Imagenes/Captura4.PNG")));
		lblNewLabel_12.setBounds(208, 218, 101, 88);
		contentPane.add(lblNewLabel_12);
	}
}
