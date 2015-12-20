import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Okno2 extends Frame implements WindowListener, ActionListener {

	private static final long serialVersionUID = 1L;
	Button przycisk1;
	Button przycisk2;
	Button przycisk3;
	Button przycisk4;
	Button przycisk5;
	
	public Okno2() throws HeadlessException {
		super();
		this.addWindowListener(this);
		setBounds(10,10,600,200);
		setLayout(new FlowLayout());
		
		// pierwszy przycisk
		przycisk1 = new Button("Przycisk 01");
		przycisk1.addActionListener(this);
		przycisk1.setBounds(10, 40, 100, 30);
		przycisk1.setVisible(true);
		add(przycisk1);
		
		przycisk2 = new Button("Przycisk 02");
		przycisk2.addActionListener(this);
		przycisk2.setBounds(20, 40, 100, 25);
		przycisk2.setVisible(true);
		add(przycisk2);
		
		przycisk3 = new Button("Przycisk 03");
		przycisk3.addActionListener(this);
		przycisk3.setBounds(20, 40, 100, 25);
		przycisk3.setVisible(true);
		add(przycisk3);
		
		przycisk4 = new Button("Przycisk 04");
		przycisk4.addActionListener(this);
		przycisk4.setBounds(20, 40, 100, 25);
		przycisk4.setVisible(true);
		add(przycisk4);
		
		przycisk5 = new Button("Przycisk 05");
		przycisk5.addActionListener(this);
		przycisk5.setBounds(20, 40, 100, 25);
		przycisk5.setVisible(true);
		add(przycisk5);
	}
	
	public void uruchom(){
		setVisible(true);
	}

	private void wcisnij01(){
		int top = przycisk1.getY();
		top += 10; przycisk2.setLocation(przycisk2.getX(), top);
		top += 10; przycisk3.setLocation(przycisk3.getX(), top);
		top += 10; przycisk4.setLocation(przycisk4.getX(), top);
		top += 10; przycisk5.setLocation(przycisk5.getX(), top);
	}
	
	private void wcisnij02(){
		przycisk1.setLabel("To");
		przycisk2.setLabel("jest");
		przycisk3.setLabel("test");
		przycisk4.setLabel("przycisków");
		przycisk5.setLabel("!");
	}
	
	private void wcisnij03(){
		setTitle("Wcisniety przycisk 3");
	}
	
	private void wcisnij04(){
		przycisk4.setSize(150, 50);
		przycisk5.setLocation(przycisk4.getX() + przycisk4.getWidth()+2, przycisk5.getY());
	}
	
	private void wcisnij05(){
		setLocation(getX() + 10, getY() + 10);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == przycisk1){
			wcisnij01();
		}else if (e.getSource() == przycisk2){
			wcisnij02();
		}else if (e.getSource() == przycisk3){
			wcisnij03();
		}else if (e.getSource() == przycisk4){
			wcisnij04();
		}else if (e.getSource() == przycisk5){
			wcisnij05();
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	public static void main(String[] args) {
		Okno2 okno = new Okno2();
		okno.uruchom();
	}

}
