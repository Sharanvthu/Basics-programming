
public interface Person {
	void work();
	

}
class  Solution implements Person{

	@Override
	public void work() {
		System.err.println("working");
		
	}
	public static void main(String[] args) {
		Solution s=new Solution();
		s.work();
	}
	
}