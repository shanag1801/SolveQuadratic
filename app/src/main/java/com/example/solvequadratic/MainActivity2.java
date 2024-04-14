package com.example.solvequadratic;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1, tv2;
    Button btn3;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tv1 = (TextView) findViewById(R.id.textView5);
        tv2 = (TextView) findViewById(R.id.textView6);
        btn3 = (Button) findViewById(R.id.button);
        Intent gi = new Intent();
        gi = getIntent();
        int a = gi.getIntExtra("a", 0);
        int b = gi.getIntExtra("b", 0);
        int c = gi.getIntExtra("c", 0);

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            tv1.setText(String.valueOf(root1));
            tv2.setText(String.valueOf(root2));
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            tv1.setText(String.valueOf(root));
            tv2.setText("No solution");
        } else {
            tv1.setText("No solution");
            tv2.setText("No solution");
        }

    }

    public void back(View view) {
    }

}