package Aqui;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create object of the class - object.method
		ArrayList<String> lista =  new ArrayList();
		lista.add("saul");
		lista.add("leyva");
		lista.add("gonzalez");
		System.out.println(lista.get(0));
		System.out.println("************************");
		
		//printing array list
		for(int i = 0; i < lista.size();i++)
		{
			System.out.println(lista.get(i));
		}
		
		
		System.out.println("************************");
		for(String val :lista)
		{
			System.out.println(val);
		}
	}

}
