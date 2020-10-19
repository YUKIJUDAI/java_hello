package config;

public class ResultUtil {
    public static CommomResult success(Object object) {
        CommomResult result = new CommomResult();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static CommomResult success() {

        return success(null);
    }

    public static CommomResult error(Integer code, String msg) {
        CommomResult result = new CommomResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
