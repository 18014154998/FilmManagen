package Start.lpy.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Film {
    private String fid;

    private String filmName;

    private String filmPicture;

    private Date filmLength;

    private Date filmReleasetime;

    private String filmDirector;

    private String filmMainactors;

    private String filmProductorcountry;

    private String filmDescription;

    private Double filmPrice;

    private Integer filmClickcount;

    //电影类型一对一
    private Filmtype filmtype;

}