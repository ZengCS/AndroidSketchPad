package com.zcs.lib.sketchpad.bean;

/**
 * Created by ZengCS on 2021/12/12.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */

public class BasePoint {
    public float x;
    public float y;

    public BasePoint() {
    }

    public BasePoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
