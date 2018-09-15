package ru.tds.training;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Класс, в котором написаны тесты для методов класса Main.
 * <p>
 * Date: 08.09.2018 (суббота)
 * Project name: Training4Course
 * Package name: ru.tds.training
 *
 * @author Трушенков Дмитрий 15ИТ18
 */
public class MainTest {

    /**
     * Test for method getResult(), which return the result of multiplying
     * two numbers without using the multiplication operation
     */
    @Test
    public void getResult() {

        int firstNumber = -5;
        int secondNumber = -2;

        int expectedValue = 10;

        int actualValue = Main.getResult(firstNumber, secondNumber);

        assertEquals(expectedValue, actualValue);

    }

    /**
     * Test for method moduleOfNumber(), which return module of number.
     */
    @Test
    public void moduleOfNumber() {

        int number = -5;

        int expectedValue = 5;
        int actualValue = Main.moduleOfNumber(number);

        assertEquals(expectedValue, actualValue);

    }

}