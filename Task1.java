import java.util.InputMismatchException;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        
        Double  inputNumber = getNumber();

        System.out.print("Ваше число: " + inputNumber);
        
    }

    public static Double getNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            Double number = scanner.nextDouble();
            return number;
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число! ПОпробуйте еще раз!");
            return getNumber();
        } finally {
            scanner.close();
        }
    }
}
