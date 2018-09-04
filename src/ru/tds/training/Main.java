package ru.tds.training;

import java.util.Scanner;

/**
 * Класс, в котором реализовано умоножение двух целых чисел без использования операции умножения.
 * А также замерено время выполнения этой операции.
 *
 * @author Трушенков Дмитрий 15ИТ18
 */
public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        int firstNumber = scan.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scan.nextInt();

        long startTime = System.currentTimeMillis();

        System.out.println("Результат:" + getResult(firstNumber, secondNumber));

        System.out.println("Время выполнения: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    /**
     * Метод для выполнения операции умножения двух чисел, не используя операцию умножения.
     *
     * @param firstNumber  первый множитель
     * @param secondNumber второй множитель
     * @return произведение
     */
    private static int getResult(int firstNumber, int secondNumber) {

        boolean isNegative = false;

        if (firstNumber == 0 || secondNumber == 0) {
            return 0;
        }

        if (firstNumber < 0 && secondNumber > 0 || firstNumber > 0 && secondNumber < 0) {
            isNegative = true;
        }

        if (firstNumber < 0) {
            firstNumber = -firstNumber;
        }

        if (secondNumber < 0) {
            secondNumber = -secondNumber;
        }

        if (secondNumber > firstNumber) {
            switchNumbers(firstNumber, secondNumber);
        }

        int result = 0;

        for (int i = 0; i < secondNumber; i++) {
            result += firstNumber;
        }
        return isNegative ? -result : result;
    }

    /**
     * Метод меняет два числа местами в целях оптимизации в дальнейшем для использовании в цикле сложения чисел.
     *
     * @param firstNumber  первое число
     * @param secondNumber второе число
     */
    private static void switchNumbers(int firstNumber, int secondNumber) {
        System.out.println("Меняем два числа местами...");
        int tmp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tmp;

//        System.out.println("Сейчас первое число стало: " + firstNumber + ", 2 число: " + secondNumber);
    }
}
