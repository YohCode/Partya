package Boundry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.partyaSystem;
import partyaEntity.Friends;

import java.util.Date;
public class Vip_Newsletter extends JFrame {

	private JPanel contentPane;
	private partyaSystem DB;
	private Date _todaysDate;
	//public List<Parties> _futureParties;
	public Friends _unnamed_Friends_;

	public void SendNotefication() {
		throw new UnsupportedOperationException();
	}


	/**
	 * Create the frame.
	 */
	public Vip_Newsletter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
