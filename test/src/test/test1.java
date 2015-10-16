package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hiiiii");
		int[] input = new int[] { /* 50,1,0,0,0}; */1, 0, 4, 5, 2, -10, 0, 9, 0, 0, 26, 20, 8, 0 };
		test1 t = new test1();
		t.moveZeros(input);
		printArray(input);

	}

	void moveZeros(int[] input) {
		if (input == null || input.length == 0) {
			System.out.println("Empty or null array");
			return;
		}
		int lastindexOfZero = input.length - 1;
		int j = input.length - 1;
		while (j >= 0) {

			while (input[j] == 0 && j >= 0) {
				j--;
			}
			if (j < 0) {
				break;
			}
			if (lastindexOfZero != j) {
				swap(input, j, lastindexOfZero);
			}
			lastindexOfZero--;
			j--;
		}

	}

	void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
	}

}
