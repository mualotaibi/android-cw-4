package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gradecalculator.R;

public class MainActivity extends AppCompatActivity {
    EditText x;
    EditText y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText x = findViewById(R.id.height);
        final EditText y = findViewById(R.id.weight);
        Button cal = findViewById(R.id.button2);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //الدالة
                // BMI = W/(h+h) +1000

                String heightString = x.getText().toString();
                double height = Double.parseDouble(heightString);

                String weightString = y.getText().toString();
                double weight = Double.parseDouble(weightString);;

                Double bmi = (weight/  (height*height)) *10000 ;
                System.out.println(bmi);

                Toast.makeText(MainActivity.this,"this is your BMi; "+bmi,Toast.LENGTH_LONG).show();
            }
        });
    }
}