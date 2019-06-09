package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    private MessageService messageService;

    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter");
    }

    public MessageService getMessageService() {
        return messageService;
    }

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }
}
