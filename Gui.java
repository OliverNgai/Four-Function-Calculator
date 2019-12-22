import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui implements ActionListener{
	boolean check = true;

	JTextField inputone= new JTextField(5);
	JTextField inputtwo= new JTextField(5);
	JTextField function= new JTextField(1);
	JTextField finale= new JTextField(20);
	
	JButton button = new JButton("Solve");
	JButton buttonZero = new JButton ("0");
	JButton buttonOne = new JButton("1");
	JButton buttonTwo = new JButton ("2");
	JButton buttonThree = new JButton ("3");
	JButton buttonFour = new JButton ("4");
	JButton buttonFive = new JButton ("5");
	JButton buttonSix = new JButton ("6");
	JButton buttonSeven = new JButton ("7");
	JButton buttonEight = new JButton ("8");
	JButton buttonNine = new JButton ("9");
	JButton buttonPlus = new JButton ("+");
	JButton buttonMinus = new JButton ("-");
	JButton buttonMultiply = new JButton ("*");
	JButton buttonDivide = new JButton ("/");
	JButton buttonClear = new JButton ("Clear");
	JButton buttonDot = new JButton (".");
	
	public Gui() {
JFrame frame = new JFrame("JFrame Example");
		
		frame.setSize(400, 500);
		
		inputone.setEditable(false);
		inputtwo.setEditable(false);
		function.setEditable(false);
		finale.setEditable(false);
		
		buttonDot.addActionListener(this);
		buttonZero.addActionListener(this);
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		buttonFour.addActionListener(this);
		buttonFive.addActionListener(this);
		buttonSix.addActionListener(this);
		buttonSeven.addActionListener(this);
		buttonEight.addActionListener(this);
		buttonNine.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonMultiply.addActionListener(this);
		buttonDivide.addActionListener(this);
		buttonClear.addActionListener(this);
		
		
		button.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double num1= Double.parseDouble(inputone.getText());
				double num2= Double.parseDouble(inputtwo.getText());
				double sol= 0;
				
				if(function.getText().equals( "+")) {
					sol=num1+num2;
					
				}
				else if(function.getText().equals( "-")) {
					sol=num1-num2;
				}
				else if(function.getText().equals( "*")) {
					sol=num1*num2;
				}
				else if(function.getText().equals( "/")) {
					sol=num1/num2;
				}
				System.out.println(sol);
				finale.setText(String.valueOf(sol));
			}
		
		});
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,4));
		
		frame.add(panel);
		panel.add(inputone);
		panel.add(function);
		panel.add(inputtwo);
		panel.add(finale);
		panel.add(buttonPlus);
		panel.add(buttonMinus);
		panel.add(buttonMultiply);
		panel.add(buttonDivide);
		panel.add(buttonSeven);
		panel.add(buttonEight);
		panel.add(buttonNine);
		panel.add(buttonClear);
		panel.add(buttonThree);
		panel.add(buttonFour);
		panel.add(buttonFive);
		panel.add(buttonSix);
		panel.add(buttonDot);
		panel.add(buttonZero);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(button);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == buttonPlus) {
			changeOperator("+");
		}
		else if (e.getSource() == buttonMinus) {
			changeOperator("-");
		}
		else if (e.getSource() == buttonMultiply) {
			changeOperator("*");
		}
		else if (e.getSource() == buttonDivide) {
			changeOperator("/");
		}
		else if (e.getSource() == buttonZero) {
			changeNum ("0");
		}
		else if (e.getSource() == buttonOne) {
			changeNum ("1");
		}
		else if (e.getSource() == buttonTwo) {
			changeNum ("2");
		}
		else if (e.getSource() == buttonThree) {
			changeNum ("3");
		}
		else if (e.getSource() == buttonFour) {
			changeNum ("4");
		}
		else if (e.getSource() == buttonFive) {
			changeNum ("5");
		}
		else if (e.getSource() == buttonSix) {
			changeNum ("6");
		}
		else if (e.getSource() == buttonSeven) {
			changeNum ("7");
		}
		else if (e.getSource() == buttonEight) {
			changeNum ("8");
		}
		else if (e.getSource() == buttonNine) {
			changeNum ("9");
		}
		else if (e.getSource() == buttonDot) {
			changeNum (".");
		}
		else if (e.getSource() == buttonClear) {
			inputone.setText("");
			inputtwo.setText("");
			function.setText("");
			finale.setText("");
			check=true;
			
		}
	}
	
	public void changeOperator(String op) {
		function.setText(op);
		check=false;
		if (inputone.getText().length()==0 ) {
			inputone.setText("0");
		}
		
	}
	public void changeNum(String i) {
		String temp;
		if (check==true) {
			temp=inputone.getText();
					
		}
		else {
			temp=inputtwo.getText();
		}
		if (i.equals(".") && temp.length()==0) {
			temp+="0";
		}
				
			
		temp+=i; 
		if (check==true) {
			inputone.setText(temp);
					
		}
		else {
			inputtwo.setText(temp);
		}
	}
}

