package com.example.nuts.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.nuts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.nuts_profile, container, false);

        /*view.findViewById(R.id.btn_check_mobile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentStack stack = new FragmentStack(getActivity(), getFragmentManager(), R.id.container);
                stack.replace(new ProfileFragment());
            }
        });*/
        return view;
    }

}
