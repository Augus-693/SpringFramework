package fun.augus.spring5;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: Dept
 * @date 2022年04月05日 10:49
 * @version: 1.0
 */


public class Dept {
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
