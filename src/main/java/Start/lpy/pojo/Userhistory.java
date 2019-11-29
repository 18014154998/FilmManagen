package Start.lpy.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Userhistory {
    private Integer historyid;

    private Integer uid;

    private String filmid;

    private String username;

    private String filmname;

    private Date createtime;


}