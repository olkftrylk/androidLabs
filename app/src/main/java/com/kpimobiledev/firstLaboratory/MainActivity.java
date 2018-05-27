package com.kpimobiledev.firstLaboratory;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import com.example.firstlaboratory.R;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    EditText editText1, leftBorder, rightBorder;
    private final static String FILE_NAME = "content.txt";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    text1=(TextView) findViewById(R.id.textView6);
    text2=(TextView) findViewById(R.id.textView);
    editText1=(EditText) findViewById(R.id.editText7);
    leftBorder=(EditText) findViewById(R.id.editText);
    rightBorder=(EditText) findViewById(R.id.editText2);
        Button button2 = (Button) findViewById(R.id.button2);
    deleteFile("content.txt");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FileOutputStream fos = null;
                try {
                    String text_of_list="Color: "+editText1.getText() + "\n" +
                            "Price interval: "+ leftBorder.getText() + " - " + rightBorder.getText()+ "\n";
                    fos = openFileOutput(FILE_NAME, MODE_APPEND);
                    fos.write(text_of_list.getBytes());
                    Toast.makeText(getBaseContext(), "Data is saved", Toast.LENGTH_SHORT).show();
                } catch (IOException ex) {
                    Toast.makeText(getBaseContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
                finally
                {
                    try
                    {
                        if(fos!=null)
                            fos.close();
                    }
                    catch(IOException ex)
                    {

                        Toast.makeText(getBaseContext(), ex.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void openText(View view) {
        FileInputStream fin = null;

        try
        {
            fin = openFileInput(FILE_NAME);
            Intent n = new Intent(this, SecondActivity_Output.class);

            startActivity(n);
        }
        catch (IOException ex)
        {
            Toast.makeText(this, "File is empty!", Toast.LENGTH_SHORT).show();
        }

        //Intent n = new Intent(this, SecondActivity_Output.class);
        //startActivity(n);
    }
//    public void onMyButtonClick(View view){
//        Toast.makeText(this,"You specified the following order parameters: ",Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,"Color of flowers - "+editText1.getText(),Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,"Price from - "+leftBorder.getText()+" to "+rightBorder.getText(),Toast.LENGTH_SHORT).show();
//    }



}
