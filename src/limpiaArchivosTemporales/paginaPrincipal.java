package limpiaArchivosTemporales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class paginaPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4701502211657182586L;
	private JPanel contentPane;
	private JButton btnNewButton, btnConfiguracion;
	private JLabel lblArchivosBasura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paginaPrincipal frame = new paginaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	public paginaPrincipal() {
		setResizable(false);
		setTitle("Limpia archivos temporales - Bittor Gonzalez");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Se han encontrado");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 237, 435, 64);
		contentPane.add(lblNewLabel);
		
		 btnNewButton = new JButton("Ver archivos");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 15));
		btnNewButton.setBounds(134, 395, 183, 42);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		 btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setFont(new Font("Roboto", Font.PLAIN, 15));
		btnConfiguracion.setBounds(134, 465, 183, 42);
		contentPane.add(btnConfiguracion);
		btnConfiguracion.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(paginaPrincipal.class.getResource("/iconos/escoba-magica.png")));
		lblNewLabel_1.setBounds(152, 67, 148, 128);
		contentPane.add(lblNewLabel_1);
		
		lblArchivosBasura = new JLabel("archivos basura a eliminar");
		lblArchivosBasura.setHorizontalAlignment(SwingConstants.CENTER);
		lblArchivosBasura.setFont(new Font("Roboto", Font.BOLD, 25));
		lblArchivosBasura.setBounds(0, 282, 435, 64);
		contentPane.add(lblArchivosBasura);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		if(o == btnNewButton  ) {
			
			Escaneo newframe = new Escaneo();
			
			newframe.setVisible(true);
			this.dispose();
		}
		
		if(o == btnConfiguracion) {
			
		}
		
	}

}
