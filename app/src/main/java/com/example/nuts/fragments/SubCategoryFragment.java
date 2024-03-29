package com.example.nuts.fragments;


import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.nuts.DummyContent;
import com.example.nuts.R;
import com.example.nuts.adapter.FilterCategoryAdapter;
import com.example.nuts.utils.navigation.ItemDecorationAlbumColumns2;

public class SubCategoryFragment extends Fragment implements View.OnClickListener {


    public RecyclerView rv;
    private FilterCategoryAdapter adapter;
    private LinearLayoutManager layoutManager;
    private View rootView = null;

    @SuppressWarnings("deprecation")
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_categories, container, false);
            rv = rootView.findViewById(R.id.listView);
            layoutManager = new LinearLayoutManager(getActivity());
            rv.addItemDecoration(new ItemDecorationAlbumColumns2(rv.getContext(), 1));
            StaggeredGridLayoutManager lmanager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            rv.setLayoutManager(lmanager);
            rv.setHasFixedSize(true);
            int pos = getArguments().getInt("pos");
            //adapter = new FilterCategoryAdapter(getActivity(), feed, pos);
            //rv.setAdapter(adapter);
            rv.setAdapter(new FilterCategoryAdapter(DummyContent.ITEMS));

            rootView.findViewById(R.id.cv_search_advance).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Dialog dialog = new Dialog(getActivity());
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog.setCancelable(false);
                    dialog.setContentView(R.layout.dialog_advane_search);

                    Window window = dialog.getWindow();
                    ViewGroup.LayoutParams params = window.getAttributes();
                    window.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                    params.width = WindowManager.LayoutParams.MATCH_PARENT;
                    params.height = WindowManager.LayoutParams.WRAP_CONTENT;
                    window.setAttributes((WindowManager.LayoutParams) params);
                    window.setGravity(Gravity.CENTER);
                    dialog.show();
                }
            });
        }
        return rootView;
    }


    @Override
    public void onClick(View v) {

    }
}
