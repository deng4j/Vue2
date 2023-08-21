package com.example.springboot_shop.common;

import java.io.Serializable;
import java.util.HashMap;

public class AjaxResult extends HashMap<Object,Object>  implements Serializable{
    private static final long serialVersionUID = 1L;
    private static final String DATA_TAG = "data";
    private static final String META_TAG = "meta";

    public AjaxResult() {
    }

    public AjaxResult(String msg, Integer status){
        Meta meta = new Meta(msg,status);
        super.put(META_TAG,meta);
    }

    public static AjaxResult ok(Object obj){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put(DATA_TAG,obj);
        return ajaxResult;
    }

    public static AjaxResult ok(Object obj,String msg,Integer status){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put(DATA_TAG,obj);
        ajaxResult.put(META_TAG,new Meta(msg,status));
        return ajaxResult;
    }

    public static AjaxResult error(Integer status,String msg){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put(META_TAG,new Meta(msg,status));
        return ajaxResult;
    }

    public static AjaxResult error(String msg){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put(META_TAG,new Meta(msg));
        return ajaxResult;
    }

}

class Meta implements Serializable {
    private static final long serialVersionUID = 1L;
    public String msg;
    public Integer status;

    public Meta(String msg) {
        this.msg = msg;
    }

    public Meta(String msg, Integer status) {
        this.msg = msg;
        this.status = status;
    }
}