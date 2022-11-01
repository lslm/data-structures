public class Main {
    public static void main(String[] args) {
        Person p = new Person("Lucas", 25);

        int[] array = {2, 4, 5, 7, 8, 11};
        System.out.println(binarySearch(array, 2));
    }

    public static int binarySearch(int[] array, int item) {
        int startIndex = 0;
        int lastIndex = array.length - 1;

        while (startIndex <= lastIndex) {
            int middleIndex = (startIndex + lastIndex) / 2;

            if(item < array[middleIndex]) {
                lastIndex = middleIndex - 1;
            }
            else if (item > array[middleIndex]) {
                startIndex = middleIndex + 1;
            }
            else {
                return middleIndex;
            }
        }

        return -1;
    }

    public static int naiveSearch(int[] array, int item) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] > item || array[i] == item)
                return i;
        }

        return n;
    }
}
