package homework.entry;

/**
 * @author: CoolPro
 * @Desc: Vehicle（交通工具）
 * @create: 2024-01-22 16:41
 **/

public class Vehicle {
    private int speed;
    private int size;
    public void move(){
        System.out.printf("容量为%d的交通工具以每秒%d公里的速度在公路行驶\n",size,speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }
}
