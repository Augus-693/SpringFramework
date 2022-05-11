package fun.augus.test;

import fun.augus.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.test
 * @FileName: test
 * @date 2022年04月05日 10:05
 * @version: 1.0
 */


public class test {

    @Test
    public void testUser() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //获取创建对象
        User user = context.getBean("user", User.class);
        user.showUser();
    }
}

