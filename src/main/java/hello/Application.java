package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        System.out.println("application");
        // 创建打印机
//        MessagePrinter printer = new MessagePrinter();
//        MessageService service = new MessageService();
//        printer.setMessageService(service);
//        printer.printMessage();

        // 初始化 spring 容器
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        // 获取对象
        // MessageService service = context.getBean(MessageService.class);
         MessagePrinter printer = context.getBean(MessagePrinter.class);
//        System.out.println(printer);
//        System.out.println(service);
        // 因为加了 @Autowired 注解，所以这个方法会自动调用
//        printer.setMessageService(service);
        printer.printMessage();
    }
}
