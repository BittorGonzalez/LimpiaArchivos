package limpiaArchivosTemporales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Color;

public class Escaneo extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2433629237528361819L;
	private static JPanel contentPane;
	private static JPanel panel;
	private JPanel archivos;
	private JPanel eliminar;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private static File[] arrayFicheros;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escaneo frame = new Escaneo();
					frame.setVisible(true);
					System.out.println(System.getProperty("file.separator"));
					obtenerArchivos();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
		

		
		

	}

	/**
	 * Create the frame.
	 */
	public Escaneo() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Archivos encontrados");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 38, 353, 83);
		contentPane.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(31, 100, 629, 407);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scroll = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(31, 140, 629, 335);
		contentPane.add(scroll);
		
		archivos = new JPanel();
		panel.add(archivos, BorderLayout.WEST);
		archivos.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNewLabel_1 = new JLabel("Archivo");
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		archivos.add(lblNewLabel_1);
		
		eliminar = new JPanel();
		panel.add(eliminar, BorderLayout.EAST);
		eliminar.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		
		lblNewLabel_2 = new JLabel("Mantener");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 128, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		eliminar.add(lblNewLabel_2);
	
	
		btnNewButton = new JButton("Eliminar archivos");
		btnNewButton.setBounds(440, 506, 220, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		
	}


	public static void obtenerArchivos() {
		
		
		File directorio = new File("c:\\temp\\directorio");
		arrayFicheros = directorio.listFiles();
		for(File a:arrayFicheros) {
			System.out.println(arrayFicheros.length);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		
			
		
		
		
		
	}
}
