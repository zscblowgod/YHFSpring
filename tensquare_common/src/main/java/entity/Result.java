package entity;

public class Result {
    private boolean flag;
    private Integer code;
    private String string;
    private Object data;

    public Result(){

    }

    public Result(boolean flag, Integer code, String string) {
        this.flag = flag;
        this.code = code;
        this.string = string;
    }

    public Result(boolean flag, Integer code, String string, Object data) {
        this.flag = flag;
        this.code = code;
        this.string = string;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
