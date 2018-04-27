package com.go.akipuja.inclass2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("BMI Calculator");
    }

    public void buttonClick(View view) {
        try {
            EditText agetext = (EditText) findViewById(R.id.age1);
            EditText weighttext = (EditText) findViewById(R.id.weight1);
            EditText heightfeettext = (EditText) findViewById(R.id.heightfeet);
            EditText heightinchestext = (EditText) findViewById(R.id.heightinches);
            TextView result1 = (TextView) findViewById(R.id.result);
            TextView bmiresult = (TextView) findViewById(R.id.bmi);


            TextView msg = (TextView) findViewById(R.id.message);
            TextView normalbmiresult = (TextView) findViewById(R.id.normalbmi);
            TextView remark1= (TextView)findViewById(R.id.remark);


            double Age = Double.parseDouble(agetext.getText().toString());
            double Weight = Double.parseDouble(weighttext.getText().toString());
            double Heightfeet = Double.parseDouble(heightfeettext.getText().toString());
            double Heightinches = Double.parseDouble(heightinchestext.getText().toString());
            double totalheight = Heightfeet * 12 + Heightinches;



            int BMI = 703 * (int) Weight / ((int)totalheight * (int)totalheight);



            result1.setText("RESULT");
            result1.setTextColor(Color.WHITE);
            bmiresult.setTextColor(Color.WHITE);
            msg.setTextColor(Color.WHITE);
            normalbmiresult.setTextColor(Color.WHITE);
            if (BMI < 18.5)
            {
                bmiresult.setText("BMI=" + Double.toString(BMI) );
                remark1.setText("Underweight");
                remark1.setTextColor(Color.RED);
                msg.setText("You will need to gain" + " to reach BMI of 18.5");
            } else if (BMI >= 18.5 && BMI < 25)
            {
                bmiresult.setText("BMI=" + Double.toString(BMI) );
                remark1.setText("Normal");
                remark1.setTextColor(Color.GREEN);
                msg.setText("Keep it up good work !!");

            } else if (BMI > 25 && BMI < 30) {
                bmiresult.setText("BMI=" + Double.toString(BMI) );
                remark1.setText("Overweight");
                remark1.setTextColor(Color.YELLOW);
                msg.setText("You will need to loose" + " to reach BMI of 25");
            } else if (BMI > 30) {
                bmiresult.setText("BMI=" + Double.toString(BMI) );
                remark1.setText("Obese");
                remark1.setTextColor(Color.BLUE);
                msg.setText("You will need to loose+" + "to reach BMI of 18.5");
            }
            normalbmiresult.setText("Normal BMI range:18.5-25");
        } catch (NumberFormatException exp) {
            System.out.println("ERROR" + exp.getMessage());


        }
    }

    }


