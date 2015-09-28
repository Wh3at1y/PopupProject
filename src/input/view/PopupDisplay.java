/**
 * This class provides popups for input and output.
 * 
 * @Author Sam Montoya
 * @version Version 1.0 : 9/24/15
 */
package input.view;

import javax.swing.JOptionPane;

public class PopupDisplay
	{
		/**
		 * Provides a popup box asking a question and allows the user to submit an answer or cancel.
		 * Returns the user's response as a string. (String answer)
		 * @param input = The supplied question for the popup.
		 * @return = The user's answer to the supplied question.
		 */

		public String getAnswer(String input)
		{
			String answer;
			
			answer = JOptionPane.showInputDialog(null, input);
			
			return answer;
		}
		
		/**
		 * Displays a popup box with a set string or what the user typed in.
		 * @param input = A set string from the coder or user. Only shows an OK button.
		 */
		
		public void displayResponse(String input)
		{
			JOptionPane.showMessageDialog(null, input);
		}
		
	}
