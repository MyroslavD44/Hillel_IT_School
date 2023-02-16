import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть числа, розділені комами: ");
        String input = scanner.nextLine();
        String[] numbersString = input.split(",");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i].trim());
        }

        System.out.println("Початковий масив: " + Arrays.toString(numbers));


        Arrays.sort(numbers);
        System.out.println("Відсортовано за зростанням: " + Arrays.toString(numbers));


        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("Відсортовано за спаданням: " + Arrays.toString(numbers));

        int[] sortedNumbers = new int[numbers.length];
        int left = 0;
        int right = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sortedNumbers[i] = numbers[left];
                left++;
            } else {
                sortedNumbers[i] = numbers[right];
                right--;
            }
        }
        System.out.println("Відсортовано від країв до середини: " + Arrays.toString(sortedNumbers));
    }
}



