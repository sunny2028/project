package file_handling;

public class DynamicArrayUse {

	public static void main(String[] args) {

		DynamicArray d = new DynamicArray();
		for (int i = 0; i <= 10; i++) {
			d.add(i);
			
		}
		d.set(11, 56);		
		while (!d.isEmpty())  {
			System.out.println(d.removeLast());
		}	
	}
}