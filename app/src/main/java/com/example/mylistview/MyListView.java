package com.example.mylistview;

/**
 * @author Created byabc
 * @data on2018/7/1
 * desc
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyListView extends AppCompatActivity {

    @BindView(R.id.lv)
    ListView mLv;
    private List<ListViews> mArrayList = null;
    private Context mContext;
    private MyListViewAdapter mMyListViewAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_activity_mylistview);

        ButterKnife.bind(this);
        //初始化数据
        init();

        mContext = MyListView.this;

        // 创建并设置Adapter
        mMyListViewAdapter = new MyListViewAdapter(mContext, (LinkedList<ListViews>) mArrayList);
        mLv.setAdapter(mMyListViewAdapter);

        //设置item点击监听事件
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MyListView.this, (mArrayList.get(position).getName()), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {

        mArrayList = new LinkedList<ListViews>();
        ListViews a = new ListViews("周杰伦", R.drawable.module_singer_a_normal);
        mArrayList.add(a);
        ListViews b = new ListViews("薛之谦", R.drawable.module_singer_b_normal);
        mArrayList.add(b);
        ListViews c = new ListViews("林俊杰", R.drawable.module_singer_c_normal);
        mArrayList.add(c);
        ListViews d = new ListViews("光良", R.drawable.module_singer_d_normal);
        mArrayList.add(d);
        ListViews e = new ListViews("李荣浩", R.drawable.module_singer_e_normal);
        mArrayList.add(e);

    }
}
