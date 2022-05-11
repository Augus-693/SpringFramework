package fun.augus.spring5.service;

import fun.augus.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.service
 * @FileName: UserService
 * @date 2022年04月26日 17:13
 * @version: 1.0
 */

@Service
public class UserService {

    @Value(value = "abc")
    private String name;

    // 定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
//    @Autowired  //根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")
//    @Resource   //根据类型注入
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    public void add() {
        System.out.println("service add....." + name);
        userDao.add();
    }

}
