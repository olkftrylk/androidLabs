package com.example.second_laboratory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    TextView text1,text2;
    EditText editText1, leftBorder, rightBorder;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView) findViewById(R.id.textView2);
        text2=(TextView) findViewById(R.id.textView);
        editText1=(EditText) findViewById(R.id.editText3);
        leftBorder=(EditText) findViewById(R.id.editText2);
        rightBorder=(EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getBaseContext(), "You specified the following order parameters: ", Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(),  "Color of flowers - "+editText1.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(), "Price from - "+leftBorder.getText()+" to " +rightBorder.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
