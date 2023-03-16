
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Loging extends JFrame {
	JButton btn_ingresar;
	private JPanel contentPane;
	private JPasswordField escribir_clave;
	private static Scanner sc;
	private static int contador;
	private static String userers  , pwd ;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loging frame = new Loging();
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
	public Loging() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 365);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Loging.class.getResource("/Imagenes/Logo-Japi.png")));
		lblNewLabel_5.setBounds(388, 32, 150, 150);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Japi Estudio");
		lblNewLabel_4.setForeground(SystemColor.text);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel_4.setBounds(398, 193, 150, 77);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Loging.class.getResource("/Imagenes/city.png")));
		lblNewLabel_3.setBounds(342, 0, 289, 499);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("Logo");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7.setBounds(85, 11, 46, 35);
		contentPane.add(lblNewLabel_7);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setBounds(85, 97, 91, 14);
		contentPane.add(usuario);
		usuario.setForeground(Color.BLACK);
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_8 = new JLabel("INICIAR SESION ");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBounds(85, 57, 161, 29);
		contentPane.add(lblNewLabel_8);
		
		escribir_clave = new JPasswordField();
		escribir_clave.setBounds(85, 211, 247, 20);
		contentPane.add(escribir_clave);
		escribir_clave.setToolTipText("Escribir la contrase\u00F1a ");
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(85, 176, 91, 14);
		contentPane.add(lblContrasea);
		lblContrasea.setForeground(Color.BLACK);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		TextField text_usuario = new TextField();
		text_usuario.setForeground(Color.BLACK);
		text_usuario.setFont(new Font("Dialog", Font.BOLD, 12));
		text_usuario.setBackground(Color.WHITE);
		text_usuario.setBounds(82, 128, 247, 22);
		contentPane.add(text_usuario);
		
		btn_ingresar = new JButton("ENTRAR");
		btn_ingresar.setBorder(null);
		btn_ingresar.setBounds(114, 268, 89, 35);
		contentPane.add(btn_ingresar);
		btn_ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int nLineas=0;
				int i=0;
				String [] usuarios =  new String [50];
				String [] admin=new String [50];
				String [] gestor = new String [50];
				String linea;

				try {
					
					sc=new Scanner (new File("usuarios.txt"));
					File f = new File("usuarios.txt");
					FileReader fr;
					fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					
						try {
							while((linea=br.readLine())!=null) {
								nLineas++;
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						usuarios = new String [nLineas];//Tamaño de array
					    while(sc.hasNextLine()) {
					    	usuarios[i++]=sc.nextLine();//Almacenamos cada linea en una posición del array
					    }
					    contador++;
					    userers=text_usuario.getText();
					    pwd=escribir_clave.getText();
					    
					  
					    Seguridad s = new Seguridad();
					    s.validarUsuario(usuarios, userers, pwd,contador);
					    
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}	
				
				
				
				for(int k=0;k<usuarios.length;k++) {
					 if (admin[k].equalsIgnoreCase(userers)&&usuarios[k+1].equals(pwd)) {
			               String Aparecer = "Bienvenido a la pantalla de administrador  "+userers;
			               boolean encontrado=true;
			                JOptionPane.showMessageDialog(null, Aparecer, "Inicio de sesion ", JOptionPane.INFORMATION_MESSAGE);
			                
			                Usuario frameUsuario = new Usuario();
			                frameUsuario.setVisible(true);
			            }	
				}
				
			}
			
		});
		btn_ingresar.setForeground(new Color(255, 255, 255));
		btn_ingresar.setBackground(new Color(30, 144, 255));
		btn_ingresar.addMouseListener(new MouseAdapter() {	
			public void mouseClicked(MouseEvent e) {

				
			}
		});
		btn_ingresar.setToolTipText("iniciar sesion ");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 11, 62, 35);
		contentPane.add(panel);
		
		JLabel lblNewLabel_6 = new JLabel("");
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(Loging.class.getResource("/Imagenes/Log.png")));
		
		
	}
}