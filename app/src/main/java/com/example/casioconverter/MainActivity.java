package com.example.casioconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Thank You for using my App", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int dollar = Integer.parseInt(s);
                double inr = 74.17*dollar;
                textView.setText("The Value of "+dollar+"$"+" in INR is: "+inr+"(inr)");

            }
       });
    }

    public void calc(View view){
        String s = editText.getText().toString();
        int dollar = Integer.parseInt(s);
        double inr = 74.17*dollar;
        textView.setText("The Value of "+dollar+"$"+" in INR is: "+inr+"(₹)");
        Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
    }
}

