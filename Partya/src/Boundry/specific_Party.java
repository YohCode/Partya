package Boundry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class specific_Party extends JFrame {

	private JPanel contentPane;

	private int _partyID;
	//public List<Area> _areas;
	public boolean _liveShow;
	public String _areaName;
	public int _ticketPrice;
	public int _size;
	public int _maxTickets;
	public int _maxParticipants;
	public System _unnamed_System_;

	/*
	 * public void btnShowMore() { throw new UnsupportedOperationException(); }
	 * 
	 * public void btnBack() { throw new UnsupportedOperationException(); }
	 */

	/**
	 * Create the frame.
	 */
	public specific_Party() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
