package com.example.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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


//        SharedPreferences sp = getSharedPreferences("username", MODE_PRIVATE);
//        String nama = sp.getString("login","");
//        if ((nama.equals("sukses"))&&(nama!=null)){
//            startActivity(new Intent(getApplicationContext(), ButtonLogin.class));
//        }

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

                SharedPreferences sp = getSharedPreferences("username", MODE_PRIVATE);
                SharedPreferences.Editor ed = sp.edit();
                ed.putString("nama", nama);
                ed.putString("pasw", pasw);
                ed.commit();

            }
            else
                Toast.makeText(getApplicationContext(),"login anda salah", Toast.LENGTH_SHORT).show();
        }

    }
}

