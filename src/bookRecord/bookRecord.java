package bookRecord;

import java.util.HashSet;

interface record {
	public void add(String title);
	public String total();
	public int size();
}

public class bookRecord implements record{
	private HashSet<String> set = new HashSet<>();
	public bookRecord() {}
	
	public void add(String title) {
		set.add(title);
	}
	
	public String total() {
		StringBuilder list = new StringBuilder();
		for(String x: set) {
			list.append(x + "\n");
		}
		
		return list.toString();
	}
	
	public int size() {
		int size = set.size();
		return size;
	}
}
