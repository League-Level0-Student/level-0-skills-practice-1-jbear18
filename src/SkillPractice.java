import java.net.URI;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

	SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
}
static void playVideo(String videoURL) {
	try {
		URI uri = new URI(videoURL);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
void skill1() {
	// Use pop-ups for the following. DO NOT use Eclipse short cuts to help you
	// Ask the user how many dimes they have
	String ans=JOptionPane.showInputDialog("How many dimes do you have?");
	int ansNumber=Integer.parseInt(ans);
	// Tell them how many cents they have (hint multiply by 10)
	JOptionPane.showMessageDialog(null, "You have"+ansNumber*10 +"cents");
	
	// Ask the user how tall they are (inches)
	String tall=JOptionPane.showInputDialog("How tall are you?");
	int tallNumber= Integer.parseInt(tall);
	// If they are shorter than 36 inches, tell them to eat their Wheaties
	if(tallNumber<26){
	
		
}
	else {
	JOptionPane.showMessageDialog(null, "Eat your WHEATIES!!");
	playVideo("https://www.youtube.com/watch?v=BmBh0NNEm00");

	}
	
}
void skill2() {
	// Write a loop to print every third number between 1 and 30 to the console
	// Do NOT use Eclipse short-cuts to help you
	
}

void skill3() {
	// Get a random number that is less than 20 and print it to the console
	
	// Get another random number that is less than 10 and print it to the console
	
	// Using a pop-up, tell the user the difference between the numbers
	// Hint: use subtraction
	
}
void skill4() {
	// In a pop-up, ask the user for the city they live in
	
	// If they answered "San Diego", tell them they live in Americ's Finest City
	
	// Otherwise, tell them to move to San Diego

	// Create a variable - cars - and initialize it to the number of cars your family has.
	// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
		
	// If there is 1 car, use a pop-up to display the make/model of the car
	
	// If there is more than 1 car, use a pop-up to display how many wheels the
	// cars have between them.
	
}
void skill5() {
	// In a pop-up, ask the user for the name of their school
	
	// In another pop-up, tell the user, that their school is a fantastic school. 
	// You must include the name of the school in the message.
	
}

}
