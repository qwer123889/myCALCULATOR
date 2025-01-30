package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
     boolean isFirstTextactive;



    protected void onCreate(Bundle savedInstanceState) {
        final Button addButton,subtractButton,multiplyButton,divideButton,sqrtButton,
                     button_0, button_1,button_2,button3,button4,button5,button6,button7,button8,button9;

        final EditText num1EditText,num2EditText;
        final TextView resultTextView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          addButton = findViewById(R.id.addButton);
          multiplyButton=findViewById(R.id.multiplyButton);
          divideButton=findViewById(R.id.divideButton);
          sqrtButton=findViewById(R.id.sqrtButton);
          subtractButton=findViewById(R.id.subtractButton);
          button_0=findViewById(R.id.button_0);
          button_1=findViewById(R.id.button_1);
          button_2=findViewById(R.id.button_2);
          button3=findViewById(R.id.button3);
          button4=findViewById(R.id.button4);
          button5=findViewById(R.id.button5);
          button6=findViewById(R.id.button6);
          button7=findViewById(R.id.button7);
          button8=findViewById(R.id.button8);
          button9=findViewById(R.id.button9);
          resultTextView=findViewById(R.id.resultTextView);


        num1EditText=findViewById(R.id.num1EditText);
        num2EditText=findViewById(R.id.num2EditText);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String num1= num1EditText.getText().toString();
            String num2= num2EditText.getText().toString();
            double number_1=Double.parseDouble(num1);
            double number_2=Double.parseDouble(num2);
            double sum= number_1+number_2;
            resultTextView.setText(String.valueOf(sum));

            }
        });
        num1EditText.setOnClickListener(v -> {
            isFirstTextactive = true;
        });
        num2EditText.setOnClickListener(v -> {
            isFirstTextactive = false;
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= num1EditText.getText().toString();
                String num2= num2EditText.getText().toString();
                double number_1=Double.parseDouble(num1);
                double number_2=Double.parseDouble(num2);
                double mult= number_1*number_2;
                resultTextView.setText(String.valueOf(mult));
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= num1EditText.getText().toString();
                String num2= num2EditText.getText().toString();
                double number_1=Double.parseDouble(num1);
                double number_2=Double.parseDouble(num2);
                double divide= number_1/number_2;
                resultTextView.setText(String.valueOf(divide));
            }
        });
        sqrtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= num1EditText.getText().toString();

                double number_1=Double.parseDouble(num1);

                double sqrt= Math.sqrt(number_1);
                resultTextView.setText(String.valueOf(sqrt));
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1= num1EditText.getText().toString();
                String num2= num2EditText.getText().toString();
                double number_1=Double.parseDouble(num1);
                double number_2=Double.parseDouble(num2);
                double subtract= number_1-number_2;
                resultTextView.setText(String.valueOf(subtract));
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText("0");
                } else {
                    num2EditText.setText("0");
                }
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"1");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"1");
                }
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"2");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"2");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"3");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"3");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"4");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"4");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"5");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"5");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"6");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"6");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"7");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"8");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstTextactive) {
                    num1EditText.setText(String.valueOf(num1EditText.getText())+"9");
                } else {
                    num2EditText.setText(String.valueOf(num2EditText.getText())+"9");
                }
            }
        });

        };
    }
