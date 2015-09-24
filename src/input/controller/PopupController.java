package input.controller;

import input.view.PopupDisplay;
import input.model.Thing;

public class PopupController
	{
		
		private PopupDisplay myPopups;
		private Thing myThing;
		
		public PopupController()
		{
			myPopups = new PopupDisplay();
		}
		
		public void start()
		{
			String name = myPopups.getAnswer("Type in your name");
			
			myPopups.displayResponse("You typed " + name);
			
			int age;
			String tempAge = myPopups.getAnswer("Type in your age");
			
			if(isInteger(tempAge))
				{
					age = Integer.parseInt(tempAge);
				}
			else
				{
					age = -12345678;
				}
			
			myPopups.displayResponse("Your age is " + age);
			
			double weight;
			String tempWeight = myPopups.getAnswer("Type in your weight");
			
			if(isDouble(tempWeight))
				{
					weight = Double.parseDouble(tempWeight);				
				
				}
			else
				{
					weight = -.9999;
				}
			
			myPopups.displayResponse("Your weight is " + weight);

			myThing = new Thing(name, age, weight);
			
			myPopups.displayResponse(myThing.toString());

		}
		
		private boolean isInteger(String input)
		{
			boolean isInt = false;
			
			try
				{
					int validInteger = Integer.parseInt(input);
							isInt = true;
				}
			
			catch(NumberFormatException error)
				{
					myPopups.displayResponse("You did not enter a valid interger :/");
				}
			
			return isInt;
		}
		
		private boolean isDouble(String input)
		{
			boolean isDouble = false;
			
			try
				{
					double validDouble = Double.parseDouble(input);
					isDouble = true;
				}
			
			catch(NumberFormatException error)
				{
					myPopups.displayResponse("");
				}
			return isDouble;
		}
	}
