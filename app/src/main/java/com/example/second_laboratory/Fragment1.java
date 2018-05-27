package com.example.second_laboratory;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    TextView text1,text2;
    EditText editText1, leftBorder, rightBorder;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View rootView = inflater.inflate(R.layout.fragment1, container, false);
        text1=(TextView) rootView.findViewById(R.id.textView2);
        text2=(TextView) rootView.findViewById(R.id.textView);
        editText1=(EditText) rootView.findViewById(R.id.editText3);
        leftBorder=(EditText) rootView.findViewById(R.id.editText2);
        rightBorder=(EditText) rootView.findViewById(R.id.editText);
        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               Fragment f2=getFragmentManager().findFragmentById(R.id.fragment2);
                ((TextView) f2.getView().findViewById(R.id.textView5)).setText("You specified the following order parameters: ");
                ((TextView) f2.getView().findViewById(R.id.textView4)).setText("Color of flowers - "+editText1.getText());
                ((TextView) f2.getView().findViewById(R.id.textView6)).setText("Price from - "+leftBorder.getText()+" to " +rightBorder.getText());
            }
        });
        return rootView;
    }
}
