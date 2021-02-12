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

public class MainActivity extends AppCompatActivity {


    CheckBox checkBox;
    ToggleButton ToggleButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);
        final TextView textView1 = findViewById(R.id.textView);
        final TextView textView2 = findViewById(R.id.textView2);
        Button  button = findViewById(R.id.button);
        final Button  button2 = findViewById(R.id.button2);
        ToggleButton1 = findViewById(R.id.toggleButton);
        final Switch switch1 = findViewById(R.id.switch1);
        checkBox = findViewById(R.id.checkBox);
        final ImageView imageView = findViewById(R.id.imageView);



        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(checkBox.isChecked())
                   textView2.setText("Ура!");
               else
                   textView2.setText("");

            }
        });

        ToggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ToggleButton1.isChecked())
                {
                    textView1.setText("У меня закончилась");
                    textView2.setText("Фантазия");
                }else{
                    textView1.setText("");
                    textView2.setText("");
                }

            }
        });

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                if(switch1.isChecked()){
                    temp = textView2.getText().toString();
                    textView2.setText(textView1.getText());
                    textView1.setText(temp);
                }
                else {
                    temp = textView2.getText().toString();
                    textView2.setText(textView1.getText());
                    textView1.setText(temp);}

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                textView1.setText(str+", приветствую!");
            }
        });
        button.setOnClickListener((View.OnClickListener) this);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }

        });
    }

    private void openActivity2() {

        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }

}