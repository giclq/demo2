package com.example.demo.validateTest;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *  created by shaoh on 2017/12/29,11:36
 *  package name:com.dpzx.dcw.common.exception
 *     file name:ApiException
 *  project name:dpzx_dcw
 * </pre>
 *
 * @author shaoh
 * @version 0.1
 * @date 2017/12/29,11:36
 * @description
 */
@SuppressWarnings("all")
public class ApiException extends RuntimeException  implements Serializable {

    private static final long serialVersionUID = - 4179610207017193641L;

    private StatusCode statusCode = StatusCode.ER_OTHER;

    private Map<String, Object> datas;

    public ApiException() {

    }

    public ApiException(String message) {
    super(message);
    }

    public ApiException(String message, String key, Object value) {

        datas = new HashMap<String, Object>();
        datas.put(key, value);
    }

    public ApiException(Throwable cause) {

        this.statusCode = StatusCode.ER_OTHER;
    }

    public ApiException(StatusCode statusCode, String message) {
        this(message);
        this.statusCode = statusCode;
    }

    public ApiException(String message, Throwable cause) {

        this.statusCode = StatusCode.ER_OTHER;
    }

    public ApiException(StatusCode statusCode) {

        this.statusCode = statusCode;
    }

    public ApiException(StatusCode statusCode, String key, Object value) {

        this.statusCode = statusCode;
        datas = new HashMap<String, Object>();
        datas.put(key, value);
    }

    public Map<String, Object> getDatas() {
        return datas;
    }

    public void setDatas(Map<String, Object> datas) {
        this.datas = datas;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}

