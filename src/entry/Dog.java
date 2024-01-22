package entry;

/**
 * @author: CoolPro
 * @desc:
 * @create: 2024-01-22 10:12
 **/

public class Dog {
    String name;
    String src;
    String id;

    public Dog(String name, String src, String id) {
        this.name = name;
        this.src = src;
        this.id = id;
    }
    public void play(){
        System.out.println(name+"说：我要"+src);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
