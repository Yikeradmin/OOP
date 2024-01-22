package entry;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 11:27
 **/

public class Computer {
    String name;
    String comId;
    double price;
    String message;

    public Computer(String name, String comId, double price, String message) {
        this.name = name;
        this.comId = comId;
        this.price = price;
        this.message = message;
    }
    public void shutdown(){
        System.out.println("欢迎下次使用\t(机器码:"+comId+")");
    }
    public void open(){
        System.out.println("您好,欢迎使用\t(机器码:"+comId+")");
    }
    public void showMessage(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", comId='" + comId + '\'' +
                ", price=" + price +
                ", message='" + message + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Computer computer =new Computer("联想","123456",123.5,"这是一个电脑");
        computer.open();
        computer.showMessage();
    }
}
