import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Player p1 = new Player(45, "Dhoni");
		Player p2 = new Player(47, "Kohli");
		Player p3 = new Player(56, "Kuldeep");
		Player p4 = new Player(98, "Aakarsh");
		Player p5 = new Player(35, "Pandya");
		
		//Set<Player> set = new TreeSet<>((x,y) -> x.getScore() - y.getScore());
		Set<Player> set = new TreeSet<>((x,y) -> y.getScore() - x.getScore());
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		
		System.out.println(set);
		System.out.println(p4.getScore());
		Player player = set.stream().max((x,y) -> x.getScore() - y.getScore()).get();
		//System.out.println(player);
			
		
	}

}
