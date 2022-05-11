package fun.augus.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5.dao
 * @FileName: UserDaoImpl
 * @date 2022年04月26日 17:15
 * @version: 1.0
 */

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add......");
    }
}
