package com.example.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText user,pass;

    String pasw ;
    String nama;
    String namaku ="feet";
    String pssw ="android";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
        Button submit = (Button)findViewById(R.id.ButtonLogin);
        submit.setOnClickListener(new click());
    }
    class click implements Button.OnClickListener{

        public void onClick(View v)
        {
            nama = user.getText().toString();
            pasw = pass.getText().toString();
            if((pasw.equals("android"))&&(nama.equals("feet")))
            {
                Toast.makeText(getApplicationContext(),"selamat datang", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), ButtonLogin.class));
            }
            else
                Toast.makeText(getApplicationContext(),"login anda salah", Toast.LENGTH_SHORT).show();
        }

    }
}

