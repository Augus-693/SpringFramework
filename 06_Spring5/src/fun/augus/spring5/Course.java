package fun.augus.spring5;

/**
 * @author: Augus
 * @project: SpringFramework
 * @package: fun.augus.spring5
 * @FileName: Course
 * @date 2022年04月05日 13:10
 * @version: 1.0
 */


public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
