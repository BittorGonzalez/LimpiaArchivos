package limpiaArchivosTemporales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class Configuracion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -343246783934870851L;
	private JPanel contentPane;
	JButton btnNewButton;
	public  File directorio;
	public   String directorioString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracion frame = new Configuracion();
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
	public Configuracion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elegir directorio");
		lblNewLabel.setBounds(165, 53, 104, 14);
		contentPane.add(lblNewLabel);
		
		 btnNewButton = new JButton("Elegir");
		btnNewButton.setBounds(156, 97, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		if(o == btnNewButton) {
			
			JFileChooser fc = new JFileChooser();
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int seleccion = fc.showOpenDialog(this.contentPane);
			if(seleccion == JFileChooser.APPROVE_OPTION) {
				directorio = fc.getSelectedFile();
				directorioString = directorio.getAbsolutePath();
				
		
			}
		}
		
		
	}
	

	public String obtenerDirectorio(){
		String hola = "ujygfuy";
	
		
		return "hola q ase";
		
	}
	
}
