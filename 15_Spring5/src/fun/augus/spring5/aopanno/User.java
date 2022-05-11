package fun.augus.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.aopanno
 * @FileName: User
 * @date 2022年04月27日 12:15
 * @version: 1.0
 */

//被增强的类
@Component
public class User {
    public void add() {
        int i = 10/0;
        System.out.println("add.......");
    }
}

