package app;

import java.util.Scanner;

public class AppView {

    public String[] getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your message: ");
        String text = scan.nextLine().trim();
        System.out.println("Input your name: ");
        String user = scan.nextLine().trim();
        return new String[]{text, user};
    }
}
