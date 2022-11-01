package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean Programer;
	public float grade;

		public Student () {
System.out.println(" This is from default Constructor of Student class.");	
	}
		public Student(String stName, int stID, char sex, boolean programer, float grade) {
			super();
			this.stName = stName;
			this.stID = stID;
			this.sex = sex;
			this.Programer = programer;
			this.grade = grade;
			System.out.println("String stname:"  + stName +"stID:" + stID + "sex"  + sex + "prog" +programer  +   "grade" + grade);
		}
	
		}


