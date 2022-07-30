package Utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class CollectionUtils {
    public static void main(String[] args) {
        String id = "123,456,345,167";
        String idnull=null;
        String idnull1 = idnull;
        boolean blank = StringUtils.isBlank(idnull);
        System.out.println(blank);
        if (idnull1 == null) {
            idnull = new String();
        }
        System.out.println(idnull.length());
        idnull.split(",");
        System.out.println(idnull);
        String id2 = "[\"123\"]";
        String ids = "[\"123\",\"456\",\"789\"]";
        String s = multipleIdProcess(idnull);
        System.out.println(s);
    }


    public static String parseArrayOne(String id) {
        return JSONArray.parseArray(id, String.class).get(0);
    }

    public static List<String> parseArray(String ids) {
        System.out.println(ids);
        return JSONArray.parseArray(ids, String.class);
    }

    public static String toJSONString(List<String> ids) {
        return JSON.toJSONString(ids);
    }

    public static String multipleIdProcess(String userId) {
        if (StringUtils.isBlank(userId)) {
            return userId;
        }
        String[] idArr = userId.split(",");
        String tmp = "";
        for (int i = 0; i < idArr.length; i++) {
            tmp = tmp + idArr[i] + "\",\"";
        }
        tmp = tmp.substring(0, tmp.lastIndexOf(","));
        return "[\"" + tmp + "]";
    }

    public static String isBlank(String userId){
        if (StringUtils.isBlank(userId)) {
            return userId;
        }
        return userId;
    }

}
