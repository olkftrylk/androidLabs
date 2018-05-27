package com.kpimobiledev.firstLaboratory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;

import java.io.IOException;
public class SecondActivity_Output extends AppCompatActivity {
    private final static String FILE_NAME = "content.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__output);
        FileInputStream fin=null;
        TextView textView2=(TextView) findViewById(R.id.textView2);
        textView2.setMovementMethod(new ScrollingMovementMethod());
        try{
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView2.setText(text);
        }
        catch(IOException ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally
        {

            try
            {
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex)
            {
                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
