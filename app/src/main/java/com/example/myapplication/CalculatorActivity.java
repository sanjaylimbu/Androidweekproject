package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btndot, btnAdd, btnSub, btnDiv,
            btnMul,btnR, btnE;
    EditText txtScreen;

    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnAdd = (Button) findViewById(R.id.btnadd);
        btnSub = (Button) findViewById(R.id.btnsub);
        btnMul = (Button) findViewById(R.id.btnmul);
        btnDiv = (Button) findViewById(R.id.btndiv);
        btnR = (Button) findViewById(R.id.btnR);
        btnE = (Button) findViewById(R.id.btne);
        btndot = findViewById(R.id.btndot);

        txtScreen = (EditText) findViewById(R.id.txtScreen);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btndot.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn0)
        {
            txtScreen.setText(txtScreen.getText()+"0");

        }
        if(v.getId()==R.id.btn1)
        {
            txtScreen.setText(txtScreen.getText()+"1");

        }
        if(v.getId()==R.id.btn2)
        {
            txtScreen.setText(txtScreen.getText()+"2");

        }
        if(v.getId()==R.id.btn3)
        {
            txtScreen.setText(txtScreen.getText()+"3");

        }
        if(v.getId()==R.id.btn4)
        {
            txtScreen.setText(txtScreen.getText()+"4");

        }
        if(v.getId()==R.id.btn5)
        {
            txtScreen.setText(txtScreen.getText()+"5");

        }
        if(v.getId()==R.id.btn6)
        {
            txtScreen.setText(txtScreen.getText()+"6");

        }
        if(v.getId()==R.id.btn7)
        {
            txtScreen.setText(txtScreen.getText()+"7");

        }
        if(v.getId()==R.id.btn8)
        {
            txtScreen.setText(txtScreen.getText()+"8");

        }
        if(v.getId()==R.id.btn9)
        {
            txtScreen.setText(txtScreen.getText()+"9");

        }
        if(v.getId()==R.id.btndot)
        {
            txtScreen.setText(txtScreen.getText()+".");

        }
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtScreen == null){
                    txtScreen.setText("");
                }else {
                    Value1 = Float.parseFloat(txtScreen.getText() + "");
                    mAddition = true;
                    txtScreen.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(txtScreen.getText() + "");
                mSubtract = true ;
                txtScreen.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(txtScreen.getText() + "");
                mMultiplication = true ;
                txtScreen.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(txtScreen.getText()+"");
                mDivision = true ;
                txtScreen.setText(null);
            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(txtScreen.getText() + "");

                if (mAddition == true){

                    txtScreen.setText(Value1 + Value2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    txtScreen.setText(Value1 - Value2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    txtScreen.setText(Value1 * Value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    txtScreen.setText(Value1 / Value2+"");
                    mDivision=false;
                }
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("");
            }
        });
    }
}




