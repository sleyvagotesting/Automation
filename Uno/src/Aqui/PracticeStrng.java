package Aqui;

public class PracticeStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Object 
		String name = new String ("Saul Leyva Gonzalez");
		
		//other object after created first object
		String name2 = "Saul Leyva Gonzalez";
		
		//split a String
		String[] splittArray=name2.split(" ");
		//print results
		System.out.println(splittArray[0]);
		System.out.println(splittArray[1]);
		System.out.println(splittArray[2]);
	}

}
