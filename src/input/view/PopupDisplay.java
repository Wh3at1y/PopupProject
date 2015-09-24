/**
 * This class provides popups for input and output.
 * 
 * @Author Sam Montoya
 * Version 1.0 : 9/24/15
 */
package input.view;

import javax.swing.JOptionPane;

public class PopupDisplay
	{

		public String getAnswers(String input)
		{
			String answer = "";
			
			answer = JOptionPane.showInputDialog(null, input);
			
			return answer;
		}
		
		public void displayResponse(String input)
		{
			JOptionPane.showMessageDialog(null, input);
		}
		
	}
