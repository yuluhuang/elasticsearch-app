/**
 * @Title
 * @Project elasticsearch-app
 * @Package com.yuluhuang.elasticsearch.app.base
 * @Description
 * @author ylh
 * @date 2018-10-17 21:14
 * @version
 */
package com.yuluhuang.elasticsearch.app.base;

/**
 * @author ylh
 * @Description
 * @date 2018-10-17 21:14
 */
public class ApiResponse {
    private int code;
    private String message;
    private Object data;
    private boolean more;


    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResponse() {
        this.code = Status.SUCCESS.getCode();
        this.message = Status.SUCCESS.getStandarMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public static ApiResponse ofMessage(int code, String message) {
        return new ApiResponse(code, message, null);
    }

    public static ApiResponse ofSuccess(Object data) {
        return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getStandarMessage(), data);
    }

    public static  ApiResponse ofStatus(Status status) {
        return new ApiResponse(status.getCode(), status.getStandarMessage(), null);
    }
    public enum Status {
        SUCCESS(200, "OK"),
        BAD_REQUEST(400, "Bad Request"),
        INTERNAL_SERVER_ERROR(500, "Unknown Internal Error"),
        NOT_VALID_PARAM(40005, "Not valid Params"),
        NOT_SUPPORTED_OPERATION(40006, "Operation not supported"),
        NOT_LOGIN(5000, "Not Login");

        private int code;
        private String standarMessage;

        Status(int code, String standarMessage) {
            this.code = code;
            this.standarMessage = standarMessage;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStandarMessage() {
            return standarMessage;
        }

        public void setStandarMessage(String standarMessage) {
            this.standarMessage = standarMessage;
        }
    }
}
