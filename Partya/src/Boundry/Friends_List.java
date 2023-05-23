package Boundry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Friends_List extends JFrame {

	private JPanel contentPane;

	private list<Participant> _friends;
	public Friends _unnamed_Friends_;

	public void btnAddFriend() {
		throw new UnsupportedOperationException();
	}

	public void btnRemoveFriend() {
		throw new UnsupportedOperationException();
	}

	public void btnBack() {
		throw new UnsupportedOperationException();
	}

	public void btnFriendRequests() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Create the frame.
	 */
	public Friends_List() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
