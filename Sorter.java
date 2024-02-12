/**
 * Sorter
 */
public class Sorter {

	public static void main(String[] args) {
		System.out.println("hello , Omar");

		//some comments

	}
	private static void selectionSort(int[] array) {
		int len = array.length;
		for (int i = 0; i < len - 1; i++) {

			int smallest = i;
			for (int j = i + 1; j < len; j++)
				if (array[j] < array[smallest])
					smallest = j;

			int temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
	}
}