package input.model;

/**
 * Has code for the user's input information, including Setters and Getters.
 * @author smon7958
 * @version 1.0
 */

public class Thing
	{
		/**
		 * Set information, or defaults.
		 */
		
		private String name;
		private int age;
		private double weight;
		
		public Thing()
		{
			age = -99;
			weight = -0.0045;
			name = "";
		}
		
		/**
		 * 
		 * @param name : gets the user's name and shows.
		 * @param age : gets the user's age and shows.
		 * @param weight : gets the user's weight and shows.
		 */
		
		public Thing(String name, int age, double weight)
		{
			this.age = age;
			this.name = name;
			this.weight = weight;
		}
		
		public String getName() {return name;}
			
		public int getAge() {return age;}

		public double getWeight() {return weight;}
		
		public void setName(String name) {this.name = name;}
		
		public void setAge(int age) {this.age = age;}

		public void setWeight(double weight) {this.weight = weight;}
		
		/**
		 * Returns a string object describing the Thing and its data members.
		 * Shows the variables in a sentence to the user.
		 */
		public String toString()
		{
			String personInfo = "Your name is " + name + ", you are " + age + " years old and you weigh " + weight + ".";
			
			return personInfo;
		}
	}
