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

    private static int result;

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        int firstNumber = scan.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scan.nextInt();

        long startTime = System.currentTimeMillis();

        /**
         * Если первое и второе число - положительные
         */
        if (firstNumber > 0 && secondNumber > 0) {
            getResult(firstNumber, secondNumber);
        }

        /**
         * Если первое и второе число- - отрицательные
         */
        if (firstNumber < 0 && secondNumber < 0) {
            firstNumber = -firstNumber;
            secondNumber = -secondNumber;
            getResult(firstNumber, secondNumber);
        }

        /**
         * Если первое число положительное, а второе число отрицательное
         * или если первое число отрицательное, а второе число положительное
         */
        if (firstNumber > 0 && secondNumber < 0) {
            firstNumber = -firstNumber;
            secondNumber = -secondNumber;
            getResult(firstNumber, secondNumber);
        } else if (firstNumber < 0 && secondNumber > 0) {
            firstNumber = -firstNumber;
            secondNumber = -secondNumber;
            getResult(secondNumber, firstNumber);
        }

        System.out.println("Результат:" + result);

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
        for (int i = 0; i < secondNumber; i++) {
            result += firstNumber;
        }
        return result;
    }
}
