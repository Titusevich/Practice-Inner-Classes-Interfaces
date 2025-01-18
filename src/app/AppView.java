package app;

import java.util.Scanner;

public class AppView {

    public String[] getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть ваше повідомлення. " +
                "Якщо бажаєте надіслати пусте повідомлення, натисніть \"Enter\": ");
        String text = scan.nextLine().trim();
        System.out.println("Введіть ваше ім'я. " +
                "Якщо бажаєте надіслати анонімне повідомлення, натисніть \"Enter\": ");
        String user = scan.nextLine().trim();
        return new String[]{text, user};
    }
}
