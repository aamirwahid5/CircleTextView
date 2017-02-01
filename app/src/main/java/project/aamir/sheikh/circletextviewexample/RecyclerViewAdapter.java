package project.aamir.sheikh.circletextviewexample;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import project.aamir.sheikh.circletextview.CircleTextView;

/**
 * Created by Aamir on 01-02-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyItems> {

    ArrayList<String> mArrayList;


    public RecyclerViewAdapter(ArrayList<String> mArrayList) {

        this.mArrayList = mArrayList;
    }


    @Override
    public MyItems onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        MyItems items = new MyItems(v);
        return items;
    }

    @Override
    public void onBindViewHolder(MyItems holder, int position) {
        holder.mTextView.setText(mArrayList.get(position));
        holder.mCircleTextView.setCustomText(mArrayList.get(position));
        holder.mCircleTextView.setSolidColor(position);
        holder.mCircleTextView.setTextColor(Color.WHITE);
        holder.mCircleTextView.setCustomTextSize(18);

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class MyItems extends RecyclerView.ViewHolder {
        TextView mTextView;
        CircleTextView mCircleTextView;

        public MyItems(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv);
            mCircleTextView = (CircleTextView) itemView.findViewById(R.id.ctv);

        }
    }
}
