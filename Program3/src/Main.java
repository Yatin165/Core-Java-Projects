import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(12, "Kartik", 12000);
		Employee e2 = new Employee(13, "Kuldeep", 8000);
		Employee e3 = new Employee(17, "Nitin", 9000);
		Employee e4 = new Employee(19, "Akarsh", 15000);

		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);

		System.out.println(set);

		set.stream().filter(e -> e.getSalary() < 10000).forEach((e) -> {
		    e.setSalary(e.getSalary() + 5000);
		    System.out.println(e);
		});
		
	
		/*	for (Employee employee : newSet) {
			employee.setSalary(employee.getSalary() + 5000);

		}*/
		//System.out.println(newSet);
	}

}
