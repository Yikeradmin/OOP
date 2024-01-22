package homework.entry;

/**
 * @author: CoolPro
 * @Desc: 日期类
 * @create: 2024-01-22 19:02
 **/

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    
    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 输出当前日期
     * @Name: showDate
     * @parmas: []
     * @return: void
    */
    
    public void showDate(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "日期: "+year +"年"+ month +"月" + day +"日";
    }
    
    
    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 判断是否是闰年 
     * @Name: checkYear
     * @parmas: []
     * @return: void 
    */
    public void checkYear(){
        if (isLeapYear()){
            System.out.println(year+ "年是闰年");
        }else{
            System.out.println(year+ "年不是闰年");
        }
    }
    
    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 计算当前年份是否是闰年 
     * @Name: isLeapYear
     * @parmas: []
     * @return: boolean 
    */
    private boolean isLeapYear(){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }

}
