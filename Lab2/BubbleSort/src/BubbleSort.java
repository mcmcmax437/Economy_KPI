public class BubbleSort {

    static Integer[] array = {42, 16, 666, 15, 8, 777, 4, 108, 23};


    public static void main(String[] args) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    Integer greaterElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = greaterElement;
                }
            }
        }

        for (Integer i : array) {
            System.out.print(i + " ");
        }
    }
}