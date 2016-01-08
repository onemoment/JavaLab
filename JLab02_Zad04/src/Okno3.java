import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Okno3 extends Frame implements WindowListener, ActionListener, ItemListener {

	Checkbox check;
	TextField text;
	Button button;
	List list;
	Label label;
	Choice choice;
	Button close;
	
	private void createCheckBox(){
		check = new Checkbox("Pola aktywne");
		check.addItemListener(this);
		check.setBounds(20, 40, 300, 20);
		check.setState(false);
		add(check);
	}
	
	private void createTextField(){
		text = new TextField("podaj nowy element");
		text.setBounds(20, 70, 300, 25);
		text.setEnabled(false);
		add(text);
	}
	
	private void createButton(){
		button = new Button("Dodaj element");
		button.addActionListener(this);
		button.setBounds(20, 105, 100, 25);
		button.setEnabled(false);
		add(button);
	}
	
	private void createList(){
		list = new List();
		list.setBounds(20, 140, 300, 300);
		list.setEnabled(false);
		add(list);
	}
	private void createLabel(){
		label = new Label("Wybierz, co chcesz zrobiæ?");
		label.setBounds(20, 450, 200, 25);
		add(label);
	}
	
	private void createChoice(){
		choice = new Choice();
		choice.add("- brak akcji -");
		choice.add("Wyczyœæ listê");
		choice.add("Odwróæ kolejnoœæ");
		choice.setBounds(20, 485, 300, 25);
		choice.addItemListener(this);
		choice.setEnabled(false);
		add(choice);
	}
	
	private void createCloseButton(){
		close = new Button("Zamknij");
		close.setBounds(20, 530, 100, 25);
		close.addActionListener(this);
		add(close);
	}
	
	public Okno3() throws HeadlessException {
		super();
		this.addWindowListener(this);
		setBounds(20, 20, 340, 600);
		setLayout(null);
		
		createCheckBox();
		createTextField();
		createButton();
		createList();
		createLabel();
		createChoice();
		createCloseButton();
	}
	
	public void run(){
		setVisible(true);
	}

	private void zaznacz(boolean stan){
		text.setEnabled(stan);
		button.setEnabled(stan);
		list.setEnabled(stan);
		choice.setEnabled(stan);
	}
	
	private void dodajElement(){
		if (!text.getText().equals("")){
			list.add(text.getText());
		}
	}
	
	private void akcjaWyczysc(){
		list.removeAll();
	}
	
	private void akcjaOdwroc(){
		String item = "";
		int last = list.getItemCount() -1; 
		int center =  last / 2;
		
		for (int i=0; i<center; i++){
			item = list.getItem(last - i);
			list.replaceItem(list.getItem(i), last - i);
			list.replaceItem(item, i);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button){
			dodajElement();
		}else if(e.getSource() == close){
			System.exit(0);
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void itemStateChanged(ItemEvent e){
		if (e.getSource() == check){
			boolean zaznaczone = e.getStateChange() == ItemEvent.SELECTED;
			zaznacz(zaznaczone);
		}else if (e.getSource() == choice){
			switch (choice.getSelectedIndex()){
			case 0: break;
			case 1: akcjaWyczysc(); break;
			case 2: akcjaOdwroc(); break;
			}
		}
	}

	public static void main(String[] args) {
		Okno3 okno = new Okno3();
		okno.run();
	}

}
