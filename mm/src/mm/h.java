package mm;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList I=new ArrayList();
		I.add(45);
		I.add(46);
		I.add(47);
		I.add(48);
		System.out.println(I);
		ListIterator itr=null;
		
		itr=I.listIterator();
		System.out.println("Elements in forward diraction");
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		System.out.println("Element in backward direction");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
			
		}

	}

}
