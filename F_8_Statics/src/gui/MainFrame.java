package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import main.Bil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfMerke;
	private JTextField tfModell;
	private JTextField cmBoks;
	private JComboBox cbBilder;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 250, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfMerke = new JTextField();
		tfMerke.setBounds(110, 34, 134, 28);
		panel.add(tfMerke);
		tfMerke.setColumns(10);
		
		tfModell = new JTextField();
		tfModell.setColumns(10);
		tfModell.setBounds(110, 74, 134, 28);
		panel.add(tfModell);
		
		cmBoks = new JTextField();
		cmBoks.setColumns(10);
		cmBoks.setBounds(110, 114, 134, 28);
		panel.add(cmBoks);
		
		JLabel lblMerke = new JLabel("Merke:");
		lblMerke.setBounds(6, 40, 61, 16);
		panel.add(lblMerke);
		
		JLabel lblModell = new JLabel("Modell:");
		lblModell.setBounds(6, 80, 61, 16);
		panel.add(lblModell);
		
		JLabel lblaarsmodell = new JLabel("Årsmodell");
		lblaarsmodell.setBounds(6, 120, 92, 16);
		panel.add(lblaarsmodell);
		
		JButton btnLeggTil = new JButton("Legg til");
		btnLeggTil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String merke = tfMerke.getText();
				String modell = tfModell.getText();
				int aarsmodell = Integer.parseInt(cmBoks.getText());
				
				new Bil(merke, modell, aarsmodell);
					
				
			}
		});
		btnLeggTil.setBounds(110, 176, 117, 29);
		panel.add(btnLeggTil);
		
		JLabel lblLeggTilBiler = new JLabel("Legg til biler i systemet:");
		lblLeggTilBiler.setBounds(6, 6, 221, 16);
		panel.add(lblLeggTilBiler);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(256, 6, 188, 266);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		cbBilder = new JComboBox();
		cbBilder.setBounds(30, 85, 135, 27);
		panel_1.add(cbBilder);
		
		JButton btnSelg = new JButton("Selg");
		btnSelg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Finn bil
				 cbBilder.getSelectedItem();
				 this.selg();
			}
		});
		btnSelg.setBounds(40, 124, 117, 29);
		panel_1.add(btnSelg);
	}
}
