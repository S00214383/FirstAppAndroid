package com.example.myapplication;

import static com.example.myapplication.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnPress;
    TextView tvDisplayName;
    EditText etInsertName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        etInsertName = findViewById(R.id.etInsertName);
        tvDisplayName = findViewById(id.tvDisplayName);

        btnPress = findViewById(id.btnPress);
        showMessage(etInsertName);





    }

    public void showMessage(View view){
        tvDisplayName.setText("Hi " + etInsertName.getText());
    }
}