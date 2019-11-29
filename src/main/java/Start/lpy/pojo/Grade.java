package Start.lpy.pojo;

import java.util.Date;

public class Grade {
    private Integer gid;

    private String gradeName;

    private Integer gradeState;

    private Date gradeCreatetime;

    private Date gradeDestorytime;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getGradeState() {
        return gradeState;
    }

    public void setGradeState(Integer gradeState) {
        this.gradeState = gradeState;
    }

    public Date getGradeCreatetime() {
        return gradeCreatetime;
    }

    public void setGradeCreatetime(Date gradeCreatetime) {
        this.gradeCreatetime = gradeCreatetime;
    }

    public Date getGradeDestorytime() {
        return gradeDestorytime;
    }

    public void setGradeDestorytime(Date gradeDestorytime) {
        this.gradeDestorytime = gradeDestorytime;
    }
}