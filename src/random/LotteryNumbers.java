package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		String lottery ="";
		Random unknown = new Random();
	 	for(int number =0;number<5;number += 1) {
	 		
	 		int num = unknown.nextInt(60);
	 		lottery+= num;
	 		lottery+=" ";
	 	}
		System.out.println(lottery);
		JOptionPane.showMessageDialog(null, lottery, "Tottery Licket", JOptionPane.INFORMATION_MESSAGE);
	
	}

}
