package Boundry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entity.Artist;
import javax.swing.JButton;

public class Artists_of_area extends JFrame {

	private JPanel contentPane;

	private List<Artist> _artists;
	public String _artistName;
	public int _popularity;
	public MusicStyle _musicStyle;
	public Date _performanceDate;
	public Time _startHour;
	public Time _endHour;
	public System _unnamed_System_;
	

	public void btnBack() {
		throw new UnsupportedOperationException();
	}


	/**
	 * Create the frame.
	 */
	public Artists_of_area() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(43, 218, 91, 23);
		contentPane.add(btnNewButton);
	}
}
