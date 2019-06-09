package soundSystem;

import org.springframework.stereotype.Component;

@Component
public class CompactDisc {

    public CompactDisc() {
        super();
        System.out.println("CompactDisc 无参构造方法");
    }

    public void play(){
        System.out.println("this cd is playing...");
    }
}
