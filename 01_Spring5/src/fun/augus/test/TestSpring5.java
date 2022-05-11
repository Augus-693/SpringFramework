package fun.augus.test;

import fun.augus.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestConstructor;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.test
 * @FileName: TestSpring5
 * @date 2022年04月04日 21:21
 * @version: 1.0
 */


public class TestSpring5 {

    @Test
    public void testShow() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //获取创建对象
        User user = context.getBean("user", User.class);
        user.show();
    }
}
