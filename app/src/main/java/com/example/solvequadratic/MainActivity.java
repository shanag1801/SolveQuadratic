package com.example.solvequadratic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    Button btn, btn2;
    TextView tv10;
    int a, b, c;
    Random rnd = new Random();
    Intent si;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        tv10 = findViewById(R.id.textView10);
        si = getIntent();
        double root1 = si.getDoubleExtra("root1", 1);
        double root2 = si.getDoubleExtra("root2", 1);
        tv10.setText("The solution/s are: " + root1 + ", " + root2);

    }

    public int a() {
        return Integer.parseInt(et1.getText().toString());
    }

    public int b() {
        return Integer.parseInt(et2.getText().toString());
    }

    public int c() {
        return Integer.parseInt(et3.getText().toString());
    }

    public void solve(View view) {
        a = a();
        b = b();
        c = c();
        si = new Intent(this, MainActivity.class);
        si.putExtra("a", a);
        si.putExtra("b", b);
        si.putExtra("c", c);
        startActivityForResult(si, 0);

    }

    public void random(View view) {
        et1.setText(rnd.nextInt());
        et2.setText(rnd.nextInt());
        et3.setText(rnd.nextInt());
    }
}