package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	//Lager en boolean som forteller oss hvilken farge vi har
	private Boolean farge = false;
	public MainFrame(String title) {
		super(title);
		//Hva gj�r vi ved lukking av vinduet
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Final
		
		//Komponenter
		final JButton button = new JButton("Blue");
		
		//Velg Layout manager
		setLayout(new BorderLayout());
		
		//F� tak i en kontainer for � putte dette i noe
		final Container cont = getContentPane();
		
		//Setter bakgrunnsfarge
		cont.setBackground(Color.GREEN);
		
		//Plasserer knappen
		cont.add(button, BorderLayout.NORTH);
		
		//funksjonalitet
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!farge){
					cont.setBackground(Color.BLUE);
					button.setText("Green");
					farge = true;
				}else{
					cont.setBackground(Color.GREEN);
					button.setText("Blue");
					farge = false;
				}
			}
		});
		
		//Set st�rrelse
		setSize(400, 300);
		// vis vindu
		setVisible(true);
	}
	

}