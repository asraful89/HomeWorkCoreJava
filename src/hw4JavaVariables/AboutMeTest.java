package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
	AboutMe myinf = new AboutMe();
	myinf.Myname="Ashraful";
	myinf.age = 28;
	myinf.myrent = 1600;
	myinf.myphonenum = 7187373487l;
	myinf.myGrade = 3.5f;
	myinf.haircolor = 'D';
	myinf.Asian = true;
	myinf.aboutme(); 
	 System.out.println("/n--------------------------------------------------/n");

	 AboutMe myinf2 = new AboutMe();
		myinf2.Myname="Alex";
		myinf2.age = 40;
		myinf2.myrent = 100;
		myinf2.myphonenum = 218737348;
		myinf2.myGrade = 2.5f;
		myinf2.haircolor = 'B';
		myinf2.Asian = false;
		myinf2.aboutme(); 
	}

}
