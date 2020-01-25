package com.example.codepath_prework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myText;
    private boolean isBlue = true;
    private boolean isDkgray = true;
    private boolean isText1 = true;
    private EditText inputText;
    private Button resetBTN;



    public void textColorChangeOnClick(View view){
        if(isBlue) {
            myText.setTextColor(Color.GREEN);
            isBlue = false;
        }else {
            myText.setTextColor(Color.parseColor("#00BCD4"));
            isBlue = true;
        }

    }


    public void backgroundColorChangeOnClick(View view){

        if(isDkgray) {
            getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            isDkgray = false;
        }else{
            getWindow().getDecorView().setBackgroundColor(Color.DKGRAY);
            isDkgray = true;
        }
    }

    public void textChangeOnClick(View view){
        String userInpit =  inputText.getText().toString();

        if(userInpit.length() > 0 ) {
            myText.setText(userInpit);
        }else {
            if (isText1) {
                myText.setText("Android is Awesome!");
                isText1 = false;
            } else {
                myText.setText("Hello from Mohammed!");
                isText1 = true;
            }
        }
    }

    public void resetAppOnclick(View view){
        recreate();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.DKGRAY);
        getSupportActionBar().setTitle("\tHELLO WORLD");


        myText = findViewById(R.id.helloTV);
        inputText =  findViewById(R.id.messageET);
        resetBTN = findViewById(R.id.resetAppBTN);




    }
}
