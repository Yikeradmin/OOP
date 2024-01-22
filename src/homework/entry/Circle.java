package homework.entry;

/**
 * @author: CoolPro
 * @Desc: 圆
 * @create: 2024-01-22 16:48
 **/

public class Circle {
    float rang;//半径

    public float getRang() {
        return rang;
    }
    public void setRang(float rang) {
        this.rang = rang;
    }

    public Circle() {
    }

    public Circle(float rang) {
        this.rang = rang;
    }
    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 计算并输出圆的面积
     * @Name: showArea
     * @parmas: []
     * @return: void
    */
    public void showArea(){
        System.out.printf("圆的面积为:%.2f\n",(rang*rang*3.14));
    }
    /**
     * @Author: CoolPro
     * @Date: 2024/1/22
     * @Description: 计算并输出圆的周长
     * @Name: showPerimeter
     * @parmas: []
     * @return: void
    */
    public void showPerimeter(){
        System.out.printf("圆的周长为:%.2f\n",(rang*2*3.14));
    }
}
