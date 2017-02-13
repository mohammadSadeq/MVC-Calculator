package calculater;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
private	double firstNumber;
private	double secondNumber;
private	double result;
private model m;
private view v;

public Controller(model m,view v){
	this.m=m;
	this.v=v;
	
	v.equal.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			v.numFlag=true;		
			firstNumber=v.getFirstNumber();
			if(!v.result.getText().isEmpty())
				secondNumber=Double.parseDouble(v.result.getText());
			switch(v.getOp())
			{
			case "add":
				v.result.setText(m.add(firstNumber, secondNumber)+"");
				v.setOp("");
				break;
			case "div":
				if(secondNumber==0)
					v.result.setText("INFINITY");
				else
				v.result.setText(m.div(firstNumber, secondNumber)+"");
				v.setOp("");
		

				break;
			case "mult":
				v.result.setText(m.mult(firstNumber, secondNumber)+"");
				v.setOp("");
			

				break;
			case "mod":
				v.result.setText(m.mod(firstNumber, secondNumber)+"");

				v.setOp("");

				break;
			case "sub":
				v.result.setText(m.sub(firstNumber, secondNumber)+"");

				v.setOp("");

				break;
				default:
					
					break;
			}
		}
	});
	
}

}
