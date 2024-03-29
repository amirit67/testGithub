package com.example.nuts.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.nuts.DummyContent;
import com.example.nuts.R;

import java.util.List;


public class addressAdapter extends RecyclerView.Adapter<addressAdapter.ViewHolder> {

    private final List<DummyContent.DummyItem> mValues;


    public addressAdapter(List<DummyContent.DummyItem> items) {

        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_address, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.bindTo(holder.mItem);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public DummyContent.DummyItem mItem;


        public ViewHolder(View view) {
            super(view);
            mView = view;


        }

        void bindTo(DummyContent.DummyItem dummyItem) {
            //txtWeight.setText(dummyItem.content);
//
        }


//        @Override
//        public String toString() {
//            return super.toString() + " '" + mContentView.getText() + "'";
//        }
    }
}