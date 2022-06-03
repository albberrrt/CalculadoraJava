package calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculadora implements ActionListener{
	
	private static final String String = null;
	JFrame frame;
	JTextField textfield;
	JButton[] numButtons = new JButton[10];
	JButton[] funcButtons = new JButton[9];
	JButton addBtn, subBtn, mulBtn, divBtn;
	JButton decBtn, equBtn, delBtn, clrBtn, ngtBtn;
	JPanel panel;
	JPanel panelFunc;
	
	
	
	
	Font fontSL = new Font("Segoe UI Semilight", 0, 30);
	Font fontNL = new Font("Segoe UI Bold", 0, 40);
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	int frmwidth = 420, frmheight = 512;
	
	@SuppressWarnings("static-access")
	Calculadora() {
		
		frame = new JFrame("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frmwidth,frmheight);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(35, 35, 35));
		
		
		textfield = new JTextField();
		textfield.setBounds(5, 25, 395, 50);
		textfield.setFont(fontNL);
		textfield.setEditable(false);
		textfield.setBackground(new Color(35, 35, 35));
		textfield.setBorder(null);
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		textfield.setForeground(new Color(255,255,249));
		textfield.setText("0");
		
		
		addBtn = new JButton("+");
		subBtn = new JButton("-");
		mulBtn = new JButton("*");
		divBtn = new JButton("/");
		decBtn = new JButton(".");
		equBtn = new JButton("=");
		delBtn = new JButton("Del");
		clrBtn = new JButton("Clear");
		ngtBtn = new JButton("(-)");
		
		funcButtons[0] = addBtn;
		funcButtons[1] = subBtn;
		funcButtons[2] = mulBtn;
		funcButtons[3] = divBtn;
		funcButtons[4] = decBtn;
		funcButtons[5] = equBtn;
		funcButtons[6] = delBtn;
		funcButtons[7] = clrBtn;
		funcButtons[8] = ngtBtn;
		
		for(int i = 0; i < 9; i++) {
			funcButtons[i].addActionListener(this);
			funcButtons[i].setFont(fontSL);
			funcButtons[i].setFocusable(false);
			funcButtons[i].setBackground(new Color(50, 50, 50));
			funcButtons[i].setForeground (new Color(249,249,249));
			funcButtons[i].setBorder(null);
		}
		for(int i = 0; i < 10; i++) {
			numButtons[i] = new JButton(String.valueOf(i));
			numButtons[i].addActionListener(this);
			numButtons[i].setFont(fontSL);
			numButtons[i].setFocusable(false);
			numButtons[i].setBackground(new Color(30,30,30));
			numButtons[i].setForeground (new Color(249,249,249));
			numButtons[i].setBorder(null);
		}
		funcButtons[5].setBackground(new Color(247,221,93));
		
		panelFunc = new JPanel();
		panelFunc.setBounds(3, 401, 400, 70);
		panelFunc.setLayout(new GridLayout(0, 3, 3, 3));
		panelFunc.setBackground(new Color(38, 38, 38));
		
		panelFunc.add(ngtBtn);
		panelFunc.add(delBtn);
		panelFunc.add(clrBtn);		
		
		panel = new JPanel();
		panel.setBounds(3, 100, 400, 300);
		panel.setLayout(new GridLayout(4,4,3,3));
		panel.setBackground(new Color(38, 38, 38));
		
		
		panel.add(numButtons[7]);
		panel.add(numButtons[8]);
		panel.add(numButtons[9]);
		panel.add(addBtn);
		panel.add(numButtons[4]);
		panel.add(numButtons[5]);
		panel.add(numButtons[6]);
		panel.add(subBtn);
		panel.add(numButtons[1]);
		panel.add(numButtons[2]);
		panel.add(numButtons[3]);
		panel.add(mulBtn);
		panel.add(decBtn);
		panel.add(numButtons[0]);
		panel.add(equBtn);
		panel.add(divBtn);
		
		
		frame.add(panelFunc);
		frame.add(panel);
		frame.add(textfield);
		frame.setVisible(true);

		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Calculadora calc = new Calculadora();
		
        
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numButtons[i] && textfield.getText().equals("0")) {
				textfield.setText("");
			}
			if(e.getSource() == numButtons[i]) {
				
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
		}
		if(e.getSource() == decBtn) {
			textfield.setText(textfield.getText().concat("."));
		}
		if(e.getSource() == addBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		if(e.getSource() == subBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if(e.getSource() == mulBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if(e.getSource() == divBtn) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if(e.getSource() == equBtn) {
			num2 = Double.parseDouble(textfield.getText());
			
			switch(operator) {
			case '+': 
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1 = result;
		}
		if(e.getSource() == clrBtn) {
			textfield.setText("0");
		}
		if(e.getSource() == delBtn) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i = 0; i < string.length() - 1; i++) {
				textfield.setText(textfield.getText() + string.charAt(i));
			}
		}
		if(e.getSource() == ngtBtn) {
			double x = Double.parseDouble(textfield.getText());
			x *= -1;
			textfield.setText(String.valueOf(x));
		}
		if(textfield.getText().equals("")) {
			textfield.setText("0");
		}
		
		
	}
	

}
