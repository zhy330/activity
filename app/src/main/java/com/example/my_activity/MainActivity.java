package com.example.my_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Set;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    private ImageButton bt1;
    private Button btput;
    private TextView text1_goal1;private TextView fat_rate1;private TextView fat_rate2;
    private TextView text1_goal2;private TextView water_rate1;private TextView water_rate2;
    private TextView text1_weight1;private TextView bone1;private TextView bone2;
    private TextView text1_weight2;private TextView muscle_rate1;private TextView muscle_rate2;
    private TextView text1_height1;private TextView metabolism1;private TextView metabolism2;
    private TextView text1_height2;
    private TextView text1_bmi1;
    private TextView text1_bmi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent2);
            }


        });


        Intent intent = getIntent();
        String h10 = intent.getStringExtra("h1");String h20 = intent.getStringExtra("h2");
        int g10 = intent.getIntExtra("g1",0);String g20 = intent.getStringExtra("g2");
        String bmi10 = intent.getStringExtra("bmi1");String bmi20 = intent.getStringExtra("bmi2");
        String f10 = intent.getStringExtra("f1");String fa20 = intent.getStringExtra("fa2");
        String we10 = intent.getStringExtra("we1");String we20 = intent.getStringExtra("we2");
        String b10 = intent.getStringExtra("b1");String b20 = intent.getStringExtra("b2");
        String mu10 = intent.getStringExtra("mu1");String mu20 = intent.getStringExtra("mu2");
        String me10 = intent.getStringExtra("me1");String me20 = intent.getStringExtra("me2");
        String wa10 = intent.getStringExtra("wa1");String wa20 = intent.getStringExtra("wa2");

        text1_goal1.setText(String.valueOf(g10));text1_goal2.setText(g20);text1_weight1.setText(we10);text1_weight2.setText(we20);
        text1_height1.setText(h10);text1_height2.setText(h20);text1_bmi1.setText(bmi10);text1_bmi2.setText(bmi20);
        fat_rate1.setText(f10);fat_rate2.setText(fa20);water_rate1.setText(wa10);water_rate2.setText(wa20);
        muscle_rate1.setText(mu10);muscle_rate2.setText(mu20);bone1.setText(b10);bone2.setText(b20);
        metabolism1.setText(me10);metabolism2.setText(me20);

        btput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13 = new Intent(MainActivity.this, Main3Activity.class);
                Intent intent = getIntent();String g3 = intent.getStringExtra("g3");
                intent13.putExtra("G3",g3);

                startActivity(intent13);
            }
        });



    }

    private void initUI() {
        bt1 = findViewById(R.id.btn_go);btput = findViewById(R.id.btn_output);
        text1_goal1 = findViewById(R.id.text1_goal1);text1_goal2 = findViewById(R.id.text1_goal2);
        text1_height1 = findViewById(R.id.text1_height1);text1_height2 = findViewById(R.id.text1_height2);
        text1_weight1 = findViewById(R.id.text1_weight1);text1_weight2 = findViewById(R.id.text1_weight2);
        text1_bmi1 = findViewById(R.id.text1_bmi1);text1_bmi2 = findViewById(R.id.text1_bmi2);
        water_rate1 = findViewById(R.id.water_rate1);water_rate2 = findViewById(R.id.water_rate2);
        fat_rate1 = findViewById(R.id.fat_rate1);fat_rate2 = findViewById(R.id.fat_rate2);
        muscle_rate1 = findViewById(R.id.muscle_rate1);muscle_rate2 = findViewById(R.id.muscle_rate2);
        bone1 = findViewById(R.id.bone1);bone2 = findViewById(R.id.bone2);
        metabolism1 = findViewById(R.id.metabolism1);metabolism2 = findViewById(R.id.metabolism2);



    }
}
