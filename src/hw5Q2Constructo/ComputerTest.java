package hw5Q2Constructo;
/*
 My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in USA? Ans: false
 */
public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer=new Computer();// Default construe
		Computer computer1= new Computer("Apple", 800);
		Computer computer2=new Computer("Apple", "MacBook Air","MacOS Mojave", 800, 'A', true);
		Computer computer3=new Computer("microsoft" ,"HP", "Windows 10",800, 'A', true);

	}

}
