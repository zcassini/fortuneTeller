package fortuneTeller;

import java.util.Map;

/**
 * @author Zac Cassini
 *
 */
public class Person {
	String firstName;
	String lastName;
	int age;
	int birthMonth;
	String favoriteColor;
	int numberOfSiblings;
	int yearsUntilRetirement;
	String vacationHomeLocation;
	String modeOfTransportation;
	int bankBalance;
	
	Map<Integer, String>  vacationHomeLocationMap = Map.of(0, "Paris, Kentucky"
														  ,1, "Paris, Ohio"
														  ,2, "Paris, Texas"
														  ,3, "Paris, France");
	
	Map<String, String> modeOfTransportationMap = Map.of("red",    "Honda Rebel"
														,"orange", "Moto Ural CT"
														,"yellow", "Harley Sporster"
														,"green",  "Moto Guzzi Griso"
														,"blue",   "Moto Guzzi California"
														,"indigo", "Aprillia Tuono"
														,"violet", "Ducati Monster");
	
	
	public String firstName() {
		return firstName;
	}
	public void firstName(String firstName) {
		this.firstName = firstName;
	}
	public String lastName() {
		return lastName;
	}
	
	public void lastName(String lastName) {
		this.lastName = lastName;
	}
	public int age() {
		return age;
	}
	public void age(int age) {
		this.age = age;
	}
	public int birthMonth() {
		return birthMonth;
	}
	public void birthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String favoriteColor() {
		return favoriteColor;
	}
	public void favoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	public int numberOfSiblings() {
		return numberOfSiblings;
	}
	public void numberOfSiblings(int numberOfSiblings) {
		this.numberOfSiblings = numberOfSiblings;
	}
	public void update() {
		this.updateBankBalance();
		this.updateModeOfTransportation();
		this.updateVacationHomeLocation();
		this.updateYearsUntilRetirement();
	
	}
	public String fortune() {
		this.update();
				
		return this.firstName() + " " + this.lastName() + " will retire in " + this.yearsUntilRetirement() + " years with $" +
				this.bankBalance + " in the bank, at home in " + this.vacationHomeLocation() + ", and travel by " +
				this.modeOfTransportation() + ".";
	}
	
	public int yearsUntilRetirement() {
		return yearsUntilRetirement;
	}
	
	public void updateYearsUntilRetirement() {
		yearsUntilRetirement =  this.age + (this.age % 2 == 0 ? 13 : 14); 
	}
	
	public String vacationHomeLocation() {
		return vacationHomeLocation;
	}
	
	public void updateVacationHomeLocation() {
		this.vacationHomeLocation = this.numberOfSiblings < 0 ?  "Pittsburgh, Pennslyvania" : this.vacationHomeLocationMap.get(this.numberOfSiblings());
	}
	
	public String modeOfTransportation() {
		return modeOfTransportation;
	}
	
	public void updateModeOfTransportation() {
		this.modeOfTransportation = this.modeOfTransportationMap.get(this.favoriteColor());
	}
	
	
	public void updateBankBalance() { 
		switch (this.birthMonth) {
		case 1:
		case 2:
		case 3:
		case 4:
			this.bankBalance = 100;
			break;
			
		case 5:
		case 6:
		case 7:
		case 8:
			this.bankBalance = 1000;
			break;
			
		case 9:
		case 10:
		case 11:
		case 12:
			this.bankBalance = 10000;
			break;
			
		default:
			this.bankBalance = 0;
		}
		
	}
	
}

