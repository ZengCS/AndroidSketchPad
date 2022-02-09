package com.zcs.lib.sketchpad.bean;

/**
 * Created by ZengCS on 2021/9/7.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */
public class EmptyEntity extends BaseBean {
    private long id;

    public EmptyEntity() {
    }

    public EmptyEntity(int id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
