package Start.lpy.Untils;

import com.alibaba.fastjson.JSON;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author:刘平远
 * @Date：2019/11/1 8:30
 * @verson 1.0
 **/
public class ParameterRequestWrapper extends HttpServletRequestWrapper {
    private Map<String,String[]> params=new HashMap<>();


    public ParameterRequestWrapper(HttpServletRequest request) {
        super(request);
        //获取参数
        Map<String,String[]> requestmap=request.getParameterMap();
        System.out.println("转化前的参数为：" + JSON.toJSONString(requestmap));
        this.params.putAll(requestmap);
        this.modifyParameterValues();
        System.out.println("转化后的参数为：" + JSON.toJSONString(params));
    }
    //将参数进行去除敏感字符处理
    public void modifyParameterValues(){
        Set<String> set =params.keySet();
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String key= it.next();
            String[] values = params.get(key);
            values[0] = values[0].replace("tmd","**");
            params.put(key, values);
        }
    }
    /**
     * 重写getParameter 参数从当前类中的map获取
     */
    @Override
    public String getParameter(String name) {
        String[]values = params.get(name);
        if(values == null || values.length == 0) {
            return null;
        }
        return values[0];
    }
    /**
     * 重写getParameterValues
     */
    @Override
    public String[] getParameterValues(String name) {//同上
        return params.get(name);
    }


    class MyServletInputStream extends ServletInputStream {
        private ByteArrayInputStream bis;
        public MyServletInputStream(ByteArrayInputStream bis){
            this.bis=bis;
        }
        @Override
        public boolean isFinished() {
            return true;
        }

        @Override
        public boolean isReady() {
            return true;
        }

        @Override
        public void setReadListener(ReadListener listener) {

        }
        @Override
        public int read(){
            return bis.read();
        }
    }


}
