package fun.augus.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.service
 * @FileName: UserService
 * @date 2022年04月24日 9:47
 * @version: 1.0
 */

// 注解里的value属性值可以省略不写
//默认值是类名称，首字母小写 UserService ——> userService
//@Component(value = "userService")
//@Controller
@Repository
public class UserService {
    public void add() {
        System.out.println("service add.......");
    }
}
