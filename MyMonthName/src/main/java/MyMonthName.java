import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber = 0;
        boolean validInput = false;

        // Запрашиваем ввод, пока пользователь не введет корректное число
        while (!validInput) {
            try {
                System.out.println("Введи номер месяца (1–12):");
                monthNumber = scanner.nextInt();

                // Проверяем, что число находится в диапазоне от 1 до 12
                if (monthNumber >= 1 && monthNumber <= 12) {
                    validInput = true;
                } else {
                    System.out.println("Ошибка: введено некорректное число. Введи число от 1 до 12.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ты ввёл не число. Пожалуйста, введи целое число.");
                scanner.next(); // Очищаем буфер сканера
            }
        }

        // Используем switch для определения названия месяца
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
        }

        scanner.close();
    }
}