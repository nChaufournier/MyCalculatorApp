package com.example.rednic.mycalculatorapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    TextView topCalcArea;
    TextView calcArea;
    TextView resultsArea;
    //Number Buttons
    Button zeroBtn;
    Button oneBtn;
    Button twoBtn;
    Button threeBtn;
    Button fourBtn;
    Button fiveBtn;
    Button sixBtn;
    Button sevenBtn;
    Button eightBtn;
    Button nineBtn;
    //Operator Buttons
    Button plusBtn;
    Button minusBtn;
    Button divideBtn;
    Button multiplyBtn;
    Button clearButton;
    Button equalBtn;

    String operand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String equation;
        setContentView(R.layout.activity_main);
        //Calculation Areas
        calcArea = (TextView) findViewById(R.id.bottomCalcArea);
        topCalcArea = (TextView) findViewById(R.id.topCalcArea);
        resultsArea = (TextView) findViewById(R.id.result);
        //Links Number Buttons to xml Buttons
        zeroBtn = (Button) findViewById(R.id.zeroBtn);
        oneBtn = (Button) findViewById(R.id.oneBtn);
        twoBtn = (Button) findViewById(R.id.twoBtn);
        threeBtn = (Button) findViewById(R.id.threeBtn);
        fourBtn = (Button) findViewById(R.id.fourBtn);
        fiveBtn = (Button) findViewById(R.id.fiveBtn);
        sixBtn = (Button) findViewById(R.id.sixBtn);
        sevenBtn = (Button) findViewById(R.id.sevenBtn);
        eightBtn = (Button) findViewById(R.id.eightBtn);
        nineBtn = (Button) findViewById(R.id.nineBtn);
        //Links Operand Buttons to xml buttons
        plusBtn = (Button) findViewById(R.id.plusBtn);
        clearButton = (Button) findViewById(R.id.clearBtn);
        equalBtn = (Button) findViewById(R.id.equalButton);
        minusBtn = (Button) findViewById(R.id.minusBtn);

        //All the onClickListeners for the buttons
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                calcArea.setText(nums + "0");

            }
        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("1");
                }else{
                    calcArea.setText(nums+"1");
                }
                Toast toast = Toast.makeText(getApplicationContext(), calcArea.getText(), Toast.LENGTH_LONG);
                toast.show();
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("2");
                }else{
                    calcArea.setText(nums+"2");
                }
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("3");
                }else{
                    calcArea.setText(nums+"3");
                }
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("4");
                }else{
                    calcArea.setText(nums+"4");
                }
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("5");
                }else{
                    calcArea.setText(nums+"5");
                }

            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("6");
                }else{
                    calcArea.setText(nums+"6");
                }

            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("7");
                }else{
                    calcArea.setText(nums+"7");
                }

            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("8");
                }else{
                    calcArea.setText(nums+"8");
                }

            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nums = Integer.parseInt(calcArea.getText().toString());
                if(nums == 0){
                    calcArea.setText("9");
                }else{
                    calcArea.setText(nums+"9");
                }

            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int top, bottom, ans;

                if(topCalcArea.getText().toString().equals("0")){
                    topCalcArea.setText(calcArea.getText());
                    calcArea.setText("0");
                    operand= "add";
                }else{
                    top = Integer.parseInt(topCalcArea.getText().toString());
                    bottom =Integer.parseInt(calcArea.getText().toString());
                    operand = "add";
                    ans = top + bottom;
                    //comment for git
                    resultsArea.setText("The answer is "+ans);
                    //resultsArea.setVisibility(View.VISIBLE);
                    Toast toast = Toast.makeText(getApplicationContext(), "The Answer is " + ans, Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "The operand is "+operand, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answer;
                int top = Integer.parseInt(topCalcArea.getText().toString());
                int bottom =Integer.parseInt(calcArea.getText().toString());
                if(operand.equals("add")){
                    answer = top+bottom;

                    resultsArea.setText(answer);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Didnt Work again", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcArea.setText("0");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toast = Toast.makeText(this, "Does this work?", Toast.LENGTH_LONG);
            toast.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}