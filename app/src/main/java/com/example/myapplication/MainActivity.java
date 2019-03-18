package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView info;
    private Button Login;
    private int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        info = (TextView) findViewById(R.id.tvinfo);
        Login = (Button) findViewById(R.id.btnLogin);

        info.setText("No. Of Attempts Remaining: ");

    }

    private void validate(String userName, String userPassword)
    {
        if((userName == "Prateek") && (userPassword == "12345"))
        {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else
        {
            counter --;
            info.setText("No. of Attempts remaining: " + String.valueOf(counter));
            if(counter == 0)
            {
                Login.setEnabled(false);
            }

        }

    }
}
