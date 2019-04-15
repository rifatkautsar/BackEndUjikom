package com.example.backendujikom;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

        private ImageButton button;
        private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;
        // zzz
        ImageButton button = (ImageButton)findViewById(R.id.btntambahuser);
        ImageButton button1 = (ImageButton)findViewById(R.id.btnpinjaman);
        ImageButton button2 = (ImageButton)findViewById(R.id.btnbarang);
        ImageButton button3 = (ImageButton)findViewById(R.id.btninventaris);
        ImageButton button4 = (ImageButton)findViewById(R.id.btnSignout);
        mAuth = FirebaseAuth.getInstance();

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
        }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Inventaris.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Barang.class);
                startActivity(intent);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Peminjaman.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TambahUser.class);
                startActivity(intent);
            }
        });







    }
}
