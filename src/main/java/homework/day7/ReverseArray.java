package homework.day7;

public class ReverseArray {
    public void main(String[] args) {
        ReverseArray reverse = new ReverseArray();
        int[] arrays = {2, 4, 6, 3, 4, 8, 3};
        int[] resultArray = reverse.reverseArray(arrays, 4);
        System.out.println(resultArray);

    }
    public int[] reverseArray(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                count++;
            }
        }
        int[] resultArray = new int[count];
        int number = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                resultArray[number] = array[i];
                number++;
            }

        }
        return resultArray;
    }
}