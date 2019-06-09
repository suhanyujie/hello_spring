package soundSystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

    @Autowired
    private CdPlayer player;

    @Test
    public void testPlay () {
        // 这一句可以由 `@ContextConfiguration(classes = AppConfig.class)` 替代
        // ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // CdPlayer player = context.getBean(CdPlayer.class);
        player.play();
    }
}
