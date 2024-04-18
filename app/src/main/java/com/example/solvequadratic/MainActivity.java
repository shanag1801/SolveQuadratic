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
    Random rnd = new Random();
    Intent si;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        tv10 = findViewById(R.id.textView10);
    }
    @SuppressLint("SetTextI18n")
    protected void onResume(){
        super.onResume();
        Bundle i = getIntent().getExtras();
        if(i != null){
            double root1 = i.getDouble("root1");
            double root2 = i.getDouble("root2");
            tv10.setText("The solution/s are: " + root1 + ", " + root2);
        }
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
        si = new Intent(this, MainActivity2.class);
        si.putExtra("a", a());
        si.putExtra("b", b());
        si.putExtra("c", c());
        startActivity(si);
    }

    public void random(View view) {
        et1.setText(String.valueOf(rnd.nextInt(10)));
        et2.setText(String.valueOf(rnd.nextInt(10)));
        et3.setText(String.valueOf(rnd.nextInt(10)));
    }
}