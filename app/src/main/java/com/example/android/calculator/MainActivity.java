package com.example.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView calView;
    private String num;
    private int sum;
    private String min;
    private String div;
    private String mul;
    private int parseInt;
    private String num2;
    private int parseInt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       calView =(TextView)findViewById(R.id.textView);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn_plus).setOnClickListener(this);
        findViewById(R.id.btn_min).setOnClickListener(this);
        findViewById(R.id.btn_div).setOnClickListener(this);
        findViewById(R.id.btn_mul).setOnClickListener(this);
        findViewById(R.id.btn_comma).setOnClickListener(this);
        findViewById(R.id.btn_equl).setOnClickListener(this);
        findViewById(R.id.btn_ac).setOnClickListener(this);
        findViewById(R.id.btn_c).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn0:
                if(num == null){
                    calView.setText("0");
                }else
                    num = num + "0";

                break;
            case R.id.btn1:
                if(num == null) {
                    num = "1";
                }else {
                    num = num + "1";
                }
                break;
            case R.id.btn2:
                if(num == null) {
                    num = "2";
                }else {
                    num = num + "2";
                }
                break;
            case R.id.btn3:
                if(num == null) {
                    num = "3";
                }else {
                    num = num + "3";
                }
                break;
            case R.id.btn4:
                if(num == null) {
                    num = "4";
                }else {
                    num = num + "4";
                }
                break;
            case R.id.btn5:
                if(num == null) {
                    num = "5";
                }else {
                    num = num + "5";
                }
                break;
            case R.id.btn6:
                if(num == null) {
                    num = "6";
                }else {
                    num = num + "6";
                }
                break;
            case R.id.btn7:
                if(num == null) {
                    num = "7";
                }else {
                    num = num + "7";
                }
                break;
            case R.id.btn8:
                if(num == null) {
                    num = "8";
                }else {
                    num = num + "8";
                }
                break;
            case R.id.btn9:
                if(num == null) {
                    num = "9";
                }else {
                    num = num + "9";
                }
                break;
            case R.id.btn_plus:

                if(num != null) {

                    sum += parseInt;

                    parseInt= Integer.parseInt(num);
                    parseInt2 = Integer.parseInt(num2);


                    sum = sum + Integer.parseInt(num2);


                }
                num = sum+"";




                break;
            case R.id.btn_min:
                break;
            case R.id.btn_mul:
                break;
            case R.id.btn_div:
                break;
            case R.id.btn_comma:
                break;
            case R.id.btn_ac:
                num = null;
                break;
            case R.id.btn_c:
                break;
            case R.id.btn_equl:

                break;

        }

        if(num == null || num ==""||num =="0"){

            calView.setText("0");
            calView = null;

        } else {
            calView.setText(num);
        }

    }
}
