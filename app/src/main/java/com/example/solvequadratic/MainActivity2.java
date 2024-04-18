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
    double root1, root2;
    int a, b, c;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = findViewById(R.id.textView5);
        tv2 = findViewById(R.id.textView6);
        btn3 =  findViewById(R.id.button);
        Bundle gi = getIntent().getExtras();
        if(gi != null){
            a = gi.getInt("a");
            b = gi.getInt("b");
            c = gi.getInt("c");
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            tv1.setText(String.valueOf(root1));
            tv2.setText(String.valueOf(root2));
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            tv1.setText(String.valueOf(root1));
            tv2.setText("No solution");
        } else {
            tv1.setText("No solution");
            tv2.setText("No solution");
        }

    }

    public void back(View view) {
        Intent gi = new Intent(this, MainActivity.class);
        gi.putExtra("root1", root1);
        gi.putExtra("root2", root2);
        startActivity(gi);
    }

}