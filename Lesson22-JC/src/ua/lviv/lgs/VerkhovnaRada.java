package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerkhovnaRada {
	
	List VerkhovnaRada = new ArrayList();
	
	void AddFraction() {
		VerkhovnaRada.add(new Fraction(null));
	}
	void RemoveFraction(int i) {
		VerkhovnaRada.remove(i);
		System.out.println(VerkhovnaRada);
		}
	void showFractions() {
		for (int i = 0; i < VerkhovnaRada.size(); i++) {
			System.out.println(VerkhovnaRada.get(i));
		}
	}
	void getFraction(int i) {	
			System.out.println(VerkhovnaRada.get(i));
	}
	void addDeputy(int i) {
		((Fraction)VerkhovnaRada.get(i)).addDeputy();
	}
	void removeDeputy(int i) {
		System.out.println("Enter index of Deputy");
		Scanner scanner = new Scanner(System.in);
		int sc = scanner.nextInt();
		((Fraction)VerkhovnaRada.get(i)).removeDeputy(sc);
	}
	void removeDeputies(int i) {
		((Fraction)VerkhovnaRada.get(i)).removeAllDeputy();
	}
	
	void getAllGrafters() {	
		for (int i = 0; i < VerkhovnaRada.size(); i++) {
			((Fraction)VerkhovnaRada.get(i)).showGrafters();
		}
		
	}
	void getTheBiggestGrafter() {	
		for (int i = 0; i < VerkhovnaRada.size(); i++) {
			((Fraction)VerkhovnaRada.get(i)).MaxGraft();
		}
		
	}
	void showAllDeputies() {	
		for (int i = 0; i < VerkhovnaRada.size(); i++) {
			((Fraction)VerkhovnaRada.get(i)).showDeputy();
		}
		
	}
	@Override
	public String toString() {
		return "VerkhovnaRada [VerkhovnaRada=" + VerkhovnaRada + "]";
	}
	
	
	}


