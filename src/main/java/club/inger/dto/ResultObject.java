package club.inger.dto;

import java.util.Map;

/**
 * Created by inger on 2019/4/9.
 */
public class ResultObject {
    private String reason;
    private int error_code;
    private Map<String,Object> result;

    public ResultObject() {

    }
    public ResultObject(String reason,int error_code) {
        this.error_code = error_code;
        this.reason = reason;
    }
    public ResultObject(String reason,int error_code,Map<String,Object> result) {
        this.error_code = error_code;
        this.reason = reason;
        this.result = result;
    }

    public Map<String, Object> getResult() {

        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public int getError_code() {

        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {

        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
