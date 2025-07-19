package com.CodeDMS;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub+
		
		int marks = 85;
		
		if(marks >=90) {
			System.out.println("Grade: A");
		}
		else if(marks >=70){
			System.out.println("Grade: B");
			
		}
		else if(marks >=60) {
			System.out.println("Grade: c");
		}
		else if(marks >=40) {
			System.out.println("Grade: D");
		}
		else {
			System.out.println("Fail");
		}

	}

}
