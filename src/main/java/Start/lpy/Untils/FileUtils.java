package Start.lpy.Untils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @Author:刘平远
 * @Date：2019/10/23 17:17
 * @verson 1.0
 **/
public class FileUtils {
    public static void upload(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();

    }
}
