package homework.exam;

import homework.entry.People;

/**
 * @author: CoolPro
 * @Desc: People(人)测试类
 * @create: 2024-01-22 18:50
 **/

public class Ex5 {
    public static void main(String[] args) {
        People people = new People();
        people.setAge(24);
        people.setHeight(177.5);
        people.setSex('男');
        people.setName("仓鼠");
        System.out.println(people);
        people.changeName("仓鼠弟弟");
        people.speck();
    }
}
