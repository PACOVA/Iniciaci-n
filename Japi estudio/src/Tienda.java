import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 365);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a nuestra TIENDA ");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(214, 26, 272, 22);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 110, 58);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/Logo-J.png")));
		lblNewLabel_1.setBounds(33, 11, 46, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Regalos creativos, personalizados y con arte");
		lblNewLabel_2.setBounds(224, 59, 240, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res="La solicitud ha sido solicitada";
		            JOptionPane.showMessageDialog(null, res, "Se enviara un correo con la informacion",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/DISEÑO GRAfico.jpg")));
		btnNewButton.setBounds(10, 113, 100, 66);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res="La solicitud ha sido solicitada";
	            JOptionPane.showMessageDialog(null, res, "Se enviara un correo con la informacion",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/marketing digital.jpg")));
		btnNewButton_1.setBounds(144, 113, 100, 66);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res="La solicitud ha sido solicitada";
	            JOptionPane.showMessageDialog(null, res, "Se enviara un correo con la informacion",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/diseño web.jpg")));
		btnNewButton_2.setBounds(289, 113, 100, 58);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res="La solicitud ha sido solicitada";
	            JOptionPane.showMessageDialog(null, res, "Se enviara un correo con la informacion",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/startup.jpg")));
		btnNewButton_3.setBounds(437, 113, 100, 66);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Diseño grafico ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 209, 110, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Marketing digital");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(144, 209, 110, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Diseño web");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(301, 209, 100, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Startup");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(450, 210, 73, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("(50 -100€)\r");
		lblNewLabel_7.setToolTipText("\n ");
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 247, 83, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("(40-150€)");
		lblNewLabel_8.setBounds(173, 247, 71, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("(50-150€)");
		lblNewLabel_9.setBounds(310, 247, 57, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("(100-200€)");
		lblNewLabel_10.setBounds(456, 247, 67, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnVolver = new JButton("");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario cambiarVentana = new Usuario();
	    		cambiarVentana.setVisible(true);
			}
		});
		btnVolver.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/volver.jpg")));
		btnVolver.setBounds(538, 0, 46, 44);
		contentPane.add(btnVolver);
	}

}
