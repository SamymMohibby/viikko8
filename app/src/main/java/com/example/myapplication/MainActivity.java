package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText textInput;
    private TextView textOutput;

    private int fontSize;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput = findViewById(R.id.editTextInput);
        textOutput = findViewById(R.id.textArea);
        fontSize = 14;


    }
    public void transformText(View view) {
        System.out.println((textInput.getText()));
        StringBuilder sb = new StringBuilder((textInput.getText().toString()));
        sb.reverse();

        Toast.makeText(this,sb.toString(),Toast.LENGTH_LONG).show();

        textOutput.setText(sb.toString());

    }

    public void increaseTextSize(View view) {
        textOutput.setTextSize(++fontSize);

    }
    public void decreaseTextSize(View view) {
        textOutput.setTextSize(--fontSize);



    }

}