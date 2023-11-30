import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String str = null;
//        System.out.println(str.hashCode());
//
//        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//
//        if ((value <= 0)) {
//            throw new RuntimeException();
//        }

//        Saver saver = new Saver();
//        saver.save();

        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();


        // .java -> .class  - javac  (java compilator)
        // мы используем дженерики, для того, чтобы проверить код
        // если все ок, то дженерики удаляются
        //.class -> байт-код  - виртуальная машина


        try {
            TemperatureTester temperatureTester = new TemperatureTester();
            temperatureTester.test();
            System.out.println("датчик в норме");

        }
        catch (IOException exception) {
            System.out.println("кажется, датчик сломан");
        }

    }
}