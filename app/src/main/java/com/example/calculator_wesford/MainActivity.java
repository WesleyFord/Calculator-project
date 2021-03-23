package com.example.calculator_wesford;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button clearEntryBtn;
    private Button clearAllBtn;
    private Button invertBtn;
    private Button decimalBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button zeroBtn;
    private Button addBtn;
    private Button subtractBtn;
    private Button divBtn;
    private Button multBtn;
    private Button equalsBtn;

    private TextView outputTxt;

    private double valueOne;
    private double valueTwo;
    private double solution;

    private boolean completedOperation = false;
    private boolean readyForNextValue = false;
    private boolean hasDecimal = false;

    private String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clearEntryBtn = findViewById(R.id.clearEntryBtn);
        clearAllBtn = findViewById(R.id.clearAllBtn);
        invertBtn = findViewById(R.id.invertBtn);
        decimalBtn = findViewById(R.id.decimalBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        zeroBtn = findViewById(R.id.zeroBtn);
        addBtn = findViewById(R.id.addBtn);
        subtractBtn = findViewById(R.id.subtractBtn);
        divBtn = findViewById(R.id.divBtn);
        multBtn = findViewById(R.id.multBtn);
        equalsBtn = findViewById(R.id.equalsBtn);

        outputTxt = findViewById(R.id.outputText);

        outputTxt.setText("0");

        clearEntryBtn.setOnClickListener(calcClickListener);
        clearAllBtn.setOnClickListener(calcClickListener);
        invertBtn.setOnClickListener(calcClickListener);
        decimalBtn.setOnClickListener(calcClickListener);
        oneBtn.setOnClickListener(calcClickListener);
        twoBtn.setOnClickListener(calcClickListener);
        threeBtn.setOnClickListener(calcClickListener);
        fourBtn.setOnClickListener(calcClickListener);
        fiveBtn.setOnClickListener(calcClickListener);
        sixBtn.setOnClickListener(calcClickListener);
        sevenBtn.setOnClickListener(calcClickListener);
        eightBtn.setOnClickListener(calcClickListener);
        nineBtn.setOnClickListener(calcClickListener);
        zeroBtn.setOnClickListener(calcClickListener);
        addBtn.setOnClickListener(calcClickListener);
        subtractBtn.setOnClickListener(calcClickListener);
        divBtn.setOnClickListener(calcClickListener);
        multBtn.setOnClickListener(calcClickListener);
        equalsBtn.setOnClickListener(calcClickListener);
    }

    private View.OnClickListener calcClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.oneBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("1");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("1");
                    }
                    break;
                case R.id.twoBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("2");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("2");
                    }
                    break;
                case R.id.threeBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("3");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("3");
                    }
                    break;
                case R.id.fourBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("4");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("4");
                    }
                    break;
                case R.id.fiveBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("5");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("5");
                    }
                    break;
                case R.id.sixBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("6");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("6");
                    }
                    break;
                case R.id.sevenBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("7");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("7");
                    }
                    break;
                case R.id.eightBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("8");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("8");
                    }
                    break;
                case R.id.nineBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("9");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("9");
                    }
                    break;
                case R.id.zeroBtn:
                    if ((Double.parseDouble(outputTxt.getText().toString()) == 0 && !hasDecimal) || completedOperation || readyForNextValue) {
                        outputTxt.setText("0");
                        completedOperation = false;
                        readyForNextValue = false;
                    }
                    else {
                        outputTxt.append("0");
                    }
                    break;
                case R.id.addBtn:
                    valueOne = Double.parseDouble(outputTxt.getText().toString());
                    operation = "add";
                    readyForNextValue = true;
                    break;
                case R.id.subtractBtn:
                    valueOne = Double.parseDouble(outputTxt.getText().toString());
                    operation = "subtract";
                    readyForNextValue = true;
                    break;
                case R.id.multBtn:
                    valueOne = Double.parseDouble(outputTxt.getText().toString());
                    operation = "multiply";
                    readyForNextValue = true;
                    break;
                case R.id.divBtn:
                    valueOne = Double.parseDouble(outputTxt.getText().toString());
                    operation = "divide";
                    readyForNextValue = true;
                    break;
                case R.id.decimalBtn:
                    if (!hasDecimal) {
                        outputTxt.append(".");
                        hasDecimal = true;
                    }
                    break;
                case R.id.invertBtn:
                    if (outputTxt.getText().toString().charAt(0) == '-') {
                        outputTxt.setText(outputTxt.getText().toString().substring(1));
                    }
                    else {
                        outputTxt.setText("-" + outputTxt.getText().toString());
                    }
                    break;
                case R.id.equalsBtn:
                    valueTwo = Double.parseDouble(outputTxt.getText().toString());
                    switch (operation) {
                        case "add":
                            solution = valueOne + valueTwo;
                            if (solution == (int) solution) {
                                outputTxt.setText(String.format("%d", (int) solution));
                            }
                            else {
                                outputTxt.setText(String.format("%s", solution));
                            }
                            break;
                        case "subtract":
                            solution = valueOne - valueTwo;
                            if (solution == (int) solution) {
                                outputTxt.setText(String.format("%d", (int) solution));
                            }
                            else {
                                outputTxt.setText(String.format("%s", solution));
                            }
                            break;
                        case "multiply":
                            solution = valueOne * valueTwo;
                            if (solution == (int) solution) {
                                outputTxt.setText(String.format("%d", (int) solution));
                            }
                            else {
                                outputTxt.setText(String.format("%s", solution));
                            }
                            break;
                        case "divide":
                            if (valueTwo == 0) {
                                outputTxt.setText("Err");
                            }
                            else {
                                solution = valueOne / valueTwo;
                                if (solution == (int) solution) {
                                    outputTxt.setText(String.format("%d", (int) solution));
                                }
                                else {
                                    outputTxt.setText(String.format("%s", solution));
                                }
                            }
                            break;
                        default:
                            solution = Double.parseDouble(outputTxt.getText().toString());
                            if (solution == (int) solution) {
                                outputTxt.setText(String.format("%d", (int) solution));
                            }
                            else {
                                outputTxt.setText(String.format("%s", solution));
                            }
                            break;
                    }
                    completedOperation = true;
                    readyForNextValue =false;
                    operation = "";
                    break;
                case R.id.clearEntryBtn:
                    outputTxt.setText("0");
                    hasDecimal = false;
                    break;
                case R.id.clearAllBtn:
                    outputTxt.setText("0");
                    valueOne = 0;
                    readyForNextValue =false;
                    completedOperation = false;
                    hasDecimal = false;
                    break;
            }
        }
    };

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("outputTxt", outputTxt.getText().toString());
        outState.putString("operation", operation);
        outState.putDouble("valueOne", valueOne);
        outState.putDouble("valueTwo", valueTwo);
        outState.putBoolean("hasDecimal", hasDecimal);
        outState.putBoolean("completedOperation", completedOperation);
        outState.putBoolean("readyForNextValue", readyForNextValue);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        outputTxt.setText(savedInstanceState.getString("outputTxt"));
        operation = savedInstanceState.getString("operation", operation);
        valueOne = savedInstanceState.getDouble("valueOne", valueOne);
        valueTwo = savedInstanceState.getDouble("valueTwo", valueTwo);
        hasDecimal = savedInstanceState.getBoolean("hasDecimal", hasDecimal);
        completedOperation = savedInstanceState.getBoolean("completedOperation", completedOperation);
        readyForNextValue = savedInstanceState.getBoolean("readyForNextValue", readyForNextValue);
    }
}