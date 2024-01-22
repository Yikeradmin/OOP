package homework.entry;

/**
 * @author: CoolPro
 * @Desc: 人
 * @create: 2024-01-22 18:47
 **/

public class People {
    private String name;
    private int age;
    private char sex;
    private double height;

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 修改姓名
     * @Name: changeName
     * @parmas: [name]
     * @return: void
     */
    public void changeName(String name) {
        this.name = name;
    }

    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 输出某某学生正在说话
     * @Name: speck
     * @parmas: []
     * @return: void
     */
    public void speck() {
        System.out.println(name + "正在说话");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public People() {
    }

    public People(String name, int age, char sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                '}';
    }
}
