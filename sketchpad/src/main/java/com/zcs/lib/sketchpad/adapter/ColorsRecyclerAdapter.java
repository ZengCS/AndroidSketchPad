package com.zcs.lib.sketchpad.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.zcs.lib.sketchpad.R;
import com.zcs.lib.sketchpad.bean.ToolColorBean;
import com.zcs.lib.sketchpad.config.SketchConfig;
import com.zcs.lib.sketchpad.view.CircleColorView;

import java.util.List;

/**
 * Created by ZengCS on 2021/7/14.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */
public class ColorsRecyclerAdapter extends BaseRecyclerAdapter<ToolColorBean> {
    public ColorsRecyclerAdapter(Context context, List<ToolColorBean> mItems) {
        super(context, mItems);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CustomViewHolder(mInflater.inflate(R.layout.item_tool_color, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ToolColorBean bean = mItems.get(position);
        if (null == bean) return;

        CustomViewHolder viewHolder = (CustomViewHolder) holder;
        viewHolder.circleColorView.setColor(bean.getColor());
        viewHolder.ivChecked.setVisibility(bean.isChecked() ? View.VISIBLE : View.GONE);
    }

    /**
     * 自定义ViewHolder
     */
    private class CustomViewHolder extends RecyclerView.ViewHolder {
        CircleColorView circleColorView;
        ImageView ivChecked;

        private CustomViewHolder(View itemView) {
            super(itemView);
            circleColorView = (CircleColorView) itemView.findViewById(R.id.id_circle_color);
            ivChecked = (ImageView) itemView.findViewById(R.id.id_iv_checked);
            circleColorView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    removeChecked();
                    ToolColorBean bean = mItems.get(position);
                    bean.setChecked(true);
                    SketchConfig.currColorStr = bean.getColorString();
                    SketchConfig.currColor = bean.getColor();
                    notifyDataSetChanged();

                    onItemClick(position);
                }
            });
        }
    }

    private void removeChecked() {
        for (ToolColorBean bean : mItems)
            bean.setChecked(false);
    }
}
