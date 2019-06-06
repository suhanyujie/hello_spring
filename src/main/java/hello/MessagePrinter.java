package hello;

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

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(this.messageService.getMessage());
    }
}