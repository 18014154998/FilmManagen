package Start.lpy.pojo;

import lombok.Data;

@Data
public class UserOrder {

    private Integer uoid;

    private Integer uid;

    private String fid;

    private Integer oid;

    private Double orderPrice;

    private Film film;

    private Order order;



}