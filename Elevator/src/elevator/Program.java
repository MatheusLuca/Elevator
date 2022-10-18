package elevator;

import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		System.out.println("Capacity: "); // capacidade do elevador
		int capacity = input.nextInt();
		
		
		System.out.println("floor: "); // andar atual
		int floor = input.nextInt();
		
		
		System.out.println("total floor: "); // total de andar
		int totalfloor = input.nextInt();
		
		System.out.println("People: "); // pessoas no elevador
		int people = input.nextInt();
		
		Elevator elevator = new Elevator(capacity, floor, totalfloor, people);
		
			
		System.out.println("add people to elevator? ");
		int peopleadd = input.nextInt();
		elevator.addPerson(peopleadd);
		System.out.println("" + elevator.getPeople());
		
		
		System.out.println("remove people to elevator");
		int peopleremove = input.nextInt();
		elevator.exitPerson(peopleremove);
		System.out.println("people left in the elevator " + elevator.getPeople());
		
		
		System.out.println("How many floors do you want to go up?");
		int floorUp = input.nextInt();
		elevator.elevatorUp(floorUp);
		
	}

}
