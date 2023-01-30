import com.alibaba.fastjson.JSONArray;

import java.util.Arrays;
import java.util.List;

import jdk.nashorn.internal.runtime.ECMAException;
import org.apache.commons.lang3.StringUtils;

public class Test {

    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        System.out.println("hello2");
        System.out.println("dev");

    }


    public static String idRemoveOfBrackets(String id) {
        return JSONArray.parseArray(id, String.class).get(0);
    }

    public static List<String> idsStringToArray(String ids) {
        System.out.println(ids);
        return JSONArray.parseArray(ids, String.class);
    }



}