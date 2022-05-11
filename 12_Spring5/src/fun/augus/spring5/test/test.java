package fun.augus.spring5.test;

import fun.augus.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.test
 * @FileName: test
 * @date 2022年04月26日 17:14
 * @version: 1.0
 */


public class test {

    @Test
    public void testService() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
