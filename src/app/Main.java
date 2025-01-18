package app;

public class Main {

    public static void main(String[] args) {

        Printer printer = new MessageView();
        AppView view = new AppView();
        String[] data = view.getData();

        MessageView.Message message =
                new MessageView.Message(data[0], data[1]);

        printer.print(message);
    }
}
