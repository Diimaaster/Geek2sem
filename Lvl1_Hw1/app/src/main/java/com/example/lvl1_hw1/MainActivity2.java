package com.example.lvl1_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {


    CheckBox checkBox;
    ToggleButton ToggleButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button  button5 = findViewById(R.id.button3);
        button5.setOnClickListener((View.OnClickListener) this);



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }

        });
    }
    private void openActivity() {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}