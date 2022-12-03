
public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//*1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.		
		int [] ages = {3, 9, 23, 64, 2, 8, 93};
		
		
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
			//(i.e. do not use ages[7] in your code). Print the result to the console. 
		
		System.out.println("question 1 a: " + (ages[ages.length-1] - ages[0]));

		
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			int [] ages2 = {3, 9 , 23, 64, 2, 8 , 93, 20};
			System.out.println("question 1 b: " + "" + (ages2[ages.length-1] - ages2[0]));
			
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
				int total = 0;
				for (int i = 0 ; i < ages.length; i++) {
					total += ages[i];
				}
				System.out.println("question 1 c: " + "" +  (total/ages.length));
		
//2* Create an array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
				
				String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
			//a.  Use a loop to iterate through the array and calclulate the average number of letters per name.
				// Print the result to the console.
				
				double average = 0;
				for (int k = 0; k < names.length; k++) {
					average += names[k].length();
				}
		System.out.println("Question 2a: average number of letters per name " + total/names.length);
			//b.  use a loop to iterate through the array and calculate the average number of letters per name. 
				// print the reuslt to the console.
		int total2=0;
		for (int counter = 0; counter < names.length; counter++) {
			total2 +=names[counter].length();
		}
		System.out.println("Question 2b: " + "Total length of array is: " + total2);
		
		System.out.println("Question 2b: the average number of letters per name: " + total2/names.length);

//* 2b use a loop to iterate through the array and concat all the names together, separated by spaces
	
	String concat = "";
	for (int i = 0; i<names.length; i++) {
		concat += names[i] + " ";
	}
	System.out.println("ACTUAL 2B " + concat);
		
//* 3.  How do you access the last element of any array?
	System.out.println("Question 3: access last element of any array ")	;
	System.out.println(names.length-1);
		
		System.out.println(names[5]);
		
		System.out.println("Question 3: the last element of the array is " +names[names.length-1]);
		
//*4.  How do you access the first element of any array?
		System.out.println("Question 4: How do you access the first element? " +names[0]);
		
		
		
//*5.  Create a new array of int called nameLengths.  Write a loop to iterate over the previously created names array
		//and add the length of each name to the nameLengths array
		
	int[] nameLengths = new int [names.length]; //names.length = parameter.  Just a number.  Integer value that you are declaring.
	
	//int count = names.length(); //.length = translate string to numerical value // the amount of elements in the array
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length(); //.length() = how you translate a string to a numerical value ... how many characters are in the string 

		System.out.println("Question 5: " + nameLengths[i]);
	}
	
	
// 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

	int totalQ6 = 0;
	for (int i = 0; i < nameLengths.length; i++) { 
		totalQ6 += nameLengths[i]; 
	
	}

	System.out.println("Question 6: " + totalQ6);

// * 7  Write a method that takes a String, word and an int n as arguments and returns the word concat to itself n number of times 
	String nathan = repeatWord("Nathan", 3);
	System.out.println(nathan);
System.out.println(repeatWord("George",2)); // shorter way to do this.

//* 8 Write a method that takes two Strings, firstName and lastName and returns a full name (the full name should be the first and the last name as a String separate by a space)

System.out.println(makeFullName("Nathan", "Detroit"));


//*9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
System.out.println("Prompt 9 " + isGreaterThan100(ages));


//*10	Write a method that takes an array of double and returns the average of all the elements in the array.

double[] doubles10 = {45.7, 30.2, 67.3};
System.out.println("Question 10 " + calculateAverage(doubles10));

//*11 Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
	//*is greater than the average of the elements in the second array.
double [] ages3 = {30, 9, 54, 65};
double [] ages4 = {16, 3, 33, 56};
System.out.println("Question 11: " + isFirstArrayGreater(ages3, ages4));

//*12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//			and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

boolean isHotOutside = true;
double moneyInPocket = 12.50;
System.out.println("Question 12: " + willBuyDrink (isHotOutside, moneyInPocket));

//*13 create a method of your own that solves a problem.  In comments, write what the method does and why you created it.
double bill = 10.97;
System.out.println("Question 13: " + calculateTip(bill, bill));
	} // END OF MAIN
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------//

//*13 ----------Method -----------------

public static double calculateTip (double bill, double total) {
	double tipPercent = .18;
	return total = bill * tipPercent;
}

	
//*12 ------------Method---------------

public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside == true && moneyInPocket > 10.50)
		return true;
	else
		return false;
}
	

//*11 --------Method-----------
	public static boolean isFirstArrayGreater (double[] a, double[] b) {
		double averageA = calculateAverage(a);
		double averageB = calculateAverage(b);
		if (averageA > averageB) {
			return true;
		}
		else {
			return false;
		}
	}
//*10 ------Method-------
	public static double calculateAverage (double[] array10) {
		double sum = 0;
		for (double number : array10) {
			sum+= number;
	}
	return sum/array10.length;}
//*7 -----Method ------	

	public static String repeatWord (String word, int num){ //(String word , int num) -- this declares the variables already.
		
	String basket = "";
	for (int j = 0; j< num; j++) {
		basket+= word;
	}
	return basket;
	}
//*8 ------ Method --------
public static String makeFullName(String firstName, String lastName) {

	return(firstName + " " + lastName);
}

//*9 ------------------------Method ----------------------
public static boolean isGreaterThan100 (int[] numbers) {

	int sum = 0;
	for (int number : numbers) {
		sum+=number;
	}
	if (sum > 100)
		return true;
	else
		return false;
}



} // end of class
