public class BubbleSort {
    public static void main(String[] args) {
        int[] bubblesort = {3, 10, 8, 90, 66, 45, 77};

        for (int i = 0; i < bubblesort.length; i++) {
            int temp = bubblesort[i];
            for (int j = 0; j < bubblesort.length; j++) {
                if (temp < bubblesort[j]) {
                    bubblesort[i] = bubblesort[j];
                    bubblesort[j] = temp;
                    temp = bubblesort[i];
                }
            }

        }
        for (int i = 0; i < bubblesort.length; i++) {
            System.out.println(bubblesort[i]);

        }
    }
}
