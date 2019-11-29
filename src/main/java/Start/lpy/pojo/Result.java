package Start.lpy.pojo;

import lombok.Data;

/**
 * @Author:刘平远
 * @Date：2019/10/23 19:20
 * @verson 1.0
 **/
@Data
public class Result {
    private boolean success;
    //返回信息
    private String message;

    public Result() {
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }
}
