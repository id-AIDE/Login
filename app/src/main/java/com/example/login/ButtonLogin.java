package com.example.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonLogin extends AppCompatActivity implements
        View.OnClickListener {
    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_login);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);
    }
    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
        }
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
