package hui;

import javax.swing.JOptionPane;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String num1 = JOptionPane.showInputDialog("Enter a number: ");
		//int num = Integer.parseInt(num1);
		//JOptionPane.showMessageDialog(null, "Number is " + num);
		
		//int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
		//int sum = age + num;
		//gPrint(num);		
		
		//String hold = "The sum of "+num1 +" and " + age +" is: " +sum;
		//gPrint(hold); 
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Num1: "));
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter num2"));
	
		String menu = "A-Add\nS-Subtract\nE-End";
		String select = JOptionPane.showInputDialog(null, menu+"\nChoose", null, JOptionPane.PLAIN_MESSAGE);
		String temp="";
		
		switch(select.charAt(0)){
			case 'A': case 'a':
					temp =""+ (age + num);
				break;
			
			case 'S': case 's':
					//temp = "" +(age - num);
					int i = 9;
					///////////////////////////////////////////////////////////////////////////////
					if(Integer.parseInt(temp = "" +(age - num)) >0) temp = ""+000 ;
					
				break;
			
			case 'E': case 'e':
					temp="Program terminating...";
				break;
			default: temp = "Invalid Value";
		}
		JOptionPane.showMessageDialog(null, temp, "result", JOptionPane.PLAIN_MESSAGE);
		
	}
	
	static void gPrint(Object j) {
		JOptionPane.showMessageDialog(null, j);
	}

}
