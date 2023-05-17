package com.example.solution1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private String ordered="";
    private String extras="";
    private  String c="",k="",s="";
    private TextView type,extra;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        type=findViewById(R.id.typeTxt);
        extra=findViewById(R.id.eTxt);

        checkBox1=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox4);
        checkBox3=findViewById(R.id.checkBox3);

        radioButton1=findViewById(R.id.radioButton2);
        radioButton2=findViewById(R.id.slsaR);
        radioButton3=findViewById(R.id.radioButton4);


        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                    type.setText(checkBox1.getText());
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox1.setChecked(false);
                    checkBox3.setChecked(false);
                    type.setText(checkBox2.getText());

                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox1.setChecked(false);
                    checkBox2.setChecked(false);
                    type.setText(checkBox3.getText());

                }
            }
        });

//       radioButton1.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//
//           }
//       });
//       radioButton2.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//
//           }
//       });
//       radioButton3.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//
//           }
//       });
        btn=findViewById(R.id.obtn3);
        btn.setOnClickListener(new View.OnClickListener() {
            String c="",s="",k="";
            @Override
            public void onClick(View view) {
                if(checkBox1.isSelected()){
                    ordered= (String) checkBox1.getText();
                }
                else if(checkBox2.isSelected()){
                    ordered= (String) checkBox2.getText();
                }
                else if(checkBox3.isSelected()){
                    ordered= (String) checkBox3.getText();
                }


                if(radioButton1.isChecked()){
                    c= (String) radioButton1.getText();
                }
                else{
                    c="";
                }

                if(radioButton2.isChecked()){
                    s= (String) radioButton2.getText();
                }
                else{
                    s="";
                }

                if(radioButton3.isChecked()){
                    k= (String) radioButton3.getText();
                }
                else{
                    k="";
                }

                extras=c+" "+s+" "+k;

//                type.setText(extras);
                extra.setText(extras);
            }
        });


    }
}