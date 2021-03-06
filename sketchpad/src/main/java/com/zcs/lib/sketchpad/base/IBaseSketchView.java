package com.zcs.lib.sketchpad.base;

import android.graphics.Bitmap;

import com.zcs.lib.sketchpad.bean.PhotoRecord;
import com.zcs.lib.sketchpad.utils.SketchMode;

/**
 * Created by ZengCS on 2021/2/8.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */

public interface IBaseSketchView {
    void ensureSketchBitmap4Helper();

    void expandDirtyRect4Helper(float x, float y);

    Bitmap getSketchBitmap();

    String undo();

    String redo();

    void setSketchMode(SketchMode sketchMode);

    void clear();

    void clear(boolean isClearBg);

    PhotoRecord getUserPhotoRecord();

    void resetUserPhoto(PhotoRecord userPhotoRecord);

    void setBackgroundResource(int resource);

    void setBackgroundBitmap(Bitmap bitmap);

    void setBackgroundByPath(String path);

    void setBackgroundByPath(String path, float scale);

    /**
     * 用户添加的图片，通过此方式添加的图片不会被清空
     * url 和 bitmap任一有值即可,如果两者都有值,取bitmap
     */
    void addPicByUser(String url, Bitmap bitmap);

    void addPicBitmap(Bitmap bitmap);

    void addPicByPath(String path);

    void drawText(String text, int textSize, float x, float y, int marginCount);

    void invalidateTempGeometric();

    void switchSpotlight();

    void cleanSpotlight();

    void savePenWidth();
}
