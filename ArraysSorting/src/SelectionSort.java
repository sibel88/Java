public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {50, 2, 10, 8, 5, 40, 11, 29, 35, 44, 56, 7};

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];

            for (int j = 0; j < array.length; j++) {

                if (array[j] < temp) {
                    array[i] = array[j];
                    array[j] = temp;
                    temp = array[j];

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
