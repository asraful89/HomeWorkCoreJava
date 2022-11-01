package hw3JavaVariables;

public class Aboutme {


	 public String myfirstname;  //variable declare
	 
	public String myname ="Asraf"; // variable initialize 
	public byte age = 30;
	public short rolnum  = 718;
	public int housenum =  1187373;
	public long phonenumber = 7187373487l; // we have to use l, at the end of long value
	public float myHeight = 5.73f; // we have to use f, at the end of float value
	public double myGrade = 2.8676573457384;
	public char haircolor = 'D';
	public boolean fromsylhet = true;
	public static void main(String[] args) {
		Aboutme obj = new Aboutme();
		
		System.out.println(obj.myname); // variable initialize
		System.out.println(obj.age);//variable initialize
		System.out.println(obj.rolnum); //variable initialize
		System.out.println(obj.phonenumber);//variable initialize
		System.out.println(obj.myGrade);//variable initialize
	 System.out.println(obj.myname + obj.age);
	 System.out.println("my name:" + obj.myname + obj.housenum + "haircolor"+ obj.haircolor );
		
		
		}
	

	}


