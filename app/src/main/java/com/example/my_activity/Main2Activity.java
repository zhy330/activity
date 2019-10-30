package com.example.my_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Comparator;

public class Main2Activity extends AppCompatActivity {

    private ImageButton bt;
    private Button bt_start;
    private int sex=0;
    private int year=0;
    private double weight=0.1;
    private double height=0.1;
    private double bmi=0.1;
    private double bone=0.1;
    private double fat=0.1;
    private double water=0.1;
    private double muscle=0.1;
    private double metabolism=0.1;
    private int goal1;private String goal2;String goal3;
    private double height1;private String height2;
    private double weight1;private String weight2;private double weight_bz;
    private double bmi1=0.1;private String bmi2;private String bmi3;private double bmig;
    private double fat1=0.1;private String fat2;private String fat3;private double fatg;
    private double water1;private String water2;private String water3;private double waterg;
    private double muscle1;private String muscle2;private String muscle3;private double muscleg;
    private double bone1;private String bone2;private String bone3;private double boneg;
    private double metabolism1;private String metabolism2;private String metabolism3;private double metabolismg;
    private EditText text_sex;
    private EditText text_year;
    private EditText text_height;
    private EditText text_weight;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bowt();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2_1 = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent2_1);
            }
        });
        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sexString = text_sex.getText().toString();
                String yearString = text_year.getText().toString();
                String weightString = text_weight.getText().toString();
                String heightString = text_height.getText().toString();
                if(sexString.equals("")){Toast.makeText(Main2Activity.this,"请正确输入",Toast.LENGTH_LONG).show();}
                if(yearString.equals("")){Toast.makeText(Main2Activity.this,"请正确输入",Toast.LENGTH_LONG).show();}
                if(weightString.equals("")){Toast.makeText(Main2Activity.this,"请正确输入",Toast.LENGTH_LONG).show();}
                if(heightString.equals("")){Toast.makeText(Main2Activity.this,"请正确输入",Toast.LENGTH_LONG).show();}
                else{
                    int sex = Integer.valueOf(sexString);
                    int year =Integer.valueOf(yearString);
                    Double weight = Double.valueOf(weightString);
                    Double height = Double.valueOf(heightString);
                }
                if (sex!=0 && (year >= 1 && year <= 100) && (height >= 50.0 && height <= 250.0) && (weight >= 5.0 && weight <= 200.0)) {
                    if (sex==1) {
                        weight1 = weight;//// intent.putExtra("we1",weight1);
                        height1 = height;//intent.putExtra("h1",height1);
                        bmi = weight/(height * height*0.0001);//intent.putExtra("bmi1",bmi);
                        bone = (weight - year) * 0.2;//intent.putExtra("b1",bone);
                        fat = 1.2 * bmi + 0.23 * year - 5.4 - 10.8;//intent.putExtra("f1",fat);
                        muscle = 7800 / (weight * 2);//intent.putExtra("mu1",muscle);
                        water = muscle * 1.2;//intent.putExtra("wa1",water);
                        metabolism = 13.7 * weight + 5.0 * height - 6.8 * year + 66;//intent.putExtra("me1",metabolism);
                        if (bmi >= 10.0 && bmi <= 18.5) {
                            bmi2 = "过轻";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 75.0;
                        }
                        if (bmi > 18.5 && bmi <= 24.0) {
                            bmi2 = "正常";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 100.0;
                        }
                        if (bmi > 24.0 && bmi <= 28.0) {
                            bmi2 = "超重";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 80.0;
                        }
                        if (bmi > 28.0 && bmi <= 35.0) {
                            bmi2 = "肥胖";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 60.0;
                        }

                        if ( fat <= 15) {
                            fat2 = "过瘦";//intent.putExtra("fa2",fat2);
                            fat3 = "";
                            fatg = 70.0;
                        }
                        if (fat > 15 && fat <= 25) {
                            fat2 = "正常";//intent.putExtra("fa2",fat2);
                            fat3 = "";
                            fatg = 100.0;
                        }
                        if (fat > 25 ) {
                            fat2 = "超重";//intent.putExtra("fa2",fat2);
                            fat3 = "";
                            fatg = 70.0;
                        }

                        if (water < 0.7) {
                            water2 = "偏低";//intent.putExtra("wa2",water2);
                            water3 = "";
                            waterg = 70.0;
                        }
                        if (water >= 0.7 && water <= 0.8) {
                            water2 = "正常";//intent.putExtra("wa2",water2);
                            water3 = "";
                            waterg = 100.0;
                        }
                        if (water > 0.8) {
                            water2 = "偏高";//intent.putExtra("wa2",water2);
                            water3 = "";
                            waterg = 70.0;
                        }
                        if(muscle<=60){
                            muscle2 = "偏低";//intent.putExtra("mu2",muscle2);
                            muscle3 = "";
                            muscleg = 60.0;
                        }
                        if(muscle<=65&&muscle>60) {
                            muscle2 = "正常";//intent.putExtra("mu2",muscle2);
                            muscle3 = "";
                            muscleg = 80.0;
                        }
                        if(muscle>65) {
                            muscle2 = "优秀";//intent.putExtra("mu2",muscle2);
                            muscle3 = "";
                            muscleg = 100.0;
                        }
                        if (bone < -4.0) {
                            bone2 = "风险高";//intent.putExtra("b2",bone2);
                            bone3 = "";
                            boneg = 50.0;
                        }
                        if (bone >= -4.0 && bone <= -1.0) {
                            bone2 = "中度风险";//intent.putExtra("b2",bone2);
                            bone3 = "";
                            boneg = 70.0;
                        }
                        if (bone > -1.0) {
                            bone2 = "风险低";//intent.putExtra("b2",bone2);
                            bone3 = "";
                            boneg = 100.0;
                        }

                        if (metabolism < 1300.0) {
                            metabolism2 = "偏低";//intent.putExtra("me2",metabolism2);
                            metabolism3 = "";
                            metabolismg = 70.0;
                        }
                        if (metabolism >= 1300.0 && metabolism <= 1900.0) {
                            metabolism2 = "正常";//intent.putExtra("me2",metabolism2);
                            metabolism3 = "";
                            metabolismg = 100.0;
                        }
                        if (metabolism > 1900.0) {
                            metabolism2 = "偏高";//intent.putExtra("me2",metabolism2);
                            metabolism3 = "";
                            metabolismg = 70.0;
                        }

                        goal1 =(int) ( bmig * 0.5 + fatg * 0.1 + waterg * 0.1 + muscleg * 0.1 + boneg * 0.1 + metabolismg * 0.1);//intent.putExtra("g1",goal1);
                        if (goal1 >= 85) {
                            goal2 = "优秀";//intent.putExtra("g2",goal2);
                            goal3 = "你的身体状况很好，不要因此感到满足，请继续保持，坚持日常锻炼和良好的饮食习惯。";
                        }
                        if (goal1 >= 60 && goal1 < 85) {
                            goal2 = "合格";//intent.putExtra("g2",goal2);
                            goal3 = "你的身体状况基本达标，需要适当加强日常锻炼，合理搭配饮食，相信你会遇到更好的自己，加油！";
                        }
                        if (goal1 < 60) {
                            goal2 = "不合格";//intent.putExtra("g2",goal2);
                            goal3 = "你的身体状况比较糟糕，建议查看返还的数据，找出存在的问题，积极改善身体状况，加油。";
                        }
                        if (height < 160.0) {
                            height2 = "偏低";
                            //intent.putExtra("h2",height2);
                        }
                        if (height >= 160.0) {
                            height2 = "标准"; //intent.putExtra("h2",height2);
                        }

                        weight_bz = (height - 80) * 0.7;
                        if (weight >= weight_bz * 0.9 && weight <= weight_bz * 1.1) {
                            weight2 = "标准"; //intent.putExtra("we2",weight2);
                        }
                        if (weight > weight_bz * 1.1 && weight <= weight_bz * 1.2) {
                            weight2 = "偏重";//intent.putExtra("we2",weight2);
                        }
                        if (weight > weight_bz * 1.2) {
                            weight2 = "肥胖";//intent.putExtra("we2",weight2);
                        }
                        if (weight < weight_bz * 0.9 && weight >= weight_bz * 0.8) {
                            weight2 = "偏瘦";//intent.putExtra("we2",weight2);
                        }
                        if (weight < weight_bz * 0.8) {
                            weight2 = "营养不良";//intent.putExtra("we2",weight2);
                        }

                    } else if (sex==2) {
                        height1 = height;//intent.putExtra("h1",height1);
                        weight1 = weight;//intent.putExtra("we1",weight1);
                        bmi = weight /( height * height*0.0001);//intent.putExtra("bmi1",bmi);
                        bone = (weight - year) * 0.2;//intent.putExtra("b1",bone);
                        fat = 1.2 * bmi + 0.23 * year - 5.4;//intent.putExtra("f1",fat);
                        muscle = 5600 / (weight * 2.0);//intent.putExtra("mu1",muscle);
                        water = muscle * 1.3;//intent.putExtra("wa1",water);
                        metabolism = 9.6 * weight + 1.8 * height - 4.7 * year + 655.0;//intent.putExtra("me1",metabolism);
                        if (bmi <= 18.5) {
                            bmi2 = "过轻";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 75.0;
                        }
                        if (bmi > 18.5 && bmi <= 24.0) {
                            bmi2 = "正常";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 100.0;
                        }
                        if (bmi > 24.0 && bmi <= 28.0) {
                            bmi2 = "超重";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 80.0;
                        }
                        if (bmi > 28.0 && bmi <= 35.0) {
                            bmi2 = "肥胖";//intent.putExtra("bmi2",bmi2);
                            bmi3 = "";
                            bmig = 60.0;
                        }

                        if ( fat <= 20) {
                            fat2 = "过瘦";//intent.putExtra("fa2",fat2);
                            fat3 = "";
                            fatg = 70.0;
                        }
                        if (fat > 20 && fat <= 30) {
                            fat2 = "正常";//intent.putExtra("fa2",fat2);
                            fat3 = "";
                            fatg = 100.0;
                        }
                        if (fat > 30 ) {
                            fat2 = "超重";//intent.putExtra("fa2",fat2);
                            fat3 = "";
                            fatg = 70.0;
                        }

                        if (water < 0.7) {
                            water2 = "偏低";//intent.putExtra("wa2",water2);
                            water3 = "";
                            waterg = 70.0;
                        }
                        if (water >= 0.7 && water <= 0.8) {
                            water2 = "正常";//intent.putExtra("wa2",water2);
                            water3 = "";
                            waterg = 100.0;
                        }
                        if (water > 0.8) {
                            water2 = "偏高";//intent.putExtra("wa2",water2);
                            water3 = "";
                            waterg = 70;
                        }
                        if(muscle<=55){
                            muscle2 = "偏低";//intent.putExtra("mu2",muscle2);
                            muscle3 = "";
                            muscleg = 60.0;
                        }
                        if(muscle<=60&&muscle>55) {
                            muscle2 = "正常";//intent.putExtra("mu2",muscle2);
                            muscle3 = "";
                            muscleg = 80.0;
                        }
                        if(muscle>60) {
                            muscle2 = "优秀";//intent.putExtra("mu2",muscle2);
                            muscle3 = "";
                            muscleg = 100.0;
                        }

                        if (bone < -4.0) {
                            bone2 = "风险高";//intent.putExtra("b2",bone2);
                            bone3 = "";
                            boneg = 50.0;
                        }
                        if (bone >= -4.0 && bone <= -1) {
                            bone2 = "中度风险";//intent.putExtra("b2",bone2);
                            bone3 = "";
                            boneg = 70.0;
                        }
                        if (bone > -1.0) {
                            bone2 = "风险低";//intent.putExtra("b2",bone2);
                            bone3 = "";
                            boneg = 100.0;
                        }

                        if (metabolism < 1100.0) {
                            metabolism2 = "偏低";//intent.putExtra("me2",metabolism2);
                            metabolism3 = "";
                            metabolismg = 70.0;
                        }
                        if (metabolism >= 1100.0 && metabolism <= 1500.0) {
                            metabolism2 = "正常";//intent.putExtra("me2",metabolism2);
                            metabolism3 = "";
                            metabolismg = 100.0;
                        }
                        if (metabolism > 1500.0) {
                            metabolism2 = "偏高";//intent.putExtra("me2",metabolism2);
                            metabolism3 = "";
                            metabolismg = 70.0;
                        }

                        goal1 = (int)(bmig * 0.5 + fatg * 0.1 + waterg * 0.1 + muscleg * 0.1 + boneg * 0.1 + metabolismg * 0.1);//intent.putExtra("g1",goal1);
                        if (goal1 >= 85) {
                            goal2 = "优秀";//intent.putExtra("g2",goal2);
                            goal3 = "你的身体状况很好，不要因此感到满足，请继续保持，坚持日常锻炼和良好的饮食习惯。";
                        }
                        if (goal1 >= 70 && goal1 < 85) {
                            goal2 = "合格";//intent.putExtra("g2",goal2);
                            goal3 = "你的身体状况基本达标，需要适当加强日常锻炼，合理搭配饮食，相信你会遇到更好的自己，加油！";
                        }
                        if (goal1 < 60) {
                            goal2 = "不合格";//intent.putExtra("g2",goal2);
                            goal3 = "你的身体状况比较糟糕，建议查看返还的数据，找出存在的问题，积极改善身体状况，加油。";
                        }
                        if (height < 160.0) {
                            height2 = "偏低";//intent.putExtra("h2",height2);
                        }
                        if (height >= 160.0) {
                            height2 = "标准";//intent.putExtra("h2",height2);
                        }

                        weight_bz = (height - 80) * 0.7;
                        if (weight >= weight_bz * 0.9 && weight <= weight_bz * 1.1) {
                            weight2 = "标准";//intent.putExtra("we2",weight2);
                        }
                        if (weight > weight_bz * 1.1 && weight <= weight_bz * 1.2) {
                            weight2 = "偏重";//intent.putExtra("we2",weight2);
                        }
                        if (weight > weight_bz * 1.2) {
                            weight2 = "肥胖";//intent.putExtra("we2",weight2);
                        }
                        if (weight < weight_bz * 0.9 && weight >= weight_bz * 0.8) {
                            weight2 = "偏瘦";//intent.putExtra("we2",weight2);
                        }
                        if (weight < weight_bz * 0.8) {
                            weight2 = "营养不良";//intent.putExtra("we2",weight2);
                        }
                    } else {
                        Toast.makeText(Main2Activity.this,"请正确输入",Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(Main2Activity.this,"请正确输入",Toast.LENGTH_LONG).show();
                }

                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                DecimalFormat df = new DecimalFormat("#.0");
                String bone1 = df.format(bone);String fat1 = df.format(fat);
                String metabolism1 = df.format(metabolism);String water1 = df.format(water);
                String bmi1 = df.format(bmi);String muscle1 = df.format(muscle);

                DecimalFormat dg = new DecimalFormat("#");
                String  weight10 = dg.format(weight1);String height10 = dg.format(height1);



                intent.putExtra("we1",weight10);intent.putExtra("h1",height10);intent.putExtra("bmi1",bmi1);intent.putExtra("b1",bone1);
                intent.putExtra("f1",fat1+"%");intent.putExtra("mu1",muscle1+"%");intent.putExtra("wa1",water1+"%");intent.putExtra("me1",metabolism1);
                intent.putExtra("bmi2",bmi2);intent.putExtra("fa2",fat2);intent.putExtra("wa2",water2);intent.putExtra("mu2",muscle2);
                intent.putExtra("b2",bone2);intent.putExtra("me2",metabolism2);intent.putExtra("g1",goal1);intent.putExtra("g2",goal2);
                intent.putExtra("h2",height2);intent.putExtra("we2",weight2);
                intent.putExtra("g3",goal3);
                startActivity(intent);finish();
           /*     Double h1 = "height1";String h2 = "height2";String g1 = "goal1";String g2 = "goal2";
                String we1 = "weight1";String we2 = "weight2";String b1 = "bone1";String b2 = "bone2";
                String f1 = "fat1";String f2 = "fat2";String bmi1 = "bmi1";String bmi2 = "bmi2";
                String mu1 = "muscle1";String mu2 = "muscle2";String me1 = "metabolism1";String me2 = "metabolism2";
                String wa1 = "water1";String wa2 = "water2";

                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("h1", h1);intent.putExtra("h2", heihht2);intent.putExtra("g1", goal1);intent.putExtra("g2", goal2);
                intent.putExtra("we1", weight1);intent.putExtra("we2", weight1);intent.putExtra("b1", bone1);intent.putExtra("b2", bone2);
                intent.putExtra("f1", fat1);intent.putExtra("f2", fat2);intent.putExtra("bmi1", bmi1);intent.putExtra("bmi2", bmi2);
                intent.putExtra("mu1", muscle1);intent.putExtra("mu2", muscle2);intent.putExtra("me1", metabolism1);intent.putExtra("me2", metabolism2);
                intent.putExtra("wa1", water1);intent.putExtra("wa2", water2);
                startActivity(intent);
                finish();*/


            }

        });

        }

    private void bowt() {
        bt = findViewById(R.id.btn2_back);
        bt_start = findViewById(R.id.btn_start);
        text_sex = findViewById(R.id.text_sex);
        text_year = findViewById(R.id.text_year);
        text_height = findViewById(R.id.text_height);
        text_weight = findViewById(R.id.text_weight);
    }
   }


