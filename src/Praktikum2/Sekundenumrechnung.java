package Praktikum2;

import java.util.Scanner;

public class Sekundenumrechnung {
	
	
	public static void main(String[] args){
		
	Scanner scanner = new Scanner(System.in);
	int eingabeZahl = scanner.nextInt();	// Zahl eingeben
	scanner.close();  
	
	int s =eingabeZahl; // Sekunden
	int m = (s/60) ; // Minuten
	int h = (m/60); // Stunden
	int d = (h/24); // Tage
	

	s= s - (m * 60); 
	m= m - (h*60);
	h= h- (d*24);
	
	
	String zeit = String.format ("%d Tage %d:%d:%d",d,h,m,s); // Ausgabe formatieren
	
	System.out.println(zeit); 	// Ausgabe
	
	}
}
