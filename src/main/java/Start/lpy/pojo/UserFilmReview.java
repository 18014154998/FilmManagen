package Start.lpy.pojo;

import lombok.Data;

@Data
public class UserFilmReview {
    private Integer ufrid;

    private Integer uid;

    private String fid;

    private Integer rid;

   private User user;

   private Film film;

   private Review review;
}