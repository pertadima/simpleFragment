package com.example.irfan.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentB extends Fragment {
    private View layout;
    private Button btn;
    private TextView textView;
    private int i;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_b, container, false);
        btn = layout.findViewById(R.id.button);
        textView= layout.findViewById(R.id.text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                textView.setText(String.valueOf(i));
                i++;
            }
        });
        return layout;
    }
}
