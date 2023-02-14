import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
    public static void main(String[] args) {
        // 문자열 Json --> Map 변경
        Gson gson = new Gson();
        String jsonStr = "{id:1, name:yojulab, habits:[fitness, read, game]}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class);   // jsonStr을 Map형식으로 바꿔줌.
    
        // Map --> 문자열 Json
        String mapStr = gson.toJson(jsonMap);
        
        // 문자열 Json --> Object(= bean, model, vo) 변경
        String jsonStrBean = "{firstName:yo, secondName:ju, handleName:lab}"; 
        MemberBean memeberBean = gson.fromJson(jsonStrBean, MemberBean.class);
        
        // Object --> 문자열 Json
        String memberBeanStr = gson.toJson(memeberBean);
        int i = 0;
    }
}
