package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer {

    private Power power;

    protected CompactDisc cd;

    public CdPlayer() {
        super();
        System.out.println("CdPlayer 无参数构造方法");
    }

    @Autowired
    public CdPlayer(Power power, CompactDisc cd) {
        this.power = power;
        this.cd = cd;
        System.out.println("CdPlayer 多个参数构造方法");
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    //    @Autowired
//    public CdPlayer(CompactDisc cd) {
//        super();
//        this.cd = cd;
//        System.out.println("CdPlayer 有参数构造方法");
//    }

    public void play(){
        power.supply();
        this.cd.play();
    }

    @Autowired
    private void prepare (CompactDisc cd, Power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("prepare 方法被调用！");
    }
}

/*

## 自动依赖注入
### 四种方法是现在这种依赖注入
* 通过构造函数的方式依赖注入（效率相对较高）
* 通过 setter 方法加 `@Autowired` 的方式依赖注入
* 通过属性加上 `@Autowired` 的方式依赖注入
* 新增 prepare 方法（任意函数名都可以）再加 `@Autowired` 的方式实现依赖注入



 */
