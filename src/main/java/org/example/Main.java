package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Попытка выполнить код, который может выбросить исключение
            int result = divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            // Обработка ArithmeticException, которое может быть выброшено при делении на ноль
            System.out.println("Ошибка: Невозможно делить на ноль!");
        } catch (Exception e) {
            // Обработка всех остальных исключений
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            // Этот блок выполняется в любом случае, независимо от того, было ли исключение или нет
            System.out.println("Блок finally выполнен.");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}