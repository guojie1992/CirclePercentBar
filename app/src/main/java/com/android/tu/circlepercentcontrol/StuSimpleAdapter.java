package com.android.tu.circlepercentcontrol;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 2018/1/27.
 */

public class StuSimpleAdapter extends RecyclerView.Adapter<BindStuInfoViewHolder>{

    private final static String TAG = "StuSimpleAdapter";
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<String> exams = new ArrayList<String>();

    public StuSimpleAdapter (ArrayList<String> items,ArrayList<String> exams){
        this.items = items;
        this.exams = exams;
    }

    @Override
    public BindStuInfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //添加布局
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_item,parent,false);
        Log.e(TAG, "inflated view is " + view);
        BindStuInfoViewHolder bindStuInfoViewHolder = new BindStuInfoViewHolder(view);
        return bindStuInfoViewHolder;
    }

    @Override
    public void onBindViewHolder(BindStuInfoViewHolder holder, int position) {
        //没有数据来源；
        String info = items.get(position);
        String exam_info = exams.get(position);
        View view = holder.itemView;
        holder.textView.setText(info);
        holder.exam_textView.setText(exam_info);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

}

class BindStuInfoViewHolder extends RecyclerView.ViewHolder {
    //当前item的所有的控件
    TextView textView;
    TextView exam_textView;
    public BindStuInfoViewHolder(View view){
        super(view);
        textView = (TextView) view.findViewById(R.id.stu_name);
        exam_textView = (TextView) view.findViewById(R.id.bbb);
    }
}
