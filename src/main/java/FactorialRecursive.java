public class FactorialRecursive {

    // Рекурсивный метод вычисления факториала
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1); // Рекурсивный вызов
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " (рекурсивно): " + factorialRecursive(number));
    }
}
