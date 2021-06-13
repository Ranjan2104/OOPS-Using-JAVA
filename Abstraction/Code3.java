public class scotter implements i1, i2{ 
	
	public static void main(String[] args) {
		scotter s = new scotter();
		s.show();
	}

	@Override
	public void show() {
		System.out.println();
	}

	@Override
	public void display() {
		System.out.println();
	}
}
interface i1 {
	public void show();
}
interface i2 {
	public void display();
}