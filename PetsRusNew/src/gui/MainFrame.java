package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfNavn;
	private JTextField tfArtNavn;
	private JTextField tfSlektsNavn;
	private JTextField tfPrisInn;
	private JTextField tfPrisUt;
	private JTextField tfLNavn;
	private JTextField tfLEpost;
	private JTextField tfLAdresse;
	private JTextField tfLPostnr;
	private JTextField tfLPoststed;
	private JTextField tfLtlf;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeggTilVare = new JLabel("Legg til vare:");
		lblLeggTilVare.setBounds(19, 31, 183, 16);
		contentPane.add(lblLeggTilVare);
		
		JPanel panel = new JPanel();
		panel.setBounds(19, 59, 285, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfNavn = new JTextField();
		tfNavn.setBounds(145, 6, 134, 28);
		panel.add(tfNavn);
		tfNavn.setColumns(10);
		
		tfArtNavn = new JTextField();
		tfArtNavn.setColumns(10);
		tfArtNavn.setBounds(145, 81, 134, 28);
		panel.add(tfArtNavn);
		
		tfSlektsNavn = new JTextField();
		tfSlektsNavn.setColumns(10);
		tfSlektsNavn.setBounds(145, 128, 134, 28);
		panel.add(tfSlektsNavn);
		
		tfPrisInn = new JTextField();
		tfPrisInn.setColumns(10);
		tfPrisInn.setBounds(145, 168, 134, 28);
		panel.add(tfPrisInn);
		
		tfPrisUt = new JTextField();
		tfPrisUt.setColumns(10);
		tfPrisUt.setBounds(145, 211, 134, 28);
		panel.add(tfPrisUt);
		
		JComboBox LevBoks = new JComboBox();
		LevBoks.setBounds(145, 46, 134, 27);
		panel.add(LevBoks);
		
		JLabel lblNavn = new JLabel("Navn");
		lblNavn.setBounds(6, 12, 61, 16);
		panel.add(lblNavn);
		
		JLabel lblLeverandor = new JLabel("Leverandor:");
		lblLeverandor.setBounds(6, 50, 100, 16);
		panel.add(lblLeverandor);
		
		JLabel lblArtsmavm = new JLabel("Artsnavn:");
		lblArtsmavm.setBounds(6, 87, 89, 16);
		panel.add(lblArtsmavm);
		
		JLabel lblSlektsnavn = new JLabel("Slektsnavn");
		lblSlektsnavn.setBounds(6, 134, 100, 16);
		panel.add(lblSlektsnavn);
		
		JLabel lblPrisInn = new JLabel("Pris inn:");
		lblPrisInn.setBounds(6, 174, 61, 16);
		panel.add(lblPrisInn);
		
		JLabel lblPrisUt = new JLabel("Pris ut:");
		lblPrisUt.setBounds(6, 217, 61, 16);
		panel.add(lblPrisUt);
		
		JButton btnLeggTilVare = new JButton("Legg til vare");
		btnLeggTilVare.setBounds(162, 255, 117, 29);
		panel.add(btnLeggTilVare);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(348, 59, 285, 307);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		tfLNavn = new JTextField();
		tfLNavn.setBounds(145, 6, 134, 28);
		panel_1.add(tfLNavn);
		tfLNavn.setColumns(10);
		
		tfLEpost = new JTextField();
		tfLEpost.setColumns(10);
		tfLEpost.setBounds(145, 48, 134, 28);
		panel_1.add(tfLEpost);
		
		tfLAdresse = new JTextField();
		tfLAdresse.setColumns(10);
		tfLAdresse.setBounds(145, 88, 134, 28);
		panel_1.add(tfLAdresse);
		
		tfLPostnr = new JTextField();
		tfLPostnr.setColumns(10);
		tfLPostnr.setBounds(145, 128, 134, 28);
		panel_1.add(tfLPostnr);
		
		tfLPoststed = new JTextField();
		tfLPoststed.setColumns(10);
		tfLPoststed.setBounds(145, 168, 134, 28);
		panel_1.add(tfLPoststed);
		
		tfLtlf = new JTextField();
		tfLtlf.setColumns(10);
		tfLtlf.setBounds(145, 208, 134, 28);
		panel_1.add(tfLtlf);
		
		JLabel lblNavn_1 = new JLabel("Navn");
		lblNavn_1.setBounds(6, 12, 61, 16);
		panel_1.add(lblNavn_1);
		
		JLabel lblEpost = new JLabel("Epost:");
		lblEpost.setBounds(6, 54, 61, 16);
		panel_1.add(lblEpost);
		
		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setBounds(6, 94, 61, 16);
		panel_1.add(lblAdresse);
		
		JLabel lblPostnr = new JLabel("Postnr:");
		lblPostnr.setBounds(6, 134, 61, 16);
		panel_1.add(lblPostnr);
		
		JLabel lblPoststed = new JLabel("Poststed:");
		lblPoststed.setBounds(6, 174, 61, 16);
		panel_1.add(lblPoststed);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(6, 214, 61, 16);
		panel_1.add(lblTelefon);
		
		JButton btnLeggTilLeverandr = new JButton("Legg til leverand\u00F8r");
		btnLeggTilLeverandr.setBounds(129, 253, 150, 29);
		panel_1.add(btnLeggTilLeverandr);
		
		JLabel lblLeggTilLeverandor = new JLabel("Legg til leverandor:");
		lblLeggTilLeverandor.setBounds(348, 31, 163, 16);
		contentPane.add(lblLeggTilLeverandor);
	}
}
