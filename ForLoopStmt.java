
public class ForLoopStmt {
	static int n=6;
	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
