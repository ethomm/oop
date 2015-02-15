package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.management.timer.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import medlemmer.Leverandor;
import varelager.Fisk;
import varelager.Pattedyr;
import varelager.Produkt;
import varelager.Reptil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;

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
	private JLabel lblSumAntallFisk;
	private JLabel lblSumAntallProdukter;
	private JLabel lblSumAntallReptiler;
	private JLabel lblSumAntallPattedyr;
	private JComboBox cbType ;
	private JComboBox LevBoks;
	private JLabel lblAdvarsel;
	private JComboBox cbVareliste;
	private JButton btnSelg; 
	//noen jukse variabler
	private Boolean fisk = false;
	private Boolean pattedyr = false;
	private Boolean reptil = false;
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeggTilVare = new JLabel("Legg til:");
		lblLeggTilVare.setBounds(19, 31, 183, 16);
		contentPane.add(lblLeggTilVare);
		
		final JPanel panVare = new JPanel();
		panVare.setBounds(19, 80, 285, 318);
		contentPane.add(panVare);
		panVare.setLayout(null);
		panVare.setVisible(false);
		
		tfNavn = new JTextField();
		tfNavn.setBounds(145, 6, 134, 28);
		panVare.add(tfNavn);
		tfNavn.setColumns(10);
		
		tfArtNavn = new JTextField();
		tfArtNavn.setColumns(10);
		tfArtNavn.setBounds(145, 124, 134, 28);
		panVare.add(tfArtNavn);
		
		tfSlektsNavn = new JTextField();
		tfSlektsNavn.setColumns(10);
		tfSlektsNavn.setBounds(145, 164, 134, 28);
		panVare.add(tfSlektsNavn);
		
		tfPrisInn = new JTextField();
		tfPrisInn.setColumns(10);
		tfPrisInn.setBounds(145, 204, 134, 28);
		panVare.add(tfPrisInn);
		
		tfPrisUt = new JTextField();
		tfPrisUt.setColumns(10);
		tfPrisUt.setBounds(145, 244, 134, 28);
		panVare.add(tfPrisUt);
		
		LevBoks = new JComboBox();
		LevBoks.setBounds(145, 85, 134, 27);
		panVare.add(LevBoks);
		
		JLabel lblNavn = new JLabel("Navn");
		lblNavn.setBounds(6, 12, 61, 16);
		panVare.add(lblNavn);
		
		JLabel lblLeverandor = new JLabel("Leverandor:");
		lblLeverandor.setBounds(6, 89, 100, 16);
		panVare.add(lblLeverandor);
		
		JLabel lblArtsmavm = new JLabel("Artsnavn:");
		lblArtsmavm.setBounds(6, 130, 89, 16);
		panVare.add(lblArtsmavm);
		
		JLabel lblSlektsnavn = new JLabel("Slektsnavn");
		lblSlektsnavn.setBounds(6, 170, 100, 16);
		panVare.add(lblSlektsnavn);
		
		JLabel lblPrisInn = new JLabel("Pris inn:");
		lblPrisInn.setBounds(6, 210, 61, 16);
		panVare.add(lblPrisInn);
		
		JLabel lblPrisUt = new JLabel("Pris ut:");
		lblPrisUt.setBounds(6, 250, 61, 16);
		panVare.add(lblPrisUt);
		
		JButton btnLeggTilVare = new JButton("Legg til vare");
		btnLeggTilVare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//henter informasjonen fra tekstboksene 
				String navn = tfNavn.getText();
				double innPris = Integer.parseInt(tfPrisInn.getText());
				double utPris = Integer.parseInt(tfPrisUt.getText());
				Leverandor leverandor = (Leverandor) LevBoks.getSelectedItem();
				String slektsnavn = tfSlektsNavn.getText();
				String artsnavn = tfArtNavn.getText();
				
				//Bestem hvilken vare som opprettes
				String type = (String) cbType.getSelectedItem();
				//enten er det typen reptil
				if(type == "Reptil"){
				new Reptil(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
				
				}
				//eller fisk
				else if(type == "Fisk"){
				new Fisk(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
				}
				//Hvis ingen, da er det pattedyr
				else{
				new Pattedyr(navn, innPris, utPris, leverandor, slektsnavn, artsnavn);
				}
				
				//Oppdaterer varene
				oppdaterVarer();
				panVare.setVisible(false);
				//Gir brukeren en advarsel
				advarsel("Du har lagt til en ny vare");
				tfNavn.setText("");
				tfPrisInn.setText("");
				tfPrisUt.setText("");
				tfSlektsNavn.setText("");
				tfArtNavn.setText("");
			}
		});
		btnLeggTilVare.setBounds(162, 284, 117, 29);
		panVare.add(btnLeggTilVare);
		
		cbType = new JComboBox();
		cbType.setBounds(145, 46, 134, 27);
		panVare.add(cbType);
		cbType.addItem("Fisk");
		cbType.addItem("Pattedyr");
		cbType.addItem("Reptil");
		
		JLabel lblType = new JLabel("Type Vare");
		lblType.setBounds(6, 50, 61, 16);
		panVare.add(lblType);
		
		final JPanel panLeverandor = new JPanel();
		panLeverandor.setBounds(19, 80, 285, 307);
		contentPane.add(panLeverandor);
		panLeverandor.setLayout(null);
		panLeverandor.setVisible(false);
		
		tfLNavn = new JTextField();
		tfLNavn.setBounds(145, 6, 134, 28);
		panLeverandor.add(tfLNavn);
		tfLNavn.setColumns(10);
		
		tfLEpost = new JTextField();
		tfLEpost.setColumns(10);
		tfLEpost.setBounds(145, 48, 134, 28);
		panLeverandor.add(tfLEpost);
		
		tfLAdresse = new JTextField();
		tfLAdresse.setColumns(10);
		tfLAdresse.setBounds(145, 88, 134, 28);
		panLeverandor.add(tfLAdresse);
		
		tfLPostnr = new JTextField();
		tfLPostnr.setColumns(10);
		tfLPostnr.setBounds(145, 128, 134, 28);
		panLeverandor.add(tfLPostnr);
		
		tfLPoststed = new JTextField();
		tfLPoststed.setColumns(10);
		tfLPoststed.setBounds(145, 168, 134, 28);
		panLeverandor.add(tfLPoststed);
		
		tfLtlf = new JTextField();
		tfLtlf.setColumns(10);
		tfLtlf.setBounds(145, 208, 134, 28);
		panLeverandor.add(tfLtlf);
		
		JLabel lblNavn_1 = new JLabel("Navn");
		lblNavn_1.setBounds(6, 12, 61, 16);
		panLeverandor.add(lblNavn_1);
		
		JLabel lblEpost = new JLabel("Epost:");
		lblEpost.setBounds(6, 54, 61, 16);
		panLeverandor.add(lblEpost);
		
		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setBounds(6, 94, 61, 16);
		panLeverandor.add(lblAdresse);
		
		JLabel lblPostnr = new JLabel("Postnr:");
		lblPostnr.setBounds(6, 134, 61, 16);
		panLeverandor.add(lblPostnr);
		
		JLabel lblPoststed = new JLabel("Poststed:");
		lblPoststed.setBounds(6, 174, 61, 16);
		panLeverandor.add(lblPoststed);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(6, 214, 61, 16);
		panLeverandor.add(lblTelefon);
		
		JButton btnLeggTilLeverandr = new JButton("Legg til leverand\u00F8r");
		btnLeggTilLeverandr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//henter infromasjonen fra tekstboksene
				String navn = tfLNavn.getText();
				String ePost = tfLEpost.getText();
				String adr = tfLAdresse.getText();
				String pSted = tfLPoststed.getText();
				String tlf = tfLtlf.getText();
				
				new Leverandor(navn, ePost, adr, pSted, tlf);
				updateLev();
				panLeverandor.setVisible(false);
				advarsel("Du har lagt til en ny Leverand�r");
				tfLNavn.setText("");
				tfLEpost.setText("");
				tfLAdresse.setText("");
				tfLPostnr.setText("");
				tfLPoststed.setText("");
				
			}
		});
		btnLeggTilLeverandr.setBounds(129, 253, 150, 29);
		panLeverandor.add(btnLeggTilLeverandr);
		
		JButton btnVare = new JButton("Vare");
		btnVare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tomadvarsel();
				panVare.setVisible(true);
				panLeverandor.setVisible(false);
			}
		});
		btnVare.setBounds(74, 26, 66, 29);
		contentPane.add(btnVare);
		
		JButton btnLeverandr = new JButton("Leverand\u00F8r");
		btnLeverandr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tomadvarsel();
				panVare.setVisible(false);
				panLeverandor.setVisible(true);
			}
		});
		btnLeverandr.setBounds(145, 26, 117, 29);
		contentPane.add(btnLeverandr);
		
		JPanel panel = new JPanel();
		panel.setBounds(316, 80, 267, 84);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Antall Produkter:");
		lblNewLabel.setBounds(6, 6, 141, 16);
		panel.add(lblNewLabel);
		
		JLabel lblAntallFisk = new JLabel("Antall Fisk");
		lblAntallFisk.setBounds(6, 23, 141, 16);
		panel.add(lblAntallFisk);
		
		JLabel lblAntallPattedyr = new JLabel("Antall Pattedyr:");
		lblAntallPattedyr.setBounds(6, 42, 141, 16);
		panel.add(lblAntallPattedyr);
		
		JLabel lblAntallReptiler = new JLabel("Antall Reptiler");
		lblAntallReptiler.setBounds(6, 59, 141, 16);
		panel.add(lblAntallReptiler);
		
		lblSumAntallPattedyr = new JLabel("0");
		lblSumAntallPattedyr.setBounds(132, 42, 61, 16);
		panel.add(lblSumAntallPattedyr);
		
		lblSumAntallFisk = new JLabel("0");
		lblSumAntallFisk.setBounds(132, 23, 61, 16);
		panel.add(lblSumAntallFisk);
		
		lblSumAntallProdukter = new JLabel("0");
		lblSumAntallProdukter.setBounds(132, 6, 61, 16);
		panel.add(lblSumAntallProdukter);
		
		lblSumAntallReptiler = new JLabel("0");
		lblSumAntallReptiler.setBounds(132, 59, 61, 16);
		panel.add(lblSumAntallReptiler);
		
		JPanel panelAdvarsel = new JPanel();
		panelAdvarsel.setBounds(316, 6, 351, 67);
		contentPane.add(panelAdvarsel);
		panelAdvarsel.setLayout(null);
		
		lblAdvarsel = new JLabel("");
		lblAdvarsel.setBounds(6, 6, 339, 55);
		panelAdvarsel.add(lblAdvarsel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(316, 194, 340, 171);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSelgVare = new JLabel("Selg vare:");
		lblSelgVare.setBounds(6, 6, 131, 16);
		panel_1.add(lblSelgVare);
		
		JButton btnPattedyr = new JButton("Pattedyr");
		btnPattedyr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//T�mmer advarselfeltet
				tomadvarsel();
				//Setter sin jukse boolean til sann
				pattedyr = true;
				//T�m Listen vareliste 
				cbVareliste.removeAllItems();
				//n�r klikket hent liste
				for (Pattedyr p: Pattedyr.getPattedyrliste()){
					cbVareliste.addItem(p);
				}
				//n�r klikket gj�r liste synlig sammen med selgknapp
				cbVareliste.setVisible(true);
				btnSelg.setVisible(true);
			}
		});
		btnPattedyr.setBounds(6, 34, 117, 29);
		panel_1.add(btnPattedyr);
		
		JButton btnReptil = new JButton("Reptil");
		btnReptil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//T�mmer advarselfeltet
				tomadvarsel();
				//Setter sin jukse boolean til sann
				reptil = true;
				//T�m Listen vareliste 
				cbVareliste.removeAllItems();
				//n�r klikket hent liste
				for(Reptil r: Reptil.getReptilliste()){
					cbVareliste.addItem(r);
				}
				//n�r klikket gj�r liste synlig sammen med selgknapp
				cbVareliste.setVisible(true);
				btnSelg.setVisible(true);
				
			}
		});
		btnReptil.setBounds(119, 34, 96, 29);
		panel_1.add(btnReptil);
		
		JButton btnFisk = new JButton("Fisk");
		btnFisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//T�mmer advarselfeltet
				tomadvarsel();
				//Setter sin jukse boolean til sann
				fisk = true;
				//T�m Listen vareliste
				cbVareliste.removeAllItems();
				//n�r klikket hent liste
				for (Fisk f: Fisk.getFiskeliste()){
					cbVareliste.addItem(f);
				}
				//n�r klikket gj�r liste synlig sammen med selgknapp
				cbVareliste.setVisible(true);
				btnSelg.setVisible(true);
			}
		});
		btnFisk.setBounds(217, 34, 96, 29);
		panel_1.add(btnFisk);
		
		cbVareliste = new JComboBox();
		cbVareliste.setBounds(6, 75, 307, 27);
		panel_1.add(cbVareliste);
		cbVareliste.setVisible(false);
		
		btnSelg = new JButton("Selg");
		btnSelg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Class<? extends Object> salg = cbVareliste.getSelectedItem().getClass();
				String navn = salg.getName();
				//Kj�r selg skriptet
				if(fisk == true){
					Fisk f = (Fisk)cbVareliste.getSelectedItem();
					f.selg(navn);
					fisk=false;
				}else if (reptil == true){
					Reptil r = (Reptil)cbVareliste.getSelectedItem();
					r.selg(navn);
					reptil=false;
				}else{
					Pattedyr p = (Pattedyr)cbVareliste.getSelectedItem();
					p.selg(navn);
					pattedyr=false;
				}
				
				//hjem knappen og feltet
				advarsel("Du har solgt en vare");
				oppdaterVarer();
				btnSelg.setVisible(false);
				cbVareliste.setVisible(false);
			}
		});
		btnSelg.setBounds(196, 125, 117, 29);
		panel_1.add(btnSelg);
		btnSelg.setVisible(false);
	}
	
	private void advarsel(String txt){
		lblAdvarsel.setText(txt);
	}


	private void tomadvarsel(){
		lblAdvarsel.setText("");
	}
	
	//oppdaterer leverand�rlise
	private void updateLev(){
		LevBoks.removeAllItems();
		for (Leverandor l: Leverandor.getLeverandorliste()){
			LevBoks.addItem(l);
		}
	}
	
	
	//oppdaterer vare beholdningen
	private void oppdaterVarer() {
		lblSumAntallFisk.setText(Fisk.getFiskeliste().size() + "");
		lblSumAntallProdukter.setText(Produkt.getProduktliste().size() +"");
		lblSumAntallReptiler.setText(Reptil.getReptilliste().size() + "");
		lblSumAntallPattedyr.setText(Pattedyr.getPattedyrliste().size() + "");
	}
}
