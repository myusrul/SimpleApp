package com.ciuslo.app.simple.simpleapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button btnRelative, btnConstraint, btnTable, btnScroll, btnLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnConstraint = (Button) findViewById(R.id.btnConstrain);
        btnTable = (Button) findViewById(R.id.btnTable);
        btnScroll = (Button) findViewById(R.id.btnScroll);
        btnLinear = (Button) findViewById(R.id.btnLinear);

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, DetailRelative.class);
                startActivity(pindah);
            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, DetailConstraint.class);
                startActivity(pindah);
            }
        });

        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, TableActivity.class);
                startActivity(pindah);
            }
        });
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, ScrollView.class);
                startActivity(pindah);
            }
        });
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(pindah);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
//        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
//        super.onBackPressed();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Exit")
                .setMessage("Yakin?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })

                .show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
    }
}
