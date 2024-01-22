package homework.entry;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 18:32
 **/

public class Student {
    private String name;
    private String id;
    private String phone;
    private String age;

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 输出[学生姓名]+正在认真思考人生
     * @Name: think
     * @parmas: []
     * @return: void
    */

    public void think() {
        System.out.println(name + "正在认真的思考人生");
    }


    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 输出学生所有信息
     * @Name: print
     * @parmas: []
     * @return: void
    */

    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, String id, String phone, String age) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }
}
