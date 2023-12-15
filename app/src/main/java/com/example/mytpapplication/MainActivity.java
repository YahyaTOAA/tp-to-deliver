package com.example.mytpapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytpapplication.R;

public class MainActivity extends AppCompatActivity {
    double result = 0;
    EditText ed1;
    EditText ed2;
    TextView tv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            result = savedInstanceState.getInt("result");
            tv.setText(String.valueOf(result));
        }
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        ed1 = findViewById(R.id.edittext1);
        ed2 = findViewById(R.id.edittext2);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textview1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Resulta est : " + multiplication());
            }
        });
    }
    public Double multiplication(){
        String number1String = ed1.getText().toString();
        String number2String = ed2.getText().toString();

        double number1 = Double.parseDouble(number1String);
        double number2 = Double.parseDouble(number2String);
        double result = number1 * number2;

        return result;
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putDouble("result", result);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        result = savedInstanceState.getDouble("result");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();

    }
}