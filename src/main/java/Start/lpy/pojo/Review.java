package Start.lpy.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Review {
    private Integer rid;

    private String review;

    private Date reviewCreatetime;

    private Double filmScore;


}