package view;

import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Kurs;
import model.Student;

// View klasse i MVC arkitektur. Ingen logikk med tanke p� data i denne klassen
public class View extends JFrame {
	// globale felt
	private JPanel contentPane;
	private JTextField idTF;
	private JTextField fNavnTF;
	private JTextField eNavnTF;
	private JTextField kurskodeTF;
	private JTextField kursnavnTF;
	private JTextField stdPoengTF;
	private JButton btnLeggTilKurs;
	private JButton btnLeggTilStudent;
	private JList kursliste;
	private JList studentliste;


	// konstrukt�r
	// alt her er generert av designeren (WBP)
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel studPanel = new JPanel();
		studPanel.setBounds(10, 11, 228, 417);
		contentPane.add(studPanel);
		studPanel.setLayout(null);
		
		JPanel leggTilStudPanel = new JPanel();
		leggTilStudPanel.setBounds(10, 11, 208, 190);
		studPanel.add(leggTilStudPanel);
		leggTilStudPanel.setLayout(null);
		
		idTF = new JTextField();
		idTF.setBounds(91, 31, 86, 20);
		leggTilStudPanel.add(idTF);
		idTF.setColumns(10);
		
		fNavnTF = new JTextField();
		fNavnTF.setColumns(10);
		fNavnTF.setBounds(91, 63, 86, 20);
		leggTilStudPanel.add(fNavnTF);
		
		eNavnTF = new JTextField();
		eNavnTF.setColumns(10);
		eNavnTF.setBounds(91, 94, 86, 20);
		leggTilStudPanel.add(eNavnTF);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(35, 34, 46, 14);
		leggTilStudPanel.add(lblId);
		
		JLabel lblFnavn = new JLabel("fNavn:");
		lblFnavn.setBounds(35, 66, 46, 14);
		leggTilStudPanel.add(lblFnavn);
		
		JLabel lblEnavn = new JLabel("eNavn:");
		lblEnavn.setBounds(35, 97, 46, 14);
		leggTilStudPanel.add(lblEnavn);
		
		btnLeggTilStudent = new JButton("Legg Til");
		btnLeggTilStudent.setBounds(58, 141, 89, 23);
		leggTilStudPanel.add(btnLeggTilStudent);
		
		JPanel visStudPanel = new JPanel();
		visStudPanel.setBounds(10, 212, 208, 194);
		studPanel.add(visStudPanel);
		visStudPanel.setLayout(null);
		
		studentliste = new JList();
		studentliste.setBounds(10, 11, 188, 172);
		visStudPanel.add(studentliste);
		
		JPanel kursPanel = new JPanel();
		kursPanel.setBounds(248, 11, 208, 417);
		contentPane.add(kursPanel);
		kursPanel.setLayout(null);
		
		JPanel leggTilKursPanel = new JPanel();
		leggTilKursPanel.setBounds(10, 11, 185, 189);
		kursPanel.add(leggTilKursPanel);
		leggTilKursPanel.setLayout(null);
		
		kurskodeTF = new JTextField();
		kurskodeTF.setBounds(89, 36, 86, 20);
		leggTilKursPanel.add(kurskodeTF);
		kurskodeTF.setColumns(10);
		
		kursnavnTF = new JTextField();
		kursnavnTF.setColumns(10);
		kursnavnTF.setBounds(89, 67, 86, 20);
		leggTilKursPanel.add(kursnavnTF);
		
		stdPoengTF = new JTextField();
		stdPoengTF.setColumns(10);
		stdPoengTF.setBounds(89, 98, 86, 20);
		leggTilKursPanel.add(stdPoengTF);
		
		JLabel lblKurskode = new JLabel("Kurskode:");
		lblKurskode.setBounds(10, 39, 69, 14);
		leggTilKursPanel.add(lblKurskode);
		
		JLabel lblKursnavn = new JLabel("Kursnavn:");
		lblKursnavn.setBounds(10, 70, 69, 14);
		leggTilKursPanel.add(lblKursnavn);
		
		JLabel lblPoeng = new JLabel("Poeng:");
		lblPoeng.setBounds(10, 101, 69, 14);
		leggTilKursPanel.add(lblPoeng);
		
		btnLeggTilKurs = new JButton("Legg Til");
		btnLeggTilKurs.setBounds(52, 142, 89, 23);
		leggTilKursPanel.add(btnLeggTilKurs);
		
		JPanel visKursPanel = new JPanel();
		visKursPanel.setBounds(10, 216, 188, 190);
		kursPanel.add(visKursPanel);
		visKursPanel.setLayout(null);
		
		kursliste = new JList();
		kursliste.setBounds(10, 11, 168, 168);
		visKursPanel.add(kursliste);
	}

	// metoder for � hente verdier fra feltene
	public String getId() {
		return idTF.getText();
	}

	public String getfNavn() {
		return fNavnTF.getText();
	}

	public String geteNavn() {
		return eNavnTF.getText();
	}

	public String getKurskode() {
		return kurskodeTF.getText();
	}

	public String getKursnavn() {
		return kursnavnTF.getText();
	}

	public int getStdPoeng() {
		return Integer.parseInt(stdPoengTF.getText());
	}
	
	// eventh�ndtering
	// metoder for � knytte lyttere til knappene
	public void addActionToStudentBtn(ActionListener e){
		btnLeggTilStudent.addActionListener(e);
	}
	
	public void addActionToKursBtn(ActionListener al){
		btnLeggTilKurs.addActionListener(al);
	}
	
	// metoder for � sette innehold i JListene
	public void addModelToStudentList(DefaultListModel<Student> model){
		studentliste.setModel(model);
	}
	
	public void addModelToKursList(DefaultListModel<Kurs> model){
		kursliste.setModel(model);
	}
	
}
