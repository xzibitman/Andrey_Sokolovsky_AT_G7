package homework.day3;

public class SumOfNumbers {
    public static void main(String[] args) {

        int[] number = new int[]{12, 43, 67, 34, 126};
        int sum = 0;

        for (int n : number) {
            if (n % 3 == 0)

                sum += n;
        }

        System.out.println("Сумма = " + sum);

    }
}

