package fun.augus.spring5;

import java.util.List;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: Book
 * @date 2022年04月05日 13:15
 * @version: 1.0
 */


public class Book {
    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
