
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Calculator calc = Calculator.instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка. Деление на ноль.");
        }
        /* Система выдаёт арифметическую ошибку, так как в строке 6 при вычитании
           значение b=0. В строке 7 java пытается разделить на 0 и выдаёт ошибку.
           Можно заменить тип всех переменных на Double, тогда ответом будет не ошибка,
           а бесконечно большое число. Либо ввести блок try - catch
        */
    }
}