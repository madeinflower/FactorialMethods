public class FactorialIterative {

    // Итеративный метод вычисления факториала
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Умножаем результат на текущее значение
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " (итеративно): " + factorialIterative(number));
    }
}
