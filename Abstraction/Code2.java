public class scotter implements i1{
	
	public static void main(String[] args) {
		scotter s = new scotter();
		s.show();
	}

	@Override
	public void show() {
		System.out.println();
	}
}
interface i1 {
	public void show();
}