package org.example.springbootdeployec2.model;

import java.time.LocalDateTime;

public class Response {

    private Integer code;
    private String message;
    private LocalDateTime timestamp;

    // Default constructor
    public Response() {
        this.code = 200;
        this.message = "Default message";
        this.timestamp = LocalDateTime.now();
    }

    public Response(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
