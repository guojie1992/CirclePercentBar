package com.android.tu.circlepercentcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

/**
 * Created by dell on 2018/1/27.
 */

public class StuInfoActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private RecyclerView.LayoutManager layoutManager;
    private StuSimpleAdapter stuSimpleAdapter;

    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<String> exams = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_stu_info);

        initView();

    }
    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.stuInfo_recycleview);
        //列数为两列
        int spanCount = 1;
        layoutManager = new StaggeredGridLayoutManager(spanCount,StaggeredGridLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(layoutManager);
        //构建一个临时数据源
        for (int i = 0; i < 10; i++) {
            items.add("李大松" );
            exams.add("考试时间:已经考试");
        }

        stuSimpleAdapter = new StuSimpleAdapter(items,exams);
        mRecyclerView.setAdapter(stuSimpleAdapter);
    }
}
