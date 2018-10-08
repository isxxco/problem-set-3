
/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		ps3.dateFashion(5, 10);
		ps3.dateFashion(5, 5);
		ps3.dateFashion(2, 10);
		ps3.fizzString("fig");
		ps3.fizzString("dib");
		ps3.fizzString("fib");
		ps3.fizzString("abc");
		ps3.squirrelPlay(70, false);
		ps3.squirrelPlay(95, false);
		ps3.squirrelPlay(95, true);
	    ps3.fizzStringAgain(2); 
        ps3.fizzStringAgain(9); 
        ps3.fizzStringAgain(10); 
        ps3.fizzStringAgain(15);
        ps3.makeBricks(3, 1, 8);
        ps3.makeBricks(3 , 1, 9);
        ps3.makeBricks(3, 2, 10);
        ps3.loneSum(1, 2, 3);
        ps3.loneSum(3, 2, 3);
        ps3.loneSum(3, 3, 3);
        ps3.luckySum(1, 2, 3);
        ps3.luckySum(1, 2, 13);
        ps3.luckySum(1, 13, 3);
        ps3.factorialWithFor(3);
        ps3.factorialWithFor(4);
        ps3.factorialWithFor(5);
        ps3.factorialWithWhile(3);
        ps3.factorialWithWhile(4);
        ps3.factorialWithWhile(5);
        ps3.isPrime(1);
        ps3.isPrime(2);
        ps3.isPrime(17);
        ps3.isPrime(144);
	}
		
	public void dateFashion(int you, int date) {
		if (you <=2 || date <= 2)	{
			System.out.println("NO");
		} else if (you >= 8 || date >= 8)	{
			System.out.println("YES");
		} else {
			System.out.println("MAYBE");
		}
	}
	
	public void fizzString(String str) {
		char left = str.charAt(0);
		char end = str.charAt(str.length() - 1);
		if (left == 'f' && end == 'b')	{
			System.out.println("FIZZBUZZ");	
		}	else if (left == 'f')	{
			System.out.println("FIZZ");
		}	else if (end == 'b')	{
			System.out.println("BUZZ");
		}	else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (temp >= 60 && temp <= 90)   {
		    System.out.println("YES");
		}   else if (temp >= 90 && temp <= 100) {
		        if (isSummer == true)   {
		            System.out.println("YES");
		        }   else {
		            System.out.println("NO");
		        }
		}   else {
		    System.out.println("NO");
		}
	}
	
	public void fizzStringAgain(int n) {
		if (n % 3 == 0 && n % 5 == 0)   {
		    System.out.println("FIZZBUZZ!");
		}   else if (n % 3 == 0)    {
		    System.out.println("FIZZ!");
		}   else if (n % 5 == 0)    {
		    System.out.println("BUZZ!");
		}   else {
		    System.out.println(n + "!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		if ((5 * big) + small >= goal)  {
		    System.out.println("YES");
		}   else {
		    System.out.println("NO");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if (a == b && b == c) {
		    System.out.println(0);
		}   else if (b == c)    {
		    System.out.println(a);
		}   else if (a == c)    {
		    System.out.println(b);
		}   else if (a == b)  {
		    System.out.println(c);
		}   else {
		    System.out.println(a + b + c);
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if (a == 13)    {
		    System.out.println(b + c);
		}   else if (b == 13)   {
		    System.out.println(a);
		}   else if (c == 13)   {
		    System.out.println(a + b);
		}   else    {
		    System.out.println(a + b + c);
		}
	}
	
	public void factorialWithFor(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
		    fact  = fact * i;
		}
		System.out.println(n + "! = " + fact);
	} 
	
	public void factorialWithWhile(int n) {
		int i = 1;
		int fact = 1;
		while (i <= n)  {
		    fact = fact * i;
		    i++;
		}   System.out.println(n + "! = " + fact);
	}
	
	public void isPrime(int n) {
		if (n == 0 || n == 1) {
		    System.out.println("NOT PRIME");
		}   else if (n == 2)    {
		    System.out.println("PRIME");
		}	else {
		        for (int i = 2; i < n; i++)
		           {    if (n % i == 0)     {
		               System.out.println("NOT PRIME");
		               break;
		           }    else {
		               System.out.println("PRIME");
		               break;
		           }
		}
	}
}
}


