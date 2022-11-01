package hw5Q2Constructo;
 

public class Computer {
	public String brand;
	public String model;
	public String operatingsystem;
    public int price;
    public char grade;
    public boolean MadeinUSA;
    // 
    public Computer () {
    	System.out.println("This is from default Constructor of Computer class");
}
    // parameterize constructor
  public Computer(String brand, int price) {
  this.brand = brand;
  this.price = price;
 	System.out.println("brand" + brand + "price" + price);
  }
   public Computer(String brand,String model, String operatingsystem, int price,char grade,boolean MadeinUSA) {
	   this.brand=brand;
	   this.model=model;
	   this.operatingsystem=operatingsystem;
	   this.price=price;
	   this.grade=grade;
	   this.MadeinUSA=MadeinUSA;
	   System.out.println("My brand : "+brand+"\nModel: "+model+"\nOperating system: "+operatingsystem+"\nPrice: "+price+"\nGrade: "+grade+"\nMade in USA: "+MadeinUSA);
   
   }
 public Computer(String brand,String model, String operatingsystem, int price,char grade)  {
	   this.brand=brand;
	   this.model=model;
	   this.operatingsystem=operatingsystem;
	   this.price=price;
	   this.grade=grade;
	  

	   System.out.println("My brand : "+brand+"\nModel: "+model+"\nOperating system: "+operatingsystem+"\nPrice: "+price+"\nGrade: "+grade);
	   
}}