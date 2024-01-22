package entry;

import java.lang.annotation.Retention;
import java.util.Objects;
public class MyClass {
    /*
     属性就是成员变量
        成员变量类型 变量名称;
            ......
        变量:局部变量和成员变量
     */
    int id;//学号
    String name;//姓名
    char gender;//性别
    double height;//身高
    public static MyClass my = new MyClass();

    public MyClass() {
    }

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 构造方法
     * @Name: MyClass
     * @parmas: [id, name, gender, height]
     * @return:
    */

    public MyClass(int id, String name, char gender, double height) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    /**
     * @Author: Administrator
     * @Date: 2024/1/22
     * @Description:
     * @Name: getInstance
     * @param
     * @return: entry.MyClass
    */

    public MyClass getInstance(){
        if (Objects.isNull(my)){
            my = new MyClass();
        }
        return my;
    }
}
