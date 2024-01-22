package homework.exam;

import homework.entry.MyDate;

/**
 * @author: CoolPro
 * @Desc: MyDate(我的日期)测试类
 * @create: 2024-01-22 19:07
 **/

public class Ex7 {
    public static void main(String[] args) {
        MyDate date = new MyDate(2023, 1, 1);
        date.showDate();
        date.checkYear();
    }
}
