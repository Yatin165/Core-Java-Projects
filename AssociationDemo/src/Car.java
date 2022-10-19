
public class Car {
	private int carno;
	private Engine engine;
	
	Car(int carNo, Engine eng){
		this.carno = carNo;
		this.engine = eng;
	}

	@Override
	public String toString() {
		return "Car [carno=" + carno + ", engine=" + engine + "]";
	}

}
