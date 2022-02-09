package com.zcs.lib.sketchpad.bean;

/**
 * Created by ZengCS on 2021/12/13.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */

public class GeometricBean extends BaseBean {
    private int type;

    public GeometricBean(int type) {
        super(false);
        this.type = type;
    }

    public GeometricBean(boolean checked, int type) {
        super(checked);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
