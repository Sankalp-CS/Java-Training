package Pattern;

public class HoloDaimond {
	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <=n; i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1||j==n) {
					System.out.print("* ");
				}
			}
			System.out.println("  ");
		}
	}
}
