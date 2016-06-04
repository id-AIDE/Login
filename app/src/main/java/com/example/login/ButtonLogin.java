package com.example.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonLogin extends AppCompatActivity implements
        View.OnClickListener {
    Button keluar, tampilkan;
    TextView username, password;
String nama, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_login);

        SharedPreferences sp = getSharedPreferences("username", MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();

        nama = sp.getString("nama", "");
        pass = sp.getString("pasw", "");

        username = (TextView) findViewById(R.id.user);
                username.setText(nama);
        password = (TextView) findViewById(R.id.pw);
                password.setText(pass);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);
        tampilkan = (Button) findViewById(R.id.tampilkan);
        tampilkan.setOnClickListener(this);
    }
    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
            case R.id.tampilkan:
                tampilan();
                break;
        }
    }

    private void tampilan() {
        Toast.makeText(getApplicationContext(), nama, Toast.LENGTH_SHORT ).show();
        username.setText(nama);
    }
    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-Benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                com.example.login.ButtonLogin.this.finish();
                            }
                        })
                .setNegativeButton("Tidak", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int arg1) {
// TODO Auto-generated method stub
                                dialog.cancel();
                            }
                        }).show();
                        }
    }
