package com.example.backendujikom;

public class Pinjaman {

    String peminjamId;
    String namapeminjam;
    String barangpeminjam;

    public Pinjaman(){

    }

    public Pinjaman(String peminjamId, String namapeminjam, String barangpeminjam) {
        this.peminjamId = peminjamId;
        this.namapeminjam = namapeminjam;
        this.barangpeminjam = barangpeminjam;
    }

    public String getPeminjamId() {
        return peminjamId;
    }

    public String getNamapeminjam() {
        return namapeminjam;
    }

    public String getBarangpeminjam() {
        return barangpeminjam;
    }
}
