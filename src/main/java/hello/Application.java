package hello;

public class Application {
    public static void main(String[] args) {
        System.out.println("application");
        // 创建打印机
        MessagePrinter printer = new MessagePrinter();
        MessageService service = new MessageService();
        printer.setMessageService(service);
        printer.printMessage();
    }
}
