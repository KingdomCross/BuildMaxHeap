// Alex Chheng
public class BuildMaxHeap {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Max Heap Array:");
        buildMaxHeap(array);
        printArray(array);
        System.out.println("\n\nHeight: " + (int) (Math.log(array.length) / Math.log(2)));
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void buildMaxHeap(int[] array) {
        int heapSize = array.length;
        for (int i = (heapSize / 2) - 1; i >= 0; i--) {
            maxHeapify(array, i);
        }
    }

    public static void maxHeapify(int[] array, int currentIndex) {
        int parentIndex; // parent
        int leftIndex = (2 * currentIndex) + 1; // 2 * currentIndex yields an even node index for left child
        int rightIndex = (2 * currentIndex + 1) + 1; // 2 * currentIndex + 1 yields an odd node index right child

        if (leftIndex <= array.length - 1 && array[leftIndex] > array[currentIndex]) {
            parentIndex = leftIndex;
        } else {
            parentIndex = currentIndex;
        }
        if (rightIndex <= array.length - 1 && array[rightIndex] > array[parentIndex]) {
            parentIndex = rightIndex;
        }
        if (parentIndex != currentIndex) {
            int temp = array[currentIndex];
            array[currentIndex] = array[parentIndex];
            array[parentIndex] = temp;

            maxHeapify(array, parentIndex);
        }
    }
}
