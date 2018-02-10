package com.example.brandonhussey.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }

    public boolean checkPassword(String pass)   {

        boolean flag;

        //since case insensitve, make lowercase to test

        if(pass!=null && pass.toLowerCase().equals("password")) {
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    public boolean checkLength(String pass) {

        boolean flag;

        //ensure greater or equal to 8
        if(pass!=null && pass.length()>=8)  {
            flag = true;
        } else  {
            flag = false;
        }
        return flag;
    }
}
