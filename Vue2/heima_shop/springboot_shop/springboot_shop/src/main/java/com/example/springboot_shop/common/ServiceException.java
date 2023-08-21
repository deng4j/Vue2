package com.example.springboot_shop.common;

public final class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Integer code;


    public ServiceException(String msg) {
        super(msg);
    }


    public ServiceException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
