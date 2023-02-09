package limpiaArchivosTemporales;


import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class prueba2 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2433629237528361819L;
	JButton button;







	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba2 frame = new prueba2();
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
	public prueba2() {
		
		JFrame frame = new JFrame("Dynamic Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel
        JPanel panel = new JPanel();

        for(int i = 0; i<4;i++) {
        	String num = Integer.toString(i);
        	button = new JButton();
        	button.setText(num);
            button.addActionListener( new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("boton" +button.getText()); 
					
				}
            	
            });
            panel.add(button);
        }
         
        JTextField textField = new JTextField(20);

        // Add the button and text field to the panel
       
        panel.add(textField);

        // Add the panel to the content pane of the frame
        Container contentPane = frame.getContentPane();
        contentPane.add(panel);

        // Set the size of the frame and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("boton"+button.getText());
		
	}

	
}
