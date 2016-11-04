import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class TestErgodict{
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		Iterator<String> iter = arrayList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}//用Iterator进行遍历
		for (int i = 0 ; i < arrayList.size() ; i++) {
			System.out.println(arrayList.get(i));
		}//用Size进行遍历
		ListIterator<String> iter1 = arrayList.listIterator();
		while(iter1.hasNext()){
			System.out.println(iter1.next());
		}
		while(iter1.hasPrevious()){
			System.out.println(iter1.previous());
		}//用ListIterator对List进行正反向遍历
		for (String a : arrayList) {
			System.out.println(a);
		}//用foreach进行遍历
	}
}