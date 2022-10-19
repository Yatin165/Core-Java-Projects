import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(12, "Kartik", 25000);
		Employee e2 = new Employee(13, "Kuldeep", 24000);
		Employee e3 = new Employee(17, "Nitin", 30000);
		Employee e4 = new Employee(19, "Akarsh", 20000);
		Employee e5 = new Employee(10, "Kuldeep", 22000);
		Employee e6 = new Employee(19, "Yatin", 25000);

		Map<Employee, String> emp = new LinkedHashMap<>();
		emp.put(e2, "Telus");
		emp.put(e1, "TCS");
		emp.put(e4, "Infosys");
		emp.put(e3, "TechMahindra");
		emp.put(e6, "Wipro");
		emp.put(e5, "Microsoft");

		
		System.out.println(emp);

	}

}
