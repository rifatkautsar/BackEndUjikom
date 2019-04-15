package com.example.backendujikom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.List;

public class Peminjaman extends AppCompatActivity {

    EditText editTextname;
    Button button;
    Spinner spinnerpilihan;
    ListView listViewPeminjam;
    DatabaseReference databasePeminjam;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peminjaman);

        databasePeminjam = FirebaseDatabase.getInstance().getReference("Peminjam");

        editTextname = (EditText)findViewById(R.id.edtnama);
        button = (Button)findViewById(R.id.btnkirim);
        spinnerpilihan = (Spinner)findViewById(R.id.spinnerpinjam);
        /*listViewPeminjam = (ListView)findViewById(R.id.ListViewPeminjam);
*/

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPinjaman();

            }
        });
    }

    private void addPinjaman(){
        String name = editTextname.getText().toString().trim();
        String pinjam = spinnerpilihan.getSelectedItem().toString();

        if (!TextUtils.isEmpty(name)){

            String id = databasePeminjam.push().getKey();

           Pinjaman pinjaman = new Pinjaman(id, name, pinjam);

            databasePeminjam.child(name).setValue(name);
            databasePeminjam.child(id).setValue(pinjam);


            Toast.makeText(this, "Barang Telah Di pinjam Silahkan kemablikan jiga Waktu Pinjaman anda Telah berakhir", Toast.LENGTH_LONG).show();

        }else{
           Toast.makeText(this, "Silahkan Masukan Nama Peminjam Terlebih Dahulu", Toast.LENGTH_LONG).show();
        }

    }
}
