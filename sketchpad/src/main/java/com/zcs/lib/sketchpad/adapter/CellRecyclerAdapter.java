package com.zcs.lib.sketchpad.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zcs.lib.sketchpad.R;
import com.zcs.lib.sketchpad.bean.CellBean;
import com.zcs.lib.sketchpad.utils.BitmapUtil;

import java.util.List;

/**
 * Created by ZengCS on 2021/7/14.
 * E-mail:zengcs@vip.qq.com
 * Add:成都市天府软件园E3-3F
 */
public class CellRecyclerAdapter extends BaseRecyclerAdapter<CellBean> {
    public CellRecyclerAdapter(Context context, List<CellBean> mItems) {
        super(context, mItems);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(mInflater.inflate(R.layout.item_tool_cell, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CellBean bean = mItems.get(position);
        if (null == bean) return;

        CustomViewHolder viewHolder = (CustomViewHolder) holder;
        viewHolder.imageView.setImageBitmap(BitmapUtil.getBitmapFromAssets(mContext, bean.getPath()));
        viewHolder.checkedIcon.setVisibility(bean.isChecked() ? View.VISIBLE : View.GONE);
    }

    /**
     * 自定义ViewHolder
     */
    private class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView, checkedIcon;

        private CustomViewHolder(View itemView) {
            super(itemView);
            checkedIcon = itemView.findViewById(R.id.id_iv_cell_checked);
            imageView = itemView.findViewById(R.id.id_iv_bg_cell);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    // 获取当前被点击的元素
                    CellBean currBean = mItems.get(position);
                    if (currBean.isChecked()) {
                        // 清空格子
                        onItemClick(10000);
                        currBean.setChecked(false);
                    } else {
                        // 清空之前的选中
                        for (CellBean cellBean : mItems)
                            cellBean.setChecked(false);
                        currBean.setChecked(true);
                        onItemClick(position);
                    }
                    notifyDataSetChanged();
                }
            });
        }
    }
}
