package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sumTV = findViewById(R.id.sumTV);
        String sumText = sumTV.getText().toString();

        Toast.makeText(getBaseContext(), "Welcome", Toast.LENGTH_LONG).show();

        final Button buttonZero = findViewById(R.id.zero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonZero.getText());
                Toast.makeText(getBaseContext(), buttonZero.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonOne = findViewById(R.id.one);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonOne.getText());
                Toast.makeText(getBaseContext(), buttonOne.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonTwo = findViewById(R.id.two);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonTwo.getText());
                Toast.makeText(getBaseContext(), buttonTwo.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonThree = findViewById(R.id.three);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonThree.getText());
                Toast.makeText(getBaseContext(), buttonThree.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonFour = findViewById(R.id.four);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonFour.getText());
                Toast.makeText(getBaseContext(), buttonFour.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonFive = findViewById(R.id.five);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonFive.getText());
                Toast.makeText(getBaseContext(), buttonFive.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonSix = findViewById(R.id.six);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonSix.getText());
                Toast.makeText(getBaseContext(), buttonSix.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonSeven = findViewById(R.id.seven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonSeven.getText());
                Toast.makeText(getBaseContext(), buttonSeven.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonEight = findViewById(R.id.eight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonEight.getText());
                Toast.makeText(getBaseContext(), buttonEight.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonNine = findViewById(R.id.nine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonNine.getText());
                Toast.makeText(getBaseContext(), buttonNine.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonAdd = findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonAdd.getText());
                Toast.makeText(getBaseContext(), buttonAdd.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonMinus = findViewById(R.id.minus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonMinus.getText());
                Toast.makeText(getBaseContext(), buttonMinus.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonEquals = findViewById(R.id.buttonEquals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonEquals.getText());
                Toast.makeText(getBaseContext(), buttonEquals.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonDivide = findViewById(R.id.divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonDivide.getText());
                Toast.makeText(getBaseContext(), buttonDivide.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonMultiply = findViewById(R.id.multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonMultiply.getText());
                Toast.makeText(getBaseContext(), buttonMultiply.getText(), Toast.LENGTH_LONG).show();
            }
        });

        final Button buttonReset = findViewById(R.id.reset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumTV.setText(buttonReset.getText());
                Toast.makeText(getBaseContext(), buttonReset.getText(), Toast.LENGTH_LONG).show();
            }
        });



    }
}
