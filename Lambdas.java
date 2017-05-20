import java.util.*;

public class Lambdas{


	public enum Sex{
		MALE, FEMALE
	}
	
	static List<Lambdas> list = new ArrayList<>();
	String name;
	//LocalDate birthday;
	int birthYear;
	Sex gender;
	String emailAddress;
	
	public Lambdas(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
		list.add(this);
	}

	public int getAge(){
		return 2017 - birthYear;
	}

	public void printPerson(){

		System.out.printf("name: %s\nage: %d\ngender: %s\nemail: %s\n"
				, name, getAge(), gender, emailAddress);
	}
		
	public static void displayList(List<Lambdas> list){
		for(Lambdas l : list){
			l.printPerson();
			System.out.println();
		}
	}
}
