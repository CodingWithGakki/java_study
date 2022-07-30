import com.alibaba.fastjson.JSONArray;

import java.util.Arrays;
import java.util.List;

import jdk.nashorn.internal.runtime.ECMAException;
import org.apache.commons.lang3.StringUtils;

public class Test {

    public static void main(String[] args) throws Exception {
        //String id = "123";
        String id=null;
        boolean blank = StringUtils.isBlank(id);
        System.out.println(blank);
        System.out.println(id.length());
        String id2 = "[\"123\"]";
        String ids="[\"123\",\"456\",\"789\"]";

        String str = "";
        String[] split = id.split(",");
        for (int i = 0; i < split.length; i++) {
            str = str + split[i] + "\",\"";
        }
        str=str.substring(0,str.lastIndexOf(","));
        String res = "[\"" + str + "]";
        System.out.println(res);



    }


    public static String idRemoveOfBrackets(String id) {
        return JSONArray.parseArray(id, String.class).get(0);
    }

    public static List<String> idsStringToArray(String ids) {
        System.out.println(ids);
        return JSONArray.parseArray(ids, String.class);
    }



}