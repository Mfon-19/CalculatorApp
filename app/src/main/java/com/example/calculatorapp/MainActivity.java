package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
    //creates variables that hold reference to the two EditText views the user enters numbers in
    //and one reference to the output TextView
    private EditText num1, num2;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates references to all the buttons in the activity
        num1 = findViewById(R.id.firstNum);
        num2 = findViewById(R.id.secondNum);
        output = findViewById(R.id.outputText);
        Button addButton = findViewById(R.id.addButton);
        Button subButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        Button powerButton = findViewById(R.id.powerButton);
        Button modButton = findViewById(R.id.moduloButton);
        Button percentButton = findViewById(R.id.percentButton);
        Button clearButton = findViewById(R.id.clearButton);

        //creates a common click listener for all the buttons
        View.OnClickListener commonClickListener = v -> {
            if(v.getId() == R.id.addButton){
                String s1 = num1.getText().toString(); //gets the first number the user enters as a string
                String s2 = num2.getText().toString(); //gets the second number the user enters as a string
                double a = 0, b = 0;
                String result = ""+0.0; //sets the default string result

                if(isValidDouble(s1) && isValidDouble(s2)){ //if both are valid, they are added and the result is converted to a string
                    a = Double.parseDouble(s1);
                    b = Double.parseDouble(s2);
                    result = String.valueOf(a + b);
                } else if (s1.isEmpty()) { //displays an error message if there is no first input
                    Toast.makeText(MainActivity.this, "Please enter an input in the first space provided", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) { //displays an error message if there is no second input
                    Toast.makeText(MainActivity.this, "Please enter an input in the second space provided", Toast.LENGTH_SHORT).show();
                } else{ //displays an error message if either input is invalid
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }

                output.setText(result); //shows the result in the output TextView
            }
            if(v.getId() == R.id.subtractButton){
                String s1 = num1.getText().toString(); //gets the first number the user enters as a string
                String s2 = num2.getText().toString(); //gets the second number the user enters as a string
                double a = 0, b = 0;
                String result = ""+0.0; //sets the default string result

                if(isValidDouble(s1) && isValidDouble(s2)){ //if both are valid, perform subtraction and the result is converted to a string
                    a = Double.parseDouble(s1);
                    b = Double.parseDouble(s2);
                    result = String.valueOf(a - b);
                } else if (s1.isEmpty()) { //displays an error message if there is no first input
                    Toast.makeText(MainActivity.this, "Please enter an input in the first space provided", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) { //displays an error message if there is no second input
                    Toast.makeText(MainActivity.this, "Please enter an input in the second space provided", Toast.LENGTH_SHORT).show();
                } else{ //displays an error message if either input is invalid
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }

                output.setText(result); //shows the result in the output TextView
            }
            if(v.getId() == R.id.multiplyButton){
                String s1 = num1.getText().toString(); //gets the first number the user enters as a string
                String s2 = num2.getText().toString(); //gets the second number the user enters as a string
                double a = 0, b = 0;
                String result = ""+0.0; //sets the default string result

                if(isValidDouble(s1) && isValidDouble(s2)){ //if both are valid, multiply them together and the result is converted to a string
                    a = Double.parseDouble(s1);
                    b = Double.parseDouble(s2);
                    result = String.valueOf(a * b);
                } else if (s1.isEmpty()) { //displays an error message if there is no first input
                    Toast.makeText(MainActivity.this, "Please enter an input in the first space provided", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) { //displays an error message if there is no second input
                    Toast.makeText(MainActivity.this, "Please enter an input in the second space provided", Toast.LENGTH_SHORT).show();
                } else{ //displays an error message if either input is invalid
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }

                output.setText(result); //shows the result in the output TextView
            }
            if(v.getId() == R.id.divideButton){
                String s1 = num1.getText().toString(); //gets the first number the user enters as a string
                String s2 = num2.getText().toString(); //gets the second number the user enters as a string
                double a = 0, b = 0;
                String result = ""+0.0; //sets the default string result

                if(isValidDouble(s1) && isValidDouble(s2)){
                    if(Double.parseDouble(s2) != 0){ //if both are valid and not zero, perform division and the result is converted to a string
                        a = Double.parseDouble(s1);
                        b = Double.parseDouble(s2);
                        result = String.valueOf(a / b);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Second number cannot be zero", Toast.LENGTH_SHORT).show();
                    }
                } else if (s1.isEmpty()) { //displays an error message if there is no first input
                    Toast.makeText(MainActivity.this, "Please enter an input in the first space provided", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) { //displays an error message if there is no second input
                    Toast.makeText(MainActivity.this, "Please enter an input in the second space provided", Toast.LENGTH_SHORT).show();
                } else{ //displays an error message if either input is invalid
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }

                output.setText(result);
            }
            if(v.getId() == R.id.moduloButton){
                String s1 = num1.getText().toString(); //gets the first number the user enters as a string
                String s2 = num2.getText().toString(); //gets the second number the user enters as a string
                double a = 0, b = 0;
                String result = ""+0.0; //sets the default string result

                if(isValidDouble(s1) && isValidDouble(s2)){
                    if(Double.parseDouble(s2) != 0){ //if both are valid and not zero, perform modulo and the result is converted to a string
                        a = Double.parseDouble(s1);
                        b = Double.parseDouble(s2);
                        result = String.valueOf(a % b);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Second number cannot be zero", Toast.LENGTH_SHORT).show();
                    }
                } else if (s1.isEmpty()) { //displays an error message if there is no first input
                    Toast.makeText(MainActivity.this, "Please enter an input in the first space provided", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) { //displays an error message if there is no second input
                    Toast.makeText(MainActivity.this, "Please enter an input in the second space provided", Toast.LENGTH_SHORT).show();
                } else{ //displays an error message if either input is invalid
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }

                output.setText(result);
            }
            if(v.getId() == R.id.percentButton){
                String s1 = num1.getText().toString(); //gets the first number the user enters as a string
                String s2 = num2.getText().toString(); //gets the second number the user enters as a string
                double a = 0, b = 0;
                String result = ""+0.0; //sets the default string result

                if(isValidDouble(s1) && isValidDouble(s2)){
                    if(Double.parseDouble(s2) != 0){ //if both are valid and not zero, perform division and multiply the result by 100 and the result is converted to a string
                        a = Double.parseDouble(s1);
                        b = Double.parseDouble(s2);
                        result = String.valueOf((a / b)*100);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Second number cannot be zero", Toast.LENGTH_SHORT).show();
                    }
                } else if (s1.isEmpty()) { //displays an error message if there is no first input
                    Toast.makeText(MainActivity.this, "Please enter an input in the first space provided", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) { //displays an error message if there is no second input
                    Toast.makeText(MainActivity.this, "Please enter an input in the second space provided", Toast.LENGTH_SHORT).show();
                } else{ //displays an error message if either input is invalid
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }

                output.setText(result);
            }
            if(v.getId() == R.id.powerButton){
                String s1 = num1.getText().toString(); //gets the first number the user enters as a string
                String s2 = num2.getText().toString(); //gets the second number the user enters as a string
                double a = 0, b = 0;
                String result = ""+0.0; //sets the default string result

                if(isValidDouble(s1) && isValidDouble(s2)){ //if both are valid, call Math.pow() and the result is converted to a string
                    a = Double.parseDouble(s1);
                    b = Double.parseDouble(s2);
                    result = String.valueOf(Math.pow(a, b));
                } else if (s1.isEmpty()) { //displays an error message if there is no first input
                    Toast.makeText(MainActivity.this, "Please enter an input in the first space provided", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) { //displays an error message if there is no second input
                    Toast.makeText(MainActivity.this, "Please enter an input in the second space provided", Toast.LENGTH_SHORT).show();
                } else{ //displays an error message if either input is invalid
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_SHORT).show();
                }

                output.setText(result); //shows the result in the output TextView
            }
            if(v.getId() == R.id.clearButton){
                //sets the text of both EditText views to empty strings
                num1.setText("");
                num2.setText("");
                output.setText("0.0");
            }
        };
        //sets the common click listener to all the buttons
        addButton.setOnClickListener(commonClickListener);
        subButton.setOnClickListener(commonClickListener);
        multiplyButton.setOnClickListener(commonClickListener);
        divideButton.setOnClickListener(commonClickListener);
        modButton.setOnClickListener(commonClickListener);
        percentButton.setOnClickListener(commonClickListener);
        clearButton.setOnClickListener(commonClickListener);
        powerButton.setOnClickListener(commonClickListener);
    }

    //if the string can be parsed to a double, return true, else return false
    protected boolean isValidDouble(String str){
        try{
            Double.parseDouble(str);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}