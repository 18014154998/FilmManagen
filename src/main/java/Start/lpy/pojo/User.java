package Start.lpy.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class User {
    private Integer uid;

    private String username;

    private String password;

    private Integer roleId;

    private Integer stateFlag;

    private Date createTime;

    private Double surplus;

    private Role role;

    private Grade grade;


}
