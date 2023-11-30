import java.util.Scanner;

public class ExceptionTraining {
    public static void main(String[] args) {
//        System.out.println(1 / 0);

        Saver saver = new Saver();
        saver.save();


        // fail fast - провались быстро


        System.out.println("Введите положительное число");

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        if(value <= 0) {
            throw new RuntimeException();
        }

    }
}
