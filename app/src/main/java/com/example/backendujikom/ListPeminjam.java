package com.example.backendujikom;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListPeminjam extends ArrayAdapter<Pinjaman> {

    private Activity context;
    private List<Pinjaman> pinjamanList;


    public ListPeminjam(Activity context, List<Pinjaman> pinjamanList){


        super(context, R.layout.list_layout, pinjamanList);
        this.context = context;
        this.pinjamanList = pinjamanList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View ListViewItem = inflater.inflate(R.layout.list_layout, null, true);

        TextView textViewNamaPeminjam = (TextView) ListViewItem.findViewById(R.id.textViewName);
        TextView textViewBarangPinjaman = (TextView) ListViewItem.findViewById(R.id.textViewName2);

        Pinjaman pinjaman = pinjamanList.get(position);

        textViewNamaPeminjam.setText(pinjaman.getNamapeminjam());
        textViewBarangPinjaman.setText(pinjaman.getBarangpeminjam());

        return ListViewItem;

    }
}

