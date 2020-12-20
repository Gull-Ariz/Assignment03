package com.example.assignmentnavigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class calculator_activity extends AppCompatActivity {

    private EditText input, output;
    private double value1 ;
    private double value2;
    private boolean add = false;
    private boolean sub = false;
    private boolean mul = false;
    private boolean div = false;
    private boolean val1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_activity);
        getValues();
    }

    private void getValues()
    {
        input = (EditText) findViewById(R.id.input);
        output = (EditText) findViewById(R.id.output);
    }

    public void showcharacter(View view)
    {
        switch (view.getId())
        {
            case R.id.btn0:
                input.setText(input.getText() + "0");
                break;
            case R.id.btn1:
                input.setText(input.getText() + "1");
                break;
            case R.id.btn2:
                input.setText(input.getText() + "2");
                break;
            case R.id.btn3:
                input.setText(input.getText() + "3");
                break;
            case R.id.btn4:
                input.setText(input.getText() + "4");
                break;
            case R.id.btn5:
                input.setText(input.getText() + "5");
                break;
            case R.id.btn6:
                input.setText(input.getText() + "6");
                break;
            case R.id.btn7:
                input.setText(input.getText() + "7");
                break;
            case R.id.btn8:
                input.setText(input.getText() + "8");
                break;
            case R.id.btn9:
                input.setText(input.getText() + "9");
                break;
            case R.id.point:
                input.setText(input.getText() + ".");
                break;
        }
    }

    public void clearAll(View view) {
        input.setText("");
        output.setText("");
    }

    public void clearOne(View view) {
        String process = input.getText().toString();
        process = process.substring(0,(process.length()-1));
        input.setText(process);
    }

    public void showResult(View view) {

        value2 = Double.parseDouble(input.getText() + "");
        if (add == true) {
            output.setText((value1 + value2) + "");
            add = false;
        }
        if (sub == true) {
            output.setText((value1 - value2) + "");
            sub = false;
        }
        if (mul == true) {
            output.setText((value1 * value2) + "");
            mul = false;
        }
        if (div == true) {
            output.setText((value1 / value2) + "");
            div = false;
        }
    }

    public void operator(View view)
    {
        if(input == null || input.toString() == "")
        {
            input.setText("");
        }
        else
        {
            value1 = Double.parseDouble(input.getText()+"");
            switch (view.getId())
            {
                case R.id.plus:
                    add = true;
                    input.setText(null);
                    break;
                case R.id.minus:
                    sub = true;
                    input.setText(null);
                    break;
                case R.id.mul:
                    mul = true;
                    input.setText(null);
                    break;
                case R.id.divide:
                    div = true;
                    input.setText(null);
                    break;
            }
        }
    }
}