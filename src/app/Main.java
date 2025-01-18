package app;

public class Main {

    public static void main(String[] args) {

        Printer printer = new MessageView();
        AppView view = new AppView();
        String[] data = view.getData();
    }
}
