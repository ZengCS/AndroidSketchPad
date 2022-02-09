package com.zcs.lib.sketchpad.base;

import com.zcs.lib.sketchpad.bean.DrawPoint;

import java.util.List;

/**
 * Created by ZengCS on 2021/10/15.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */

public interface ISketchDrawCallback {
    void onDrawSuccess(List<DrawPoint> pointList);
}
