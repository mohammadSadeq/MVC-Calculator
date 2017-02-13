package calculater;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class view{
	public model calculator;
	private boolean numFlag;
	private double first,second;
	private String op;
	private JFrame frmCalculator;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		model n=new model();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view() {
		numFlag=false;
		op="";
		initialize();
		calculator = new model();
		try{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			
		}
		}
		

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 336, 420);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		result = new JTextField();
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setFont(new Font("Tahoma", Font.PLAIN, 16));
		result.setBackground(Color.WHITE);
		result.setEditable(false);
		result.setBounds(10, 11, 300, 42);
		frmCalculator.getContentPane().add(result);
		result.setColumns(10);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("7"));
					else{
						result.setText("7");
						numFlag=false;
					}}
		});
		b7.setBounds(30, 116, 60, 50);
		frmCalculator.getContentPane().add(b7);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("0"));
					else{
						result.setText("0");
						numFlag=false;
					}}
		});
		b0.setBounds(92, 277, 60, 50);
		frmCalculator.getContentPane().add(b0);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("9"));
					else{
						result.setText("9");
						numFlag=false;
					}
			}
		});
		b9.setBounds(155, 116, 60, 50);
		frmCalculator.getContentPane().add(b9);
		
		JButton btnMod_1 = new JButton("Mod");
		btnMod_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!result.getText().isEmpty())

				first=Double.parseDouble(result.getText());
	op="mod";
				numFlag=true;
			}
		});
		btnMod_1.setBounds(240, 277, 70, 50);
		frmCalculator.getContentPane().add(btnMod_1);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!numFlag)
				result.setText(result.getText().concat("1"));
				else{
					result.setText("1");
					numFlag=false;
				}
			}
		});
		b1.setBounds(30, 223, 60, 50);
		frmCalculator.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("2"));
					else{
						result.setText("2");
						numFlag=false;
					}
			}
		});
		b2.setBounds(92, 223, 60, 50);
		frmCalculator.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("3"));
					else{
						result.setText("3");
						numFlag=false;
					}
			}
		});
		b3.setBounds(155, 223, 60, 50);
		frmCalculator.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("4"));
					else{
						result.setText("4");
						numFlag=false;
					}
			}
		});
		b4.setBounds(30, 169, 60, 50);
		frmCalculator.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("5"));
					else{
						result.setText("5");
						numFlag=false;
					}
			}
		});
		b5.setBounds(92, 169, 60, 50);
		frmCalculator.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("6"));
					else{
						result.setText("6");
						numFlag=false;
					}}
		});
		b6.setBounds(155, 169, 60, 50);
		frmCalculator.getContentPane().add(b6);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					result.setText(result.getText().concat("8"));
					else{
						result.setText("8");
						numFlag=false;
					}}
		});
		b8.setBounds(92, 116, 60, 50);
		frmCalculator.getContentPane().add(b8);
		
		JButton bmult = new JButton("x");
		bmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!result.getText().isEmpty())

				first=Double.parseDouble(result.getText());

				op="mult";
				numFlag=true;
			}
		});
		bmult.setBounds(240, 116, 70, 50);
		frmCalculator.getContentPane().add(bmult);
		
		JButton bsub = new JButton("-");
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!result.getText().isEmpty())

				first=Double.parseDouble(result.getText());
	op="sub";
				numFlag=true;
			}
		});
		bsub.setBounds(240, 169, 70, 50);
		frmCalculator.getContentPane().add(bsub);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!result.getText().isEmpty())
				first=Double.parseDouble(result.getText());

				op="div";
				numFlag=true;}
		});
		bdiv.setBounds(240, 64, 70, 50);
		frmCalculator.getContentPane().add(bdiv);
		
		JButton bback = new JButton("\u2190");
		bback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText().substring(0, result.getText().length()-1));
			}
		});
		bback.setBounds(155, 64, 60, 50);
		frmCalculator.getContentPane().add(bback);
		
		JButton bC = new JButton("C");
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
			}
		});
		bC.setBounds(92, 64, 60, 50);
		frmCalculator.getContentPane().add(bC);
		
		JButton bCe = new JButton("CE");
		bCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("");
			}
		});
		bCe.setBounds(30, 64, 60, 50);
		frmCalculator.getContentPane().add(bCe);
		
		JButton badd = new JButton("+");
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!result.getText().isEmpty())

				first=Double.parseDouble(result.getText());
				op="add";
				numFlag=true;
			}
		});
		badd.setBounds(240, 223, 70, 50);
		frmCalculator.getContentPane().add(badd);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numFlag=true;		
				if(!result.getText().isEmpty())
				second=Double.parseDouble(result.getText());
				switch(op)
				{
				case "add":
					result.setText(calculator.add(first, second)+"");
					op="";
					break;
				case "div":
					if(second==0)
						result.setText("INFINITY");
					else
					result.setText(calculator.div(first, second)+"");
					op="";
			

					break;
				case "mult":
					result.setText(calculator.mult(first, second)+"");
					op="";
				

					break;
				case "mod":
					result.setText(calculator.mod(first, second)+"");

					op="";

					break;
				case "sub":
					result.setText(calculator.sub(first, second)+"");

					op="";

					break;
					default:
						
						break;
				}
			}
		});
		equal.setBounds(102, 330, 123, 42);
		frmCalculator.getContentPane().add(equal);
		
		JButton bdot = new JButton(".");
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!numFlag)
					if(result.getText().equals(""))
						result.setText("0.");
					else
					result.setText(result.getText().concat("."));
					else{
						result.setText("0.");
						numFlag=false;
					}
			}
		});
		bdot.setBounds(30, 277, 60, 50);
		
		frmCalculator.getContentPane().add(bdot);
		
		JButton button = new JButton("- +");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(result.getText().startsWith("-"))
					result.setText(result.getText().substring(1, result.getText().length()));
				else
				result.setText("-"+result.getText());
			}
		});
		button.setBounds(155, 277, 60, 50);
		frmCalculator.getContentPane().add(button);
	}
}
