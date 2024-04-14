package com.example.solvequadratic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    Button btn, btn2;
    int a, b, c;
    Random rnd = new Random();

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        btn = (Button) findViewById(R.id.btn);
        btn2 = (Button) findViewById(R.id.btn2);
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
        Intent si = new Intent(this, MainActivity.class);
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