package mm;

import java.util.SortedSet;
import java.util.TreeSet;

public class nn {
	public class TreSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s=new TreeSet();
		s.add(455);
		s.add(255);
		s.add(47);
		s.add(48);
		s.add(49);
		s.add(5);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(47));
		System.out.println(s.tailSet(47));
		System.out.println(s.subSet(48,255));

	}

}
}
