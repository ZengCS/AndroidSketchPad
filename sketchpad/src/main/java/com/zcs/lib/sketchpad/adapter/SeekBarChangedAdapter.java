package com.zcs.lib.sketchpad.adapter;

import android.widget.SeekBar;

/**
 * Created by ZengCS on 2021/7/6.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */

public class SeekBarChangedAdapter implements SeekBar.OnSeekBarChangeListener {
    private static final String TAG = "SeekBarChangedAdapter";

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // Log.d(TAG, "onStartTrackingTouch: ");
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // Log.d(TAG, "onStopTrackingTouch: ");
    }
}
