package input.model;

public class Thing
	{
		private String name;
		private int age;
		private double weight;
		
		public Thing()
		{
			age = -99;
			weight = -0.0045;
			name = "";
		}
		
		public Thing(String name, int age, double weight)
		{
			this.age = age;
			this.name = name;
			this.weight = weight;
		}
		
		public String toString()
		{
			String personInfo = "Your name is " + name + ", you are " + age + " years old and you weigh " + weight + ".";
			
			return personInfo;
		}
	}
