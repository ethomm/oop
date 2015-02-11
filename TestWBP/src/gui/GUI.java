package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GUI extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHeiOgHopp = new JButton("Hei og hopp");
		btnHeiOgHopp.setBounds(302, 228, 117, 29);
		contentPane.add(btnHeiOgHopp);
		
		txtPlaceholder = new JTextField();
		txtPlaceholder.setText("Placeholder");
		txtPlaceholder.setBounds(-44, 59, 134, 28);
		contentPane.add(txtPlaceholder);
		txtPlaceholder.setColumns(10);
	}
}
