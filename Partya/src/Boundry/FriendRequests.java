package Boundry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FriendRequests extends JFrame {

	private JPanel contentPane;

	private List<Participants> _requests;
	public Friends _unnamed_Friends_;
	public Friends _unnamed_Friends_2;

	public void btnConfrim() {
		throw new UnsupportedOperationException();
	}

	public void btnRemove() {
		throw new UnsupportedOperationException();
	}

	public void btnBack() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Create the frame.
	 */
	public FriendRequests() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
