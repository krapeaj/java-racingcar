package car.race;

public class Car {
	private String name;
	private int position;	
	
	public Car(String name) {
		this.name = name;
	}

	public int runOnce(int randNum){
		if(randNum > 4){
			this.position++;
		}
		return this.position;
	}
	
	public int getPosition() {
		return this.position;
	}

	public String getName() {
		return this.name;
	}
}	
