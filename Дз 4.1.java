import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Which shape do you want to draw?");
            System.out.println("1. Прямокутник");
            System.out.println("2. Трикутник ");
            System.out.println("3. Дзеркальний трикутник");
            System.out.println("4. Піраміда");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ведіть висоту:");
                    int height = scanner.nextInt();
                    System.out.println("Ведіть ширину:");
                    int width = scanner.nextInt();
                    drawRectangle(height, width);
                    break;
                case 2:
                    System.out.println("EВедіть висоту:");
                    height = scanner.nextInt();
                    drawRightTriangle(height);
                    break;
                case 3:
                    System.out.println("Ведіть висоту:");
                    height = scanner.nextInt();
                    drawReverseRightTriangle(height);
                    break;
                case 4:
                    System.out.println("Ведіть висоту:");
                    height = scanner.nextInt();
                    drawTriangle(height);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Хочете намалювати ще якусь фігуру ? (так/ні)");
            answer = scanner.next();
        } while (answer.equals("так"));
    }

    private static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawReverseRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawTriangle(int height) {
        int width = 2 * height - 1;
        for (int i = 1; i <= height; i++) {
            int stars = 2 * i - 1;
            int spaces = (width - stars) / 2;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}













