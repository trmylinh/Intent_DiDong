package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1, editTextNumber2;
    Button buttonSend;
    TextView textView1, textView2, textViewKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initwidgets();

        Intent intent = getIntent();
        String a,b;
        a = intent.getStringExtra("N1");
        b = intent.getStringExtra("N2");
        String sum = intent.getStringExtra("KQ");
        textView1.setText(a);
        textView2.setText(b);
        textViewKq.setText("Result: "+String.valueOf(sum));

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1, number2;
                number1 = editTextNumber1.getText().toString();
                number2 = editTextNumber2.getText().toString();

                // khai bao intent
                Intent intent1 = new Intent(MainActivity.this, Screen2.class);

                // push du lieu vao intent
                intent1.putExtra("Number1",number1);
                intent1.putExtra("Number2",number2);
                startActivity(intent1);
            }
        });



    }

    private void Initwidgets() {
        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        buttonSend = (Button) findViewById(R.id.buttonSend);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textViewKq = (TextView) findViewById(R.id.textViewKq);
    }
}