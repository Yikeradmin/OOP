package entry;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 15:32
 **/

public class Department {
    long departId;
    String departName;
    String departMaster;

    public long getDepartId() {
        return departId;
    }

    public void setDepartId(long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartMaster() {
        return departMaster;
    }

    public void setDepartMaster(String departMaster) {
        this.departMaster = departMaster;
    }

    public Department() {
    }

    public Department(long departId, String departName, String departMaster) {
        this.departId = departId;
        this.departName = departName;
        this.departMaster = departMaster;
    }
}
