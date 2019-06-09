package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer {

    protected CompactDisc cd;

    public CdPlayer() {
        super();
        System.out.println("CdPlayer 无参数构造方法");
    }

    @Autowired
    public CdPlayer(CompactDisc cd) {
        super();
        this.cd = cd;
        System.out.println("CdPlayer 有参数构造方法");
    }

    public void play(){
        this.cd.play();
    }
}
