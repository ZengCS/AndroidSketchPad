package com.zcs.lib.sketchpad.event;

/**
 * Created by ZengCS on 2021/11/30.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */

public class ChangeToolModeEvent {
    private String msg;

    public ChangeToolModeEvent() {
    }

    public ChangeToolModeEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
