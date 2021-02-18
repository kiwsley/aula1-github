package application;

import java.util.Scanner;

import entitites.data;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		data [] vect = new data[10]; 
		
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		
		
		for (int i =1 ; i<=n; i++) {
			
			sc.nextLine();
			System.out.println("Rent #" + i + ":") ;
			System.out.println("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			
			int room = sc.nextInt();
			vect[room]=new data(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println( i + ": " + vect[i]);
			}
		}
		
		
		sc.close();
	}

}
