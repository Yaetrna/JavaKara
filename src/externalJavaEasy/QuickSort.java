import javakara.JavaKaraProgram;
public class QuickSort extends JavaKaraProgram {
	int getNumber(int y) {
		int length = 0;
		for (int x = 0; x < world.getSizeX(); x++) {
			if (world.isLeaf (x, y)) {
				length++;
			}
		}
		return length;
	}
	void showNumbers (int[] numbers) {
		for (int y = 0; y < world.getSizeY(); y++) {
			for (int x = 0; x < world.getSizeX(); x++) {
				world.setLeaf (x, y, (x < numbers[y]));
			}
		}
		tools.checkState();
	}
	void quickSort(int[] numbers, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(numbers, low, high);
			quickSort(numbers, low, partitionIndex - 1);
			quickSort(numbers, partitionIndex + 1, high);
		}
	}
	int partition(int[] numbers, int low, int high) {
		int pivot = numbers[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (numbers[j] <= pivot) {
				i++;
				swap(numbers, i, j);
			}
		}
		swap(numbers, i + 1, high);
		return i + 1;
	}
	void swap (int[] numbers, int index1, int index2) {
		int temp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
	}
	public void myProgram() {
		int[] numbers = new int[world.getSizeY()];
		for (int y = 0; y < world.getSizeY(); y++) {
			numbers[y] = getNumber(y);
		}
		quickSort(numbers, 0, numbers.length - 1);
		showNumbers(numbers);
	}
}
