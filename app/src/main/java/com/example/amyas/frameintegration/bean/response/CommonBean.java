package com.example.amyas.frameintegration.bean.response;

import com.google.gson.JsonObject;

import java.util.List;

/**
 * author: Amyas
 * date: 2018/1/30
 * 通用数据返回json类
 */

public class CommonBean {


    /**
     * code : 0
     * msg : 操作成功
     * total : 0
     * data : []
     */

    private int code;
    private String msg;
    private int total;
    private List<JsonObject> data;

    @Override
    public String toString() {
        return "CommonBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", total=" + total +
                ", data=" + data +
                '}';
    }

    public List<JsonObject> getData() {
        return data;
    }

    public void setData(List<JsonObject> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}
