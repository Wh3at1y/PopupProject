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
			
			while(!isInteger(tempAge))
				{
					tempAge = myPopups.getAnswer("Type an Integer for your name please!");
				}
			
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
			
			while(!isDouble(tempWeight))
				{
					tempWeight = myPopups.getAnswer("Give me a double value for your weight!");
				}
			
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
			
			
			//We use try because if statement will crash, try will attempt to fix.
			try
				{
					//Checks to see if it is an Double
					double validDouble = Double.parseDouble(input);
					isDouble = true;
				}
			
			catch(NumberFormatException error)
				{
					//parse will only throw the NumberFormatException error, we only need 1 catch
					myPopups.displayResponse("");
				}
			
			//Once true, ends this try
			return isDouble;
		}
	}
