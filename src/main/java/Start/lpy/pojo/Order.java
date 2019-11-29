package Start.lpy.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer oid;

    private Date orderCreatetime;

    private Double orderPrice;


}