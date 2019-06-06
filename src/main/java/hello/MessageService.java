package hello;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService");
    }

    /**
     * 返回消息
     * @return
     */
    public String getMessage(){

        return "Hello world";
    }
}
