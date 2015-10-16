package test;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}

	public static int m1() {
		try {
			int j = 1 / 0;
			System.exit(1);
			return 0;
		} catch (Exception e) {
			return 1;
		} finally {
			return 2;
		}
	}
}
