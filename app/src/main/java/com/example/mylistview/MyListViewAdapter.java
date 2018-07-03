package com.example.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * @author Created byabc
 * @data on2018/7/2
 * desc
 */

public class MyListViewAdapter extends BaseAdapter {
    private LinkedList<ListViews> mList;


    private LayoutInflater inflater;
    private ViewHolder mViewHolder;

    public MyListViewAdapter(Context mContext, LinkedList<ListViews> mList) {
        this.mList = mList;
        this.inflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            mViewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.module_list_item, parent, false);
            mViewHolder.mTv = (TextView) convertView.findViewById(R.id.tv);
            mViewHolder.mIv = (ImageView) convertView.findViewById(R.id.iv);

            //储存ViewHolder
            convertView.setTag(mViewHolder);

            ;
        } else {
            //重新获取ViewHolder对象
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.mIv.setImageResource(mList.get(position).getId());
        mViewHolder.mTv.setText(mList.get(position).getName());
        return convertView;
    }

    static class ViewHolder {
        TextView mTv;
        ImageView mIv;
    }
}
