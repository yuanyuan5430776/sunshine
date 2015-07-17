package com.example.maoyy.sunshine;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String forecast = (String) getActivity().getIntent().getExtras().get(Intent.EXTRA_TEXT);
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView textView = (TextView) view.findViewById(R.id.fragment_text_view);
        textView.setText(forecast);
        return view;
    }
}
