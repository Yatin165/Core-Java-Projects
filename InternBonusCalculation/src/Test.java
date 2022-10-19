
public class Test {

	public static void main(String[] args) {
		
		JavaIntern javaintern = new JavaIntern();
		javaintern.setInternId("ABC1245");
		javaintern.setInternName("Yatin");
		javaintern.setInternSalary(10000);
		System.out.println(javaintern);
		javaintern.addBonus();
		System.out.println("JavaIntern Salary after adding bonus" + javaintern);
		
		
		
		PythonIntern pythonintern = new PythonIntern();
		pythonintern.setInternId("NYTG544");
		pythonintern.setInternName("Yatin");
		pythonintern.setInternSalary(9000);
		System.out.println(pythonintern);
		pythonintern.addBonus();
		System.out.println("PythonIntern Salary after adding bonus " +  pythonintern);
		
		
		
	}

}
