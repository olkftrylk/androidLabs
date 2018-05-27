package com.example.second_laboratory;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView2 = inflater.inflate(R.layout.fragment2, container, false);

        final TextView t1=(TextView) rootView2.findViewById(R.id.textView4);
        final TextView t2=(TextView) rootView2.findViewById(R.id.textView5);
        final TextView t3=(TextView) rootView2.findViewById(R.id.textView6);

        return rootView2;
    }
}
