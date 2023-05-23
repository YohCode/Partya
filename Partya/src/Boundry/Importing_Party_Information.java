package Boundry;

import java.awt.EventQueue;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Entity.*;
public class Importing_Party_Information extends JFrame {

	private JPanel contentPane;

	//private List<Party> _importedParties;
	public int _partyID;
	public String _partyName;
	public Address adress;
	public int _buildingNo;
	public String _city;
	public District _district;
	public Date _startDate;
	public Date _endDate;
	public System _unnamed_System_;

	public void btnBackPressed() {
		throw new UnsupportedOperationException();
	}

	public void btnImportPressed() {
		throw new UnsupportedOperationException();
	}

	public void btnShowMoreDetails() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Create the frame.
	 */
	public Importing_Party_Information() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
