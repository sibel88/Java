public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {50, 2, 10, 8, 5, 40, 11, 29, 35, 44, 56, 7};
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minIndex]) {
                    minIndex = j;


                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
