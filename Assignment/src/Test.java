import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<>();
		ls.add(45);
		ls.add(12);
		ls.add(74);
		ls.add(32);
		System.out.println(ls);
		
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls);
	}

}
