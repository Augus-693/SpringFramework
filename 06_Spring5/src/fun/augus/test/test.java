package fun.augus.test;

import fun.augus.spring5.Book;
import fun.augus.spring5.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.test
 * @FileName: test
 * @date 2022年04月05日 10:55
 * @version: 1.0
 */


public class test {
    @Test
    public void testCollection1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        book.test();
        System.out.println(book1);
        System.out.println(book2);
    }
}
