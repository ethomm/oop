package f8_G;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfMerke;
	private JTextField tfModell;
	private JTextField lbMerke3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 284, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfMerke = new JTextField();
		tfMerke.setBounds(122, 19, 134, 28);
		panel.add(tfMerke);
		tfMerke.setColumns(10);
		
		tfModell = new JTextField();
		tfModell.setBounds(122, 59, 134, 28);
		tfModell.setColumns(10);
		panel.add(tfModell);
		
		lbMerke3 = new JTextField();
		lbMerke3.setBounds(122, 99, 134, 28);
		lbMerke3.setColumns(10);
		panel.add(lbMerke3);
		
		JLabel lbMerke = new JLabel("Merke:");
		lbMerke.setBounds(6, 25, 61, 16);
		panel.add(lbMerke);
		
		JLabel lbModell = new JLabel("Modell:");
		lbModell.setBounds(6, 65, 61, 16);
		panel.add(lbModell);
		
		JLabel lblaarsmodell = new JLabel("Årsmodell:");
		lblaarsmodell.setBounds(6, 105, 61, 16);
		panel.add(lblaarsmodell);
	}
}
