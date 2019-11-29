package Start.lpy.pojo;

import java.util.Date;

public class Role {
    private Integer roleid;

    private String roleName;

    private Integer roleState;

    private Date roleCreatetime;

    private Date releDestorytime;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    public Date getRoleCreatetime() {
        return roleCreatetime;
    }

    public void setRoleCreatetime(Date roleCreatetime) {
        this.roleCreatetime = roleCreatetime;
    }

    public Date getReleDestorytime() {
        return releDestorytime;
    }

    public void setReleDestorytime(Date releDestorytime) {
        this.releDestorytime = releDestorytime;
    }
}