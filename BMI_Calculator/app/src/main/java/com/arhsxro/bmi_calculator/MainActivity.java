package com.arhsxro.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;

    private RadioButton male;
    private RadioButton female;

    private EditText age;
    private EditText feet;
    private EditText inches;
    private EditText weight;

    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        setupButtonClickListener();


    }

    public void findViews() {

        resultText = findViewById(R.id.text_view_result);

        male = findViewById(R.id.radio_button_male);
        female = findViewById(R.id.radio_button_female);

        age = findViewById(R.id.edit_text_age);
        feet = findViewById(R.id.edit_text_feet);
        inches = findViewById(R.id.edit_text_inches);
        weight = findViewById(R.id.edit_text_weight);

        calculate = findViewById(R.id.button_calculate);
    }

    private void setupButtonClickListener() {
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bmiResult = calculateBmi();

                String ageText = age.getText().toString();
                int age = Integer.parseInt(ageText);
                if(age >= 18){
                    displayResult(bmiResult);
                } else {
                    displayGuidance(bmiResult);
                }

            }
        });
    }


    private double calculateBmi() {
        String feetText = feet.getText().toString();
        String inchesText = inches.getText().toString();
        String weightText = weight.getText().toString();

        //Converting the string to int to calculate bmi.
        int feetInt = Integer.parseInt(feetText);
        int inchesInt = Integer.parseInt(inchesText);
        int weightInt = Integer.parseInt(weightText);

        int totalInches = (feetInt * 12) + inchesInt;

        //height in meters is the inches multiplied by 0.0254
        double heightInMeters = totalInches * 0.0254;

        //BMI formula = weight in kg divided by height in meters squared
        return weightInt / (heightInMeters * heightInMeters);
    }

    private void displayResult(double bmi){

        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiTextResult = myDecimalFormatter.format(bmi);

        String fullResultString;
        if(bmi < 18.5) {
            fullResultString = bmiTextResult + " - You are underweight";
        } else if(bmi > 25){
            fullResultString = bmiTextResult + " - You are overweight";
        } else {
            fullResultString = bmiTextResult + " - You are a healthy weight";
        }
        resultText.setText(fullResultString);
    }

    private void displayGuidance(double bmi) {

        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiTextResult = myDecimalFormatter.format(bmi);

        String fullResultString;
        if(male.isChecked()){
            fullResultString = bmiTextResult + " - as you are under 18 please consult with your doctor for the healthy range for boys";
        } else if(female.isChecked()){
            fullResultString = bmiTextResult + " - as you are under 18 please consult with your doctor for the healthy range for girls";
        } else {
            fullResultString = bmiTextResult + " - as you are under 18 please consult with your doctor for the healthy range";
        }
        resultText.setText(fullResultString);
    }
}