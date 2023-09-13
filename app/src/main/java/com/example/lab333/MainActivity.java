package com.example.lab333;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button) findViewById(R.id.send_b);
        send_text = (EditText) findViewById(R.id.send_t);


        // String str;
        send_button.setOnClickListener( this::onClick);


    }
    private void onClick(View view){
        String str = send_text.getText().toString();
        Intent intent =new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("message_key" , str);
        startActivity(intent);
        //* receiver_msg.setText("Hello  "+ str);
    }
}