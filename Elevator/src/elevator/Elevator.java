package elevator;

public class Elevator {

	private int capacity;
	private int floor;
	private int totalFloor;
	private int people;

	public Elevator(int capacity, int floor, int totalFloor, int people) {

		this.capacity = capacity;
		this.floor = floor;
		this.totalFloor = totalFloor;
		this.people = people;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getTotalFloor() {
		return totalFloor;
	}

	public void setTotalFloor(int totalFloor) {
		this.totalFloor = totalFloor;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public void initialize(int capacidade, int totalandar) {

		if (this.floor == 0 && this.people == 0) {

			this.capacity = capacidade;
			this.totalFloor = totalandar;
			System.out.println("elevator initialized" + capacidade);
			System.out.println("elevator initialized" + totalandar);

		}

		else {

			System.out.println("Elevator not initialized");
			System.exit(0);
		}

	}

	public void addPerson(int entered) {

		int totalpeople = this.people + entered;

			if (totalpeople <= this.capacity) {
	
				this.people += entered;
				System.out.println("People add to elevator :" + entered);
			}
	
			else {
	
				System.out.println("Full Cap");
			}
	}

	public void exitPerson(int exit) {
		

		int totalpeople = this.people - exit;

			if (totalpeople > 0) {
	
				this.people -= exit;
	
				System.out.println("people leaving the elevator :" + exit);
	
			}
	
			else {
	
				System.out.println("Elevator empty");
	
				}
	}
	
	public void elevatorUp (int floor) {
		
		int totalFloor = this.floor += floor;
		
			if (totalFloor < this.totalFloor) {
						
				System.out.println("you are on the : " + totalFloor);
			}
			
			else {
				
				System.out.println("invalid floor: ");
				
			}
		
	}

}
