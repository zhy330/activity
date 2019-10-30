package com.example.my_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private Button bt4;
    private TextView text_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        in();
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3_1 = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent3_1);

            }
        });

        Intent intent13 = getIntent();
        String G3 = intent13.getStringExtra("G3");
        text_output.setText(G3);



    }
    private void in() {
        bt4 = findViewById(R.id.btn_end);
        text_output = findViewById(R.id.text_output);
    }
}

